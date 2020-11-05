SUMMARY = "Client to connect to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/enftun"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/enftun.c;beginline=1;endline=15;md5=b33ae22bf8b43882e77c8b2a757a8af8"
DEPENDS = "libconfig libuv openssl tpm2-tss-engine xaptum-tpm xtt"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d2d94109ae2130c296874e9b0359784"
SRC_URI[sha256sum] = "408f937f913708c2a85a990e943fdcb84543266ec50e7791578acfa0c6b26df1"

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

RDEPENDS_${PN} = "bash"
