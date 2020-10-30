SUMMARY = "C library for elliptic curve-based Direct Anonymous Attestation"
HOMEPAGE = "https://github.com/xaptum/ecdaa"
SECTION = "net"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61aefe9f3c35b34d443732d0a55b20f9"
DEPENDS = "amcl xaptum-tpm"

SRC_URI = "https://github.com/xaptum/${PN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "3d4152c980b8ec2a67dec965bc7cad25"
SRC_URI[sha256sum] = "1e0bb0de74eb88e3f3b6209c603ae34f24fbe7760f83f1295491e9ec786b7ea6"

EXTRA_OECMAKE = "-DECDAA_TPM_SUPPORT=on"

inherit cmake
