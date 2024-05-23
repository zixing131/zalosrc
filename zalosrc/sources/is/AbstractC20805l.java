package is;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.social.controls.FeedLikeStatus;
import java.util.List;
import java.util.Map;
import p329lo.C22579r0;
import p726zr.C32546b;

/* renamed from: is.l */
/* loaded from: classes4.dex */
public abstract class AbstractC20805l {
    /* renamed from: a */
    private static FeedLikeStatus m108543a(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            try {
                if (!TextUtils.isEmpty(itemAlbumMobile.f42599t)) {
                    FeedLikeStatus feedLikeStatus = new FeedLikeStatus();
                    feedLikeStatus.m56322j(itemAlbumMobile.f42599t);
                    feedLikeStatus.m56324l(Integer.parseInt(itemAlbumMobile.f42560K));
                    feedLikeStatus.m56327o(itemAlbumMobile.f42552E.equals("1"));
                    feedLikeStatus.m56321i(Integer.parseInt(itemAlbumMobile.f42561L));
                    feedLikeStatus.m56325m(itemAlbumMobile.f42562M);
                    feedLikeStatus.m56323k(itemAlbumMobile.f42563N);
                    feedLikeStatus.m56326n(1);
                    return feedLikeStatus;
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static FeedLikeStatus m108544b(C22579r0 c22579r0) {
        if (c22579r0 != null) {
            try {
                if (!TextUtils.isEmpty(c22579r0.f110490a)) {
                    FeedLikeStatus feedLikeStatus = new FeedLikeStatus();
                    feedLikeStatus.m56322j(c22579r0.f110490a);
                    feedLikeStatus.m56324l(c22579r0.f110493d);
                    feedLikeStatus.m56327o(c22579r0.f110495f);
                    feedLikeStatus.m56321i(c22579r0.f110494e);
                    feedLikeStatus.m56325m(c22579r0.f110496g);
                    feedLikeStatus.m56323k(c22579r0.f110497h);
                    feedLikeStatus.m56326n(0);
                    return feedLikeStatus;
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m108545c(Intent intent, C3020p0 c3020p0) {
        if (intent != null && intent.hasExtra("extra_feed_like_status")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_feed_like_status");
            if (parcelableExtra instanceof FeedLikeStatus) {
                return m108548f((FeedLikeStatus) parcelableExtra, c3020p0);
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m108546d(Intent intent, String str, List list) {
        if (intent == null || !intent.hasExtra("extra_feed_like_status")) {
            return false;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("extra_feed_like_status");
        if (!(parcelableExtra instanceof FeedLikeStatus)) {
            return false;
        }
        FeedLikeStatus feedLikeStatus = (FeedLikeStatus) parcelableExtra;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C3000l0 c3000l0 = (C3000l0) list.get(i11);
            if (c3000l0.f11895q.equals(str)) {
                return m108548f(feedLikeStatus, c3000l0.m14322a0());
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m108547e(Bundle bundle, C3020p0 c3020p0) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("extra_feed_like_status");
            if (parcelable instanceof FeedLikeStatus) {
                return m108548f((FeedLikeStatus) parcelable, c3020p0);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m108548f(FeedLikeStatus feedLikeStatus, C3020p0 c3020p0) {
        C3051w0 c3051w0;
        if (c3020p0 != null && feedLikeStatus != null && feedLikeStatus.m56314b() != null && feedLikeStatus.m56314b().equals(c3020p0.f12057p) && feedLikeStatus.m56316d() >= 0) {
            c3020p0.f12064w = feedLikeStatus.m56320h();
            c3020p0.f12025E.f12244b = feedLikeStatus.m56316d();
            C3039t0 c3039t0 = c3020p0.f12025E;
            if (feedLikeStatus.m56317e() != null) {
                c3051w0 = new C3051w0(feedLikeStatus.m56317e());
            } else {
                c3051w0 = null;
            }
            c3039t0.f12246d = c3051w0;
            c3020p0.f12025E.f12247e = feedLikeStatus.m56315c();
            c3020p0.m14476F0();
            if (m108552j(feedLikeStatus, c3020p0)) {
                c3020p0.f12025E.f12243a = feedLikeStatus.m56313a();
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m108549g(ItemAlbumMobile itemAlbumMobile, ItemAlbumMobile itemAlbumMobile2) {
        C3051w0 c3051w0;
        if (itemAlbumMobile != null && itemAlbumMobile2 != null && TextUtils.equals(itemAlbumMobile.f42595r, itemAlbumMobile2.f42595r)) {
            itemAlbumMobile.f42561L = itemAlbumMobile2.f42561L;
            itemAlbumMobile.f42560K = itemAlbumMobile2.f42560K;
            itemAlbumMobile.f42552E = itemAlbumMobile2.f42552E;
            C3051w0 c3051w02 = itemAlbumMobile2.f42562M;
            C32546b c32546b = null;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            } else {
                c3051w0 = null;
            }
            itemAlbumMobile.f42562M = c3051w0;
            if (itemAlbumMobile2.f42563N != null) {
                c32546b = new C32546b(itemAlbumMobile2.f42563N);
            }
            itemAlbumMobile.f42563N = c32546b;
        }
    }

    /* renamed from: h */
    public static void m108550h(ItemAlbumMobile itemAlbumMobile, List list, boolean z11) {
        C3051w0 c3051w0;
        if (itemAlbumMobile != null && list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) list.get(i11);
                if (TextUtils.equals(itemAlbumMobile2.f42595r, itemAlbumMobile.f42595r) || (z11 && !TextUtils.isEmpty(itemAlbumMobile.f42599t) && itemAlbumMobile.f42599t.equals(itemAlbumMobile2.f42599t))) {
                    itemAlbumMobile2.f42561L = itemAlbumMobile.f42561L;
                    itemAlbumMobile2.f42560K = itemAlbumMobile.f42560K;
                    itemAlbumMobile2.f42552E = itemAlbumMobile.f42552E;
                    C3051w0 c3051w02 = itemAlbumMobile.f42562M;
                    C32546b c32546b = null;
                    if (c3051w02 != null) {
                        c3051w0 = new C3051w0(c3051w02);
                    } else {
                        c3051w0 = null;
                    }
                    itemAlbumMobile2.f42562M = c3051w0;
                    if (itemAlbumMobile.f42563N != null) {
                        c32546b = new C32546b(itemAlbumMobile.f42563N);
                    }
                    itemAlbumMobile2.f42563N = c32546b;
                }
            }
        }
    }

    /* renamed from: i */
    public static void m108551i(Bundle bundle, C22579r0 c22579r0) {
        FeedLikeStatus m108544b = m108544b(c22579r0);
        if (m108544b != null) {
            bundle.putParcelable("extra_feed_like_status", m108544b);
        }
    }

    /* renamed from: j */
    private static boolean m108552j(FeedLikeStatus feedLikeStatus, C3020p0 c3020p0) {
        boolean z11;
        if (feedLikeStatus == null || c3020p0 == null) {
            return false;
        }
        if (c3020p0.f12058q != 3 && c3020p0.m14506g0()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (feedLikeStatus.m56318f() != 0 && (feedLikeStatus.m56318f() != 1 || z11)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m108553k(C3020p0 c3020p0, C3020p0 c3020p02) {
        C3051w0 c3051w0;
        if (c3020p0 == null || c3020p02 == null) {
            return false;
        }
        try {
            if (c3020p02.f12025E.f12244b < 0 || !c3020p0.f12057p.equals(c3020p02.f12057p)) {
                return false;
            }
            c3020p0.f12064w = c3020p02.f12064w;
            C3039t0 c3039t0 = c3020p0.f12025E;
            C3039t0 c3039t02 = c3020p02.f12025E;
            c3039t0.f12244b = c3039t02.f12244b;
            C3051w0 c3051w02 = c3039t02.f12246d;
            C32546b c32546b = null;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            } else {
                c3051w0 = null;
            }
            c3039t0.f12246d = c3051w0;
            C3039t0 c3039t03 = c3020p0.f12025E;
            if (c3020p02.f12025E.f12247e != null) {
                c32546b = new C32546b(c3020p02.f12025E.f12247e);
            }
            c3039t03.f12247e = c32546b;
            c3020p0.m14476F0();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public static void m108554l(Map map, ItemAlbumMobile itemAlbumMobile) {
        FeedLikeStatus feedLikeStatus;
        if (itemAlbumMobile != null) {
            feedLikeStatus = m108543a(itemAlbumMobile);
        } else {
            feedLikeStatus = null;
        }
        if (map != null && feedLikeStatus != null) {
            m108555m(map, feedLikeStatus);
        }
    }

    /* renamed from: m */
    private static void m108555m(Map map, FeedLikeStatus feedLikeStatus) {
        if (map != null && feedLikeStatus != null && feedLikeStatus.m56319g()) {
            map.put(feedLikeStatus.m56314b(), feedLikeStatus);
        }
    }
}
