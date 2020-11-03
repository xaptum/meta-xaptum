FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://ax_is_release.m4 \
            file://0001-configure-patch-ax_is_release-usage.patch \
            file://0001-configure-disable-ax_valgrind_dflt-checks.patch"

python do_unpack_append() {
    bb.build.exec_func('create_version', d)
}

create_version() {
    cd ${S}
    git describe --tags --always --dirty > VERSION
}

do_configure_prepend () {
    cp ${WORKDIR}/ax_is_release.m4 ${S}/
}
