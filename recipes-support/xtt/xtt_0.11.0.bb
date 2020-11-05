SUMMARY = "XTT provisioning protocol for IoT devices"
HOMEPAGE = "https://github.com/xaptum/xtt"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "ecdaa libsodium openssl"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b943b1fd771b7593a069898e3277b9e"
SRC_URI[sha256sum] = "5847f733fde417d7f9c285d4a5498777443784355fe4acb3afcab883c194c6e2"

EXTRA_OECMAKE = "-DBUILD_TOOL=off -DBUILD_TESTING=off"

inherit cmake
