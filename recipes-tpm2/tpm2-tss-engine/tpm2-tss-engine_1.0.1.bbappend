LIC_FILES_CHKSUM = "file://LICENSE;md5=7b3ab643b9ce041de515d1ed092a36d4"

SRCREV = "ae070caf92b308ae81d63083784b0ca52222d748"
SRC_URI = "git://github.com/tpm2-software/tpm2-tss-engine.git;branch=master"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-configure-disable-unsupported-checks.patch"

FILES_${PN}-dev = "${libdir}/engines/tpm2tss.so ${includedir}/*"
FILES_${PN}-engines = "${libdir}/engines/lib*.so*"
FILES_${PN}-engines-staticdev = "${libdir}/engines/libtpm2tss.a"
FILES_${PN}-bash-completion += "${datadir}/bash-completion/completions"
