package p167fs;

import android.content.Context;
import bi0.AbstractC2814h;
import bo.C3020p0;
import bo.C3039t0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedNetwork;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedNetworkError;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedNoExist;
import fn0.AbstractC19074t;
import java.util.Comparator;
import java.util.List;
import me0.AbstractC23136l9;
import p726zr.C32546b;
import p726zr.C32547c;
import p726zr.C32550f;
import qm0.AbstractC25368s;
import ti0.C26703b;
import ti0.C26705d;

/* renamed from: fs.e */
/* loaded from: classes4.dex */
public final class C19140e {

    /* renamed from: a */
    public static final C19140e f95172a = new C19140e();

    private C19140e() {
    }

    /* renamed from: e */
    public static final String m100450e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        String m118749t0 = AbstractC23136l9.m118749t0(context, AbstractC8020f0.str_notify_can_not_multi_react_on_old_feed);
        AbstractC19074t.m100207e(m118749t0, "getString(...)");
        return m118749t0;
    }

    /* renamed from: g */
    public static final int m100451g(C32550f c32550f, C32550f c32550f2) {
        if (c32550f.m157623c() == c32550f2.m157623c()) {
            return AbstractC19074t.m100209g(c32550f.m157624d(), c32550f2.m157624d());
        }
        return AbstractC19074t.m100209g(c32550f2.m157623c(), c32550f.m157623c());
    }

    /* renamed from: b */
    public final String m100452b(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        if ((exc instanceof ExceptionFeedNetwork) || (exc instanceof ExceptionReactFeedNetworkError)) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        if (exc instanceof ExceptionReactFeedNoExist) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_general_error);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:            r6 = on0.AbstractC24340u.m127107m(r6);     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32547c m100453c(ItemAlbumMobile itemAlbumMobile) {
        List m131502j;
        int i11;
        int i12;
        Integer m127107m;
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b == null || (m131502j = c32546b.m157607c()) == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        C32546b c32546b2 = itemAlbumMobile.f42563N;
        if (c32546b2 != null) {
            i11 = c32546b2.m157605a();
        } else {
            i11 = 1;
        }
        String str = itemAlbumMobile.f42560K;
        if (str != null && m127107m != null) {
            i12 = m127107m.intValue();
        } else {
            i12 = 0;
        }
        return new C32547c(m100204b, i12, new C32546b(i11, m131502j));
    }

    /* renamed from: d */
    public final C26703b m100454d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return C26705d.m137293a(context, AbstractC2814h.t_xsmall_m);
    }

    /* renamed from: f */
    public final Comparator m100455f() {
        return new Comparator() { // from class: fs.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m100451g;
                m100451g = C19140e.m100451g((C32550f) obj, (C32550f) obj2);
                return m100451g;
            }
        };
    }

    /* renamed from: h */
    public final void m100456h(C3020p0 c3020p0, C32547c c32547c) {
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(c32547c, "likeResultInfo");
        c3020p0.f12064w = c32547c.m157612c();
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null) {
            c3039t0.f12247e = c32547c.m157610a();
        }
        C3039t0 c3039t02 = c3020p0.f12025E;
        if (c3039t02 != null) {
            c3039t02.f12244b = c32547c.m157611b();
        }
    }

    /* renamed from: i */
    public final void m100457i(ItemAlbumMobile itemAlbumMobile, C32547c c32547c) {
        String str;
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        AbstractC19074t.m100208f(c32547c, "likeResultInfo");
        if (c32547c.m157612c()) {
            str = "1";
        } else {
            str = "0";
        }
        itemAlbumMobile.f42552E = str;
        itemAlbumMobile.f42563N = c32547c.m157610a();
        itemAlbumMobile.f42560K = String.valueOf(c32547c.m157611b());
    }
}
