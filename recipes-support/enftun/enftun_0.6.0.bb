SUMMARY = "Client to connect to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/enftun"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/enftun.c;beginline=1;endline=15;md5=b33ae22bf8b43882e77c8b2a757a8af8"
DEPENDS = "libconfig libuv openssl xtt"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "67cff2550840e3c33aef4cf0f9ff649f"
SRC_URI[sha256sum] = "4a957e6f2684247e58cfff44542c130b626a6b33cb1839a9ec5045859d2d4543"

EXTRA_OECMAKE = "-DCHECK_FORMAT=off -DBUILD_TEST=off -DBUILD_SYSTEMD=off"

inherit cmake
