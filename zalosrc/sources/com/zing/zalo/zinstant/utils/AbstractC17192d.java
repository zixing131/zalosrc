package com.zing.zalo.zinstant.utils;

import android.widget.ImageView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;

/* renamed from: com.zing.zalo.zinstant.utils.d */
/* loaded from: classes7.dex */
public abstract class AbstractC17192d {

    /* renamed from: a */
    private static final ArrayList f87754a;

    static {
        ArrayList arrayList = new ArrayList();
        f87754a = arrayList;
        arrayList.add(120);
        arrayList.add(160);
        arrayList.add(230);
        arrayList.add(240);
        arrayList.add(260);
        arrayList.add(320);
        arrayList.add(360);
        arrayList.add(480);
        arrayList.add(640);
        arrayList.add(720);
        arrayList.add(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
        arrayList.add(960);
        arrayList.add(1024);
        arrayList.add(1120);
        arrayList.add(1160);
        arrayList.add(1230);
        arrayList.add(1240);
        arrayList.add(1260);
        arrayList.add(1320);
        arrayList.add(1360);
        arrayList.add(1480);
        arrayList.add(1640);
        arrayList.add(1720);
        arrayList.add(1800);
        arrayList.add(1960);
        arrayList.add(Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA));
    }

    /* renamed from: a */
    public static ImageView.ScaleType m91799a(int i11) {
        if (i11 != 0) {
            if (i11 != 2) {
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: b */
    public static int m91800b(int i11) {
        return m91801c(i11, 0, f87754a.size());
    }

    /* renamed from: c */
    private static int m91801c(int i11, int i12, int i13) {
        if (i11 <= 0) {
            return -1;
        }
        int i14 = i13 - i12;
        int i15 = (i14 / 2) + i12;
        if (i15 == 0) {
            return ((Integer) f87754a.get(i12)).intValue();
        }
        if (i14 != 0 && i14 != 1) {
            int intValue = ((Integer) f87754a.get(i15)).intValue();
            if (intValue == i11) {
                return intValue;
            }
            if (intValue > i11) {
                return m91801c(i11, i12, i15);
            }
            return m91801c(i11, i15, i13);
        }
        return ((Integer) f87754a.get(i12)).intValue();
    }
}
