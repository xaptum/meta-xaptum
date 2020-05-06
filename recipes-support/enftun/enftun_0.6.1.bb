SUMMARY = "Client to connect to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/enftun"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/enftun.c;beginline=1;endline=15;md5=b33ae22bf8b43882e77c8b2a757a8af8"
DEPENDS = "libconfig libuv openssl xtt"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "47f25630992b5f59593dc808756415f9"
SRC_URI[sha256sum] = "4a85ffa6d13d4ba99b14101bb949921bf8a05cc81ee56269330af78bfaea30ba"

FILESEXTRAPATHS_prepend += "${THISDIR}/files:"
SRC_URI += "file://init.d/enftun"
SRC_URI += "file://multitech-example-config.patch"

EXTRA_OECMAKE = "-DCHECK_FORMAT=off -DBUILD_TEST=off -DBUILD_SYSTEMD=off"

inherit cmake

do_install_append() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/init.d/enftun ${D}${sysconfdir}/init.d/
}

FILES_${PN} += "${sysconfdir}/init.d/enftun"
