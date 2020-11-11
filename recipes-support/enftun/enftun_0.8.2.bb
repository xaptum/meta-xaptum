SUMMARY = "Client to connect to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/enftun"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/enftun.c;beginline=1;endline=15;md5=b33ae22bf8b43882e77c8b2a757a8af8"
DEPENDS = "libconfig libuv openssl xaptum-tpm xtt"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c89620e41413ee1c0056a69dfb06154b"
SRC_URI[sha256sum] = "2b387d052d989824fb589c616dbb2a601dd6296b2c0493d50199845fcff01956"

FILESEXTRAPATHS_prepend += "${THISDIR}/files:"
SRC_URI += "file://init.d/enftun"
SRC_URI += "file://multitech-example-config.patch"

EXTRA_OECMAKE = "-DCHECK_FORMAT=off -DBUILD_TEST=off -DBUILD_SYSTEMD=off -DBUILD_KEYGEN=off"

inherit cmake

do_install_append() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/init.d/enftun ${D}${sysconfdir}/init.d/
}

FILES_${PN} += "${sysconfdir}/init.d/enftun"

RDEPENDS_${PN} = "bash tpm2-tss-engine-engines"
