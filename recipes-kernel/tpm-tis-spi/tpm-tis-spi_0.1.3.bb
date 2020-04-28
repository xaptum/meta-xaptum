SUMMARY = "Patched version of the TPM SPI driver for the 4.9 kernel"
DESCRIPTION="TPM SPI driver for the 4.9 kernel with backported patches to make it work."
SECTION = "networking"
HOMEPAGE = "https://www.xaptum.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://tpm.h;beginline=1;endline=21;md5=0d59c79eafc6ec9450b633d1636906c1"
PR = "r0"

inherit module

SRC_URI = "https://github.com/xaptum/xapea00x/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "ea533c7b549ca29546b70e778800df94"
SRC_URI[sha256sum] = "6c67de24641b3fbef0c7645f1f63b5b7bd052af82ebb2ceea1f8a338b4d4c391"

S = "${WORKDIR}/xapea00x-${PV}/tpm_tis_spi"

DEPENDS = "virtual/kernel"

# # This module requires Linux 4.9 or higher.
EXTRA_OEMAKE_append = " \
                       KDIR=${STAGING_KERNEL_DIR} \
                      "

MODULE_NAME = "tpm_tis_spi"
KERNEL_MODULE_PACKAGE_PREFIX = "backports-"

PACKAGES = "backports-kernel-module-${PN}"
FILES_kernel-module-${PN} = "${base_libdir}/modules/${KERNEL_VERSION}/extra/${MODULE_NAME}.ko"

fakeroot do_install() {
    install -m 0755 -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
    cp ${S}/${MODULE_NAME}.ko ${D}/${base_libdir}/modules/${KERNEL_VERSION}/extra
}
