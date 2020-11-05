SUMMARY = "Apache Milagro Crypto Library for Pairing-based Crypto"
HOMEPAGE = "https://github.com/xaptum/amcl"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4df9a00f101bbd367c3bc93d2eced6b"

SRC_URI = "https://github.com/xaptum/${PN}/archive/${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "88665f37ef69fea989649d06bc820bc2"
SRC_URI[sha256sum] = "d32c3a10f04db797c6ad863ecac998228ff281b482b4daa936ff80b0e824396c"

EXTRA_OECMAKE = "-DAMCL_INCLUDE_SUBDIR=amcl"

inherit cmake
