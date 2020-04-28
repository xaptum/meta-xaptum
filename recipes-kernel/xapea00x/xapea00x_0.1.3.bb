SUMMARY = "XAP-EA-00x is the driver for the Xaptum ENF Access Cards"
DESCRIPTION="The Xaptum ENF is a secure overlay network that isolates \
IoT devices from threats on the public Internet."
SECTION = "networking"
HOMEPAGE = "https://www.xaptum.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://xapea00x.h;beginline=1;endline=19;md5=2c1a72d4050851a905cb06cb84109f4e"
PR = "r0"

inherit module

SRC_URI = "https://github.com/xaptum/xapea00x/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "ea533c7b549ca29546b70e778800df94"
SRC_URI[sha256sum] = "6c67de24641b3fbef0c7645f1f63b5b7bd052af82ebb2ceea1f8a338b4d4c391"

S = "${WORKDIR}/${PN}-${PV}"

DEPENDS = "virtual/kernel"

# # This module requires Linux 4.9 or higher.
EXTRA_OEMAKE_append = " \
                       KDIR=${STAGING_KERNEL_DIR} \
                      "

MODULE_NAME = "xapea00x"

PACKAGES = "kernel-module-${PN}"
FILES_kernel-module-${PN} = "${base_libdir}/modules/${KERNEL_VERSION}/extra/${MODULE_NAME}.ko"

fakeroot do_install() {
    install -m 0755 -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
    cp ${S}/${MODULE_NAME}.ko ${D}/${base_libdir}/modules/${KERNEL_VERSION}/extra
}
