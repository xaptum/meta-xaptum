SUMMARY = "Utilities for interacting with a TPM2.0 used for access to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/xaptum-tpm"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "7d954d83ebb340f74b5084e4f0ed7aa6"
SRC_URI[sha256sum] = "701943cd0302592756407323c481ba83e76f62af3f676b947171db1b87974606"

EXTRA_OECMAKE = ""

inherit cmake
