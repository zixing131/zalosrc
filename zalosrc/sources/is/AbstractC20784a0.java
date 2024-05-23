package is;

import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: is.a0 */
/* loaded from: classes4.dex */
public abstract class AbstractC20784a0 {
    /* renamed from: a */
    static List m108437a(List list) {
        ArrayList arrayList = new ArrayList();
        if (!m108448l((MediaItem) list.get(0)) && !m108449m((MediaItem) list.get(0))) {
            if (m108450n((MediaItem) list.get(0))) {
                arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 105.33333333333333d, 212.66666666666666d, 0.0d));
                arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 105.33333333333333d, 107.33333333333333d));
                arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
                arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 212.66666666666666d, 212.66666666666666d, 107.33333333333333d));
                arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
                arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
                arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
                arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
            }
        } else {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 105.33333333333333d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 105.33333333333333d, 212.66666666666666d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 212.66666666666666d, 212.66666666666666d, 107.33333333333333d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        }
        return arrayList;
    }

    /* renamed from: b */
    static List m108438b(List list) {
        ArrayList arrayList = new ArrayList();
        if (m108448l((MediaItem) list.get(0)) && m108448l((MediaItem) list.get(1))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 159.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 212.66666666666666d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        } else if (m108450n((MediaItem) list.get(0)) && m108450n((MediaItem) list.get(1))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 212.66666666666666d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 212.66666666666666d, 161.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        } else {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 159.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 159.0d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 161.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 161.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 161.0d));
        }
        return arrayList;
    }

    /* renamed from: c */
    static List m108439c(List list) {
        ArrayList arrayList = new ArrayList();
        if (m108448l((MediaItem) list.get(0))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 212.66666666666666d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        } else if (m108450n((MediaItem) list.get(0))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        } else {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 159.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 159.0d, 161.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 159.0d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 320.0d, 320.0d, 161.0d));
        }
        return arrayList;
    }

    /* renamed from: d */
    static List m108440d(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        double d11 = (320.0d - ((i12 - 1) * 2)) / i12;
        for (int i13 = 0; i13 < i11; i13++) {
            double d12 = 2.0d + d11;
            double d13 = (i13 / i12) * d12;
            double d14 = (i13 % i12) * d12;
            arrayList.add(new ItemAlbumMobile.C7883c(d13, d14 + d11, d13 + d11, d14));
        }
        return arrayList;
    }

    /* renamed from: e */
    static List m108441e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 105.33333333333333d, 105.33333333333333d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 105.33333333333333d, 107.33333333333333d));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 105.33333333333333d, 212.66666666666666d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 212.66666666666666d, 212.66666666666666d, 107.33333333333333d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        return arrayList;
    }

    /* renamed from: f */
    static List m108442f(List list) {
        float m41137b0 = ((MediaItem) list.get(0)).m41137b0() / ((MediaItem) list.get(0)).m41144g0();
        if (m41137b0 > 0.0f) {
            if (m41137b0 > 1.2f) {
                m41137b0 = 1.2f;
            }
        } else {
            m41137b0 = 1.0f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, m41137b0 * 320.0d, 0.0d));
        return arrayList;
    }

    /* renamed from: g */
    static List m108443g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 105.33333333333333d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 212.66666666666666d, 212.66666666666666d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        return arrayList;
    }

    /* renamed from: h */
    static List m108444h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 212.66666666666666d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 105.33333333333333d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(107.33333333333333d, 320.0d, 212.66666666666666d, 214.66666666666666d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 105.33333333333333d, 320.0d, 0.0d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 212.66666666666666d, 320.0d, 107.33333333333333d));
        arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 214.66666666666666d));
        return arrayList;
    }

    /* renamed from: i */
    static List m108445i(List list) {
        ArrayList arrayList = new ArrayList();
        if (m108448l((MediaItem) list.get(0)) && m108448l((MediaItem) list.get(1)) && m108448l((MediaItem) list.get(2))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 212.66666666666666d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 159.0d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(214.66666666666666d, 320.0d, 320.0d, 161.0d));
        } else if (m108450n((MediaItem) list.get(0)) && m108450n((MediaItem) list.get(1)) && m108450n((MediaItem) list.get(2))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 212.66666666666666d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 159.0d, 214.66666666666666d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 320.0d, 320.0d, 214.66666666666666d));
        } else if (!m108448l((MediaItem) list.get(0)) && !m108449m((MediaItem) list.get(0))) {
            if (m108450n((MediaItem) list.get(0))) {
                arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 320.0d, 0.0d));
                arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 159.0d, 161.0d));
                arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 320.0d, 320.0d, 161.0d));
            }
        } else {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 159.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 159.0d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(161.0d, 320.0d, 320.0d, 161.0d));
        }
        return arrayList;
    }

    /* renamed from: j */
    static List m108446j(List list) {
        double d11;
        ArrayList arrayList = new ArrayList();
        if (m108450n((MediaItem) list.get(0)) && m108450n((MediaItem) list.get(1))) {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 320.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 320.0d, 161.0d));
        } else if (m108448l((MediaItem) list.get(0)) && m108448l((MediaItem) list.get(1))) {
            MediaItem mediaItem = (MediaItem) list.get(0);
            MediaItem mediaItem2 = (MediaItem) list.get(1);
            double m41144g0 = mediaItem.m41144g0() / mediaItem.m41137b0();
            double m41144g02 = mediaItem2.m41144g0() / mediaItem2.m41137b0();
            if (m41144g0 <= m41144g02) {
                d11 = 320.0d / m41144g0;
            } else {
                d11 = 320.0d / m41144g02;
            }
            if (d11 < 60.0d) {
                d11 = 60.0d;
            }
            if (d11 > 159.0d) {
                d11 = 159.0d;
            }
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, d11, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(d11 + 2.0d, 320.0d, (d11 * 2.0d) + 2.0d, 0.0d));
        } else {
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 159.0d, 159.0d, 0.0d));
            arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 320.0d, 159.0d, 161.0d));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static List m108447k(List list) {
        if (list != null && !list.isEmpty()) {
            switch (list.size()) {
                case 1:
                    return m108442f(list);
                case 2:
                    return m108446j(list);
                case 3:
                    return m108445i(list);
                case 4:
                    return m108439c(list);
                case 5:
                    return m108438b(list);
                case 6:
                    return m108444h();
                case 7:
                    return m108443g();
                case 8:
                    return m108437a(list);
                case 9:
                    return m108441e();
                default:
                    return m108440d(list.size(), 3);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: l */
    static boolean m108448l(MediaItem mediaItem) {
        if (!m108449m(mediaItem) && mediaItem.m41144g0() - mediaItem.m41137b0() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    static boolean m108449m(MediaItem mediaItem) {
        if (Math.abs(mediaItem.m41137b0() - mediaItem.m41144g0()) <= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    static boolean m108450n(MediaItem mediaItem) {
        if (!m108449m(mediaItem) && mediaItem.m41144g0() - mediaItem.m41137b0() < 0) {
            return true;
        }
        return false;
    }
}
