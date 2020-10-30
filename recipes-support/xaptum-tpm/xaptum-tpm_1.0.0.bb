SUMMARY = "Utilities for interacting with a TPM2.0 used for access to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/xaptum-tpm"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "libtss2"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "ed923a29703b8f9857876892ade7e6a6"
SRC_URI[sha256sum] = "20ef10d952f6c3933c7e05c0a0f9f60d32a562fc8ade1884a0ec753a13d21a36"

EXTRA_OECMAKE = "-DBUILD_TESTING=off"

inherit cmake
