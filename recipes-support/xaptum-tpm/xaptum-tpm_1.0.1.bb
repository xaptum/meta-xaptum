SUMMARY = "Utilities for interacting with a TPM2.0 used for access to the Xaptum ENF"
HOMEPAGE = "https://github.com/xaptum/xaptum-tpm"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = "libtss2"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "adb6e6ba5b7f321bdb44cd7f6e16ba93"
SRC_URI[sha256sum] = "6bc58e8a674c9ba57d5da1b282d4a03ffb9b0d30a80164d759330979bad64655"

EXTRA_OECMAKE = "-DBUILD_TESTING=off"

inherit cmake
