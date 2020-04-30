SUMMARY = "XTT provisioning protocol for IoT devices"
HOMEPAGE = "https://github.com/xaptum/xtt"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "ecdaa libsodium"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "a984dc11946113b7932bfa34d7c00f2f"
SRC_URI[sha256sum] = "8d28bb204efabf54bd23b8d3aeb25334c4f9dc8e7654e739491304733f193949"

EXTRA_OECMAKE = "-DBUILD_TOOL=off -DBUILD_TESTING=off"

inherit cmake
