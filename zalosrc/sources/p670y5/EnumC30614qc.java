package p670y5;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: y5.qc */
/* loaded from: classes2.dex */
public enum EnumC30614qc implements InterfaceC30471j2 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA),
    FORMAT_AZTEC(4096);


    /* renamed from: p */
    private final int f141698p;

    EnumC30614qc(int i11) {
        this.f141698p = i11;
    }

    @Override // p670y5.InterfaceC30471j2
    public final int zza() {
        return this.f141698p;
    }
}
