SUMMARY = "C library for elliptic curve-based Direct Anonymous Attestation"
HOMEPAGE = "https://github.com/xaptum/ecdaa"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61aefe9f3c35b34d443732d0a55b20f9"
DEPENDS = "amcl xaptum-tpm"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "503f55a6c20b4e008c08d819b164de6b"
SRC_URI[sha256sum] = "408cf39ea5fb915afd36a34ed6044f5fa1aa8c63522a6a0c24fa70d7c112e52c"

EXTRA_OECMAKE = "-DECDAA_TPM_SUPPORT=on"

inherit cmake
