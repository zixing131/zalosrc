package com.zing.zalo.gifplayer;

import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Locale;

/* renamed from: com.zing.zalo.gifplayer.c */
/* loaded from: classes4.dex */
public enum EnumC8918c {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(ZAbstractBase.ZVU_BLEND_PERCENTAGE, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(ZAbstractBase.ZVU_BLEND_GEN_THUMB, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind has failed, animation is stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    D_GIF_ERR_EXCEED_SIZE_LIMIT(1006, "Error GIF size exceeds allowed limit"),
    UNKNOWN(-1, "Unknown error");


    /* renamed from: p */
    public final String f47725p;

    /* renamed from: q */
    int f47726q;

    EnumC8918c(int i11, String str) {
        this.f47726q = i11;
        this.f47725p = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static EnumC8918c m47619c(int i11) {
        for (EnumC8918c enumC8918c : values()) {
            if (enumC8918c.f47726q == i11) {
                return enumC8918c;
            }
        }
        EnumC8918c enumC8918c2 = UNKNOWN;
        enumC8918c2.f47726q = i11;
        return enumC8918c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m47620d() {
        return String.format(Locale.US, "GifError %d: %s", Integer.valueOf(this.f47726q), this.f47725p);
    }
}
