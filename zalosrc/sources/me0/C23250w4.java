package me0;

import ae.C0766k;
import am.C0943w;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import androidx.core.text.AbstractC1463b;
import au.EnumC2363o;
import au.EnumC2369r;
import au.EnumC2380x;
import au.EnumC2381y;
import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.C3499e0;
import ci.C3508j;
import ci.C3522q;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.zviews.wa0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19610a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import ln0.AbstractC22543l;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.EnumC23663t;
import p392oh.C24261h;
import p392oh.C24265l;
import p461qu.AbstractC25495a;
import p698yz.AbstractC31111g;
import p698yz.EnumC31105a;
import p716zh.AbstractC31990k7;
import p716zh.AbstractC32173x4;
import p716zh.C31973j5;
import p716zh.C32187y4;
import ph.C24751d;
import ph.C24753f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import th.AbstractC26687h;
import vg.C28203u6;
import xd0.C29590f;
import xd0.C29602r;

/* renamed from: me0.w4 */
/* loaded from: classes4.dex */
public final class C23250w4 {

    /* renamed from: a */
    public static final C23250w4 f112644a = new C23250w4();

    /* renamed from: b */
    private static final InterfaceC24854k f112645b;

    /* renamed from: c */
    private static final InterfaceC24854k f112646c;

    /* renamed from: me0.w4$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: E */
        void mo17830E(String str);

        /* renamed from: F */
        void mo17831F(boolean z11);

        /* renamed from: a */
        void mo17832a(boolean z11);
    }

    /* renamed from: me0.w4$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f112647a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f112648b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f112649c;

        static {
            int[] iArr = new int[EnumC2381y.values().length];
            try {
                iArr[EnumC2381y.f9940q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2381y.f9941r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112647a = iArr;
            int[] iArr2 = new int[EnumC2369r.values().length];
            try {
                iArr2[EnumC2369r.f9910p.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC2369r.f9911q.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2369r.f9912r.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f112648b = iArr2;
            int[] iArr3 = new int[EnumC2363o.values().length];
            try {
                iArr3[EnumC2363o.f9890q.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC2363o.f9891r.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f112649c = iArr3;
        }
    }

    /* renamed from: me0.w4$c */
    /* loaded from: classes4.dex */
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: p */
        private int f112650p;

        /* renamed from: q */
        final /* synthetic */ C7226u3 f112651q;

        c(C7226u3 c7226u3) {
            this.f112651q = c7226u3;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(view, "view");
            try {
                C7226u3 c7226u3 = this.f112651q;
                if (c7226u3 != null) {
                    c7226u3.m36802L0(view.getMeasuredWidth());
                    if (this.f112650p != this.f112651q.m36816p0()) {
                        this.f112650p = this.f112651q.m36816p0();
                        this.f112651q.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: me0.w4$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f112652q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Calendar mo12V4() {
            return C23250w4.f112644a.m119848y();
        }
    }

    /* renamed from: me0.w4$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f112653q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Calendar mo12V4() {
            return C23250w4.f112644a.m119848y();
        }
    }

    /* renamed from: me0.w4$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ a f112654a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f112655b;

        f(a aVar, C17945a0 c17945a0) {
            this.f112654a = aVar;
            this.f112655b = c17945a0;
        }

        /* renamed from: d */
        public static final void m119852d(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "$chatLine");
            AbstractC23306f.m120603N1().m101508a(new C29602r.b(c17945a0, false, null, 6, null));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                int m104491c = c20096c.m104491c();
                if (m104491c != -105) {
                    if (m104491c == 50001) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.undo_msg_error_network);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.undo_msg_error_receiver_not_support);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                }
                a aVar = this.f112654a;
                if (aVar != null) {
                    aVar.mo17831F(false);
                    this.f112654a.mo17830E(m118743r0);
                    this.f112654a.mo17832a(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            a aVar = this.f112654a;
            if (aVar != null) {
                aVar.mo17831F(false);
                this.f112654a.mo17832a(true);
            }
            C23288a c23288a = C23288a.f113033a;
            String mo95039W2 = this.f112655b.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            AbstractC18428c.m97659b(c23288a, mo95039W2, 0, new Runnable() { // from class: me0.x4
                public /* synthetic */ RunnableC23260x4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C23250w4.f.m119852d(C17945a0.this);
                }
            }, 2, null);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f112652q);
        f112645b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(e.f112653q);
        f112646c = m129210a2;
    }

    private C23250w4() {
    }

    /* renamed from: A */
    private final Calendar m119784A() {
        return (Calendar) f112646c.getValue();
    }

    /* renamed from: D */
    public static final String m119785D(long j11, EnumC2369r enumC2369r, boolean z11) {
        AbstractC19074t.m100208f(enumC2369r, "headerMode");
        if (z11) {
            C23250w4 c23250w4 = f112644a;
            c23250w4.m119817z().setTimeInMillis(C23793c.Companion.m124321a().mo124310e());
            c23250w4.m119784A().setTimeInMillis(j11);
            if (AbstractC23160o0.m119235a1(c23250w4.m119817z(), c23250w4.m119784A())) {
                String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_today);
                AbstractC19074t.m100207e(string, "getString(...)");
                return string;
            }
            c23250w4.m119817z().add(6, -1);
            if (AbstractC23160o0.m119235a1(c23250w4.m119817z(), c23250w4.m119784A())) {
                String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_yesterday);
                AbstractC19074t.m100207e(string2, "getString(...)");
                return string2;
            }
        }
        int i11 = b.f112648b[enumC2369r.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    String m119738b = AbstractC23244v8.m119738b(AbstractC23160o0.m119305y0(j11));
                    AbstractC19074t.m100207e(m119738b, "capitalize(...)");
                    return m119738b;
                }
                throw new NoWhenBranchMatchedException();
            }
            String m119299w = AbstractC23160o0.m119299w(j11);
            AbstractC19074t.m100207e(m119299w, "getAlbumDateString(...)");
            return m119299w;
        }
        String m119189E = AbstractC23160o0.m119189E(j11);
        AbstractC19074t.m100207e(m119189E, "getDateString(...)");
        return m119189E;
    }

    /* renamed from: E */
    public static final int m119786E() {
        String str = AbstractC18458a.f93019a;
        if (AbstractC19074t.m100204b(str, "en")) {
            return 1;
        }
        return AbstractC19074t.m100204b(str, "my") ? 1 : 0;
    }

    /* renamed from: G */
    private final int m119787G(String str) {
        try {
            int abs = Math.abs(str.hashCode());
            int[] iArr = AbstractC23304d.f113328S2;
            return iArr[abs % iArr.length];
        } catch (Exception unused) {
            return -11819806;
        }
    }

    /* renamed from: L */
    public static final String m119788L(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (TextUtils.isEmpty(str)) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            String str3 = AbstractC23304d.f113368c0.f42437s;
            AbstractC19074t.m100207e(str3, "dpn");
            return str3;
        }
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
        if (m141800i != null) {
            String m40383Q = m141800i.m40383Q(true, false);
            AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
            return m40383Q;
        }
        String m114542i = AbstractC21935u.m114542i(str, str2);
        AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
        return m114542i;
    }

    /* renamed from: O */
    public static final boolean m119789O(String str, String str2) {
        C31973j5 m4472f;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(str2, "itemOwnerUid");
        if (TextUtils.equals(CoreUtility.f89233i, str2)) {
            return true;
        }
        if (AbstractC25495a.m132079d(str) && (m4472f = C0943w.f3447a.m4472f(str)) != null) {
            if (m4472f.m153778p0()) {
                return true;
            }
            if (m4472f.m153743U() && !m4472f.m153780q0(str2) && !m4472f.m153744V(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public static final boolean m119790R(MediaStoreItem mediaStoreItem, MediaStoreItem mediaStoreItem2) {
        AbstractC19074t.m100208f(mediaStoreItem, "item1");
        AbstractC19074t.m100208f(mediaStoreItem2, "item2");
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(mediaStoreItem.m40599m().m95313z4());
            calendar2.setTimeInMillis(mediaStoreItem2.m40599m().m95313z4());
            if (calendar.get(1) != calendar2.get(1)) {
                return false;
            }
            if (calendar.get(6) != calendar2.get(6)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: S */
    public static final boolean m119791S(AbstractC32173x4 abstractC32173x4, AbstractC32173x4 abstractC32173x42) {
        long j11;
        if (abstractC32173x4 == null || abstractC32173x42 == null || abstractC32173x4.m155148g() == null || abstractC32173x42.m155148g() == null) {
            return true;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            AbstractC32173x4.a m155148g = abstractC32173x4.m155148g();
            long j12 = 0;
            if (m155148g != null) {
                j11 = m155148g.m155156b();
            } else {
                j11 = 0;
            }
            calendar.setTimeInMillis(j11);
            AbstractC32173x4.a m155148g2 = abstractC32173x42.m155148g();
            if (m155148g2 != null) {
                j12 = m155148g2.m155156b();
            }
            calendar2.setTimeInMillis(j12);
            if (calendar.get(1) == calendar2.get(1)) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: T */
    public static final boolean m119792T(C7906d c7906d, C7906d c7906d2) {
        long j11;
        if (c7906d == null || c7906d2 == null || c7906d.m40819h() == null || c7906d2.m40819h() == null) {
            return true;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            C7906d.b m40819h = c7906d.m40819h();
            long j12 = 0;
            if (m40819h != null) {
                j11 = m40819h.m40842b();
            } else {
                j11 = 0;
            }
            calendar.setTimeInMillis(j11);
            C7906d.b m40819h2 = c7906d2.m40819h();
            if (m40819h2 != null) {
                j12 = m40819h2.m40842b();
            }
            calendar2.setTimeInMillis(j12);
            if (calendar.get(1) == calendar2.get(1)) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: U */
    public static final boolean m119793U(MediaStoreItem mediaStoreItem, MediaStoreItem mediaStoreItem2) {
        AbstractC19074t.m100208f(mediaStoreItem, "item1");
        AbstractC19074t.m100208f(mediaStoreItem2, "item2");
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(mediaStoreItem.m40599m().m95313z4());
            calendar2.setTimeInMillis(mediaStoreItem2.m40599m().m95313z4());
            if (calendar.get(1) != calendar2.get(1)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V */
    public static final boolean m119794V(int i11) {
        if (i11 != EnumC2381y.f9939p.ordinal() && i11 != EnumC2381y.f9940q.ordinal() && i11 != EnumC2381y.f9941r.ordinal()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static final boolean m119795W(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!c17945a0.m94871D7() && !c17945a0.m95306y8() && !c17945a0.m95120e6() && !c17945a0.m95276v6() && !AbstractC19646n0.m103019q1(c17945a0)) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private final void m119796X(List list, int i11) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
            mediaStoreItem.m40611u0(EnumC2380x.f9935r);
            MediaStoreItem.C7888c m40559B = mediaStoreItem.m40559B();
            m40559B.m40628h(i11);
            m40559B.m40629i("layout1");
            float f11 = (316 * 1.0f) / 3;
            float f12 = (2 + f11) * i12;
            m40559B.m40632l(0.0f);
            m40559B.m40631k(f12 + f11);
            m40559B.m40627g(f11);
            m40559B.m40630j(f12);
            i12++;
        }
    }

    /* renamed from: Y */
    private final void m119797Y(List list, int i11) {
        boolean z11;
        if (list.isEmpty()) {
            return;
        }
        boolean z12 = false;
        MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(0);
        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) list.get(1);
        MediaStoreItem mediaStoreItem3 = (MediaStoreItem) list.get(list.size() - 1);
        MediaStoreItem.C7888c m40559B = mediaStoreItem.m40559B();
        MediaStoreItem.C7888c m40559B2 = mediaStoreItem2.m40559B();
        MediaStoreItem.C7888c m40559B3 = mediaStoreItem3.m40559B();
        m40559B.m40628h(i11);
        m40559B2.m40628h(i11);
        m40559B3.m40628h(i11);
        float width = (mediaStoreItem.getWidth() * 1.0f) / mediaStoreItem.getHeight();
        float width2 = (mediaStoreItem3.getWidth() * 1.0f) / mediaStoreItem3.getHeight();
        if (0.75f <= width && width <= 1.3333334f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (0.75f <= width2 && width2 <= 1.3333334f) {
            z12 = true;
        }
        float f11 = (316 * 1.0f) / 3;
        if (z12 && !z11) {
            if (m119806h(list, i11, "layout2b")) {
                m40559B.m40629i("layout2b");
                m40559B2.m40629i("layout2b");
                m40559B3.m40629i("layout2b");
                m40559B.m40630j(0.0f);
                m40559B.m40632l(0.0f);
                m40559B.m40631k(f11);
                m40559B.m40627g(f11);
                m40559B2.m40630j(0.0f);
                float f12 = 2;
                m40559B2.m40632l(m40559B.m40621a() + f12);
                m40559B2.m40631k(f11);
                m40559B2.m40627g(m40559B2.m40626f() + f11);
                m40559B3.m40630j(f11 + f12);
                m40559B3.m40632l(0.0f);
                m40559B3.m40631k(320.0f);
                m40559B3.m40627g(m40559B2.m40621a());
                EnumC2380x enumC2380x = EnumC2380x.f9935r;
                mediaStoreItem.m40611u0(enumC2380x);
                mediaStoreItem2.m40611u0(enumC2380x);
                mediaStoreItem3.m40611u0(EnumC2380x.f9936s);
                return;
            }
            return;
        }
        if (m119806h(list, i11, "layout2a")) {
            m40559B.m40629i("layout2a");
            m40559B2.m40629i("layout2a");
            m40559B3.m40629i("layout2a");
            m40559B2.m40630j(320 - f11);
            m40559B2.m40632l(0.0f);
            m40559B2.m40631k(320.0f);
            m40559B2.m40627g(f11);
            m40559B3.m40630j(m40559B2.m40624d());
            float f13 = 2;
            m40559B3.m40632l(m40559B2.m40621a() + f13);
            m40559B3.m40631k(320.0f);
            m40559B3.m40627g(m40559B3.m40626f() + f11);
            m40559B.m40630j(0.0f);
            m40559B.m40632l(0.0f);
            m40559B.m40631k(m40559B2.m40624d() - f13);
            m40559B.m40627g(m40559B3.m40621a());
            mediaStoreItem.m40611u0(EnumC2380x.f9936s);
            EnumC2380x enumC2380x2 = EnumC2380x.f9935r;
            mediaStoreItem2.m40611u0(enumC2380x2);
            mediaStoreItem3.m40611u0(enumC2380x2);
        }
    }

    /* renamed from: Z */
    private final void m119798Z(List list, int i11) {
        if (list.size() < 4) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
            mediaStoreItem.m40559B().m40628h(i11);
            mediaStoreItem.m40559B().m40629i("layout3a");
        }
        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) list.get(0);
        MediaStoreItem mediaStoreItem3 = (MediaStoreItem) list.get(1);
        MediaStoreItem mediaStoreItem4 = (MediaStoreItem) list.get(2);
        MediaStoreItem mediaStoreItem5 = (MediaStoreItem) list.get(3);
        float f11 = (316 * 1.0f) / 3;
        MediaStoreItem.C7888c m40559B = mediaStoreItem2.m40559B();
        m40559B.m40630j(0.0f);
        m40559B.m40632l(0.0f);
        float f12 = 2;
        m40559B.m40631k((320 - f11) - f12);
        m40559B.m40627g(320.0f);
        MediaStoreItem.C7888c m40559B2 = mediaStoreItem3.m40559B();
        m40559B2.m40630j(mediaStoreItem2.m40559B().m40625e() + f12);
        m40559B2.m40632l(0.0f);
        m40559B2.m40631k(320.0f);
        m40559B2.m40627g(m40559B2.m40626f() + f11);
        MediaStoreItem.C7888c m40559B3 = mediaStoreItem4.m40559B();
        m40559B3.m40630j(mediaStoreItem3.m40559B().m40624d());
        m40559B3.m40632l(mediaStoreItem3.m40559B().m40621a() + f12);
        m40559B3.m40631k(320.0f);
        m40559B3.m40627g(m40559B3.m40626f() + f11);
        MediaStoreItem.C7888c m40559B4 = mediaStoreItem5.m40559B();
        m40559B4.m40630j(mediaStoreItem3.m40559B().m40624d());
        m40559B4.m40632l(mediaStoreItem4.m40559B().m40621a() + f12);
        m40559B4.m40631k(320.0f);
        m40559B4.m40627g(320.0f);
        mediaStoreItem2.m40611u0(EnumC2380x.f9936s);
        EnumC2380x enumC2380x = EnumC2380x.f9935r;
        mediaStoreItem3.m40611u0(enumC2380x);
        mediaStoreItem4.m40611u0(enumC2380x);
        mediaStoreItem5.m40611u0(enumC2380x);
    }

    /* renamed from: a0 */
    private final void m119800a0(List list, int i11) {
        if (list.size() < 4) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
            mediaStoreItem.m40559B().m40628h(i11);
            mediaStoreItem.m40559B().m40629i("layout3b");
        }
        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) list.get(0);
        MediaStoreItem mediaStoreItem3 = (MediaStoreItem) list.get(1);
        MediaStoreItem mediaStoreItem4 = (MediaStoreItem) list.get(2);
        MediaStoreItem mediaStoreItem5 = (MediaStoreItem) list.get(3);
        float f11 = (316 * 1.0f) / 3;
        MediaStoreItem.C7888c m40559B = mediaStoreItem2.m40559B();
        m40559B.m40630j(0.0f);
        m40559B.m40632l(0.0f);
        m40559B.m40631k(320.0f);
        float f12 = 2;
        m40559B.m40627g((320 - f11) - f12);
        MediaStoreItem.C7888c m40559B2 = mediaStoreItem3.m40559B();
        m40559B2.m40630j(0.0f);
        m40559B2.m40632l(mediaStoreItem2.m40559B().m40621a() + f12);
        m40559B2.m40631k(f11);
        m40559B2.m40627g(320.0f);
        MediaStoreItem.C7888c m40559B3 = mediaStoreItem4.m40559B();
        m40559B3.m40630j(mediaStoreItem3.m40559B().m40625e() + f12);
        m40559B3.m40632l(mediaStoreItem3.m40559B().m40626f());
        m40559B3.m40631k(m40559B3.m40624d() + f11);
        m40559B3.m40627g(320.0f);
        MediaStoreItem.C7888c m40559B4 = mediaStoreItem5.m40559B();
        m40559B4.m40630j(mediaStoreItem4.m40559B().m40625e() + f12);
        m40559B4.m40632l(mediaStoreItem3.m40559B().m40626f());
        m40559B4.m40631k(320.0f);
        m40559B4.m40627g(320.0f);
        mediaStoreItem2.m40611u0(EnumC2380x.f9936s);
        EnumC2380x enumC2380x = EnumC2380x.f9935r;
        mediaStoreItem3.m40611u0(enumC2380x);
        mediaStoreItem4.m40611u0(enumC2380x);
        mediaStoreItem5.m40611u0(enumC2380x);
    }

    /* renamed from: b0 */
    private final void m119801b0(List list, int i11) {
        if (list.isEmpty()) {
            return;
        }
        MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(0);
        MediaStoreItem.C7888c m40559B = mediaStoreItem.m40559B();
        m40559B.m40628h(i11);
        m40559B.m40629i("layout4");
        m40559B.m40630j(0.0f);
        m40559B.m40632l(0.0f);
        m40559B.m40631k(320.0f);
        m40559B.m40627g((320 - ((316 * 1.0f) / 3)) - 2);
        mediaStoreItem.m40611u0(EnumC2380x.f9936s);
    }

    /* renamed from: c0 */
    public static final void m119802c0(Matcher matcher, SpannableString spannableString) {
        AbstractC19074t.m100208f(matcher, "matcher");
        AbstractC19074t.m100208f(spannableString, "spannableString");
        try {
            HashMap hashMap = new HashMap();
            while (matcher.find()) {
                String group = matcher.group();
                if (!TextUtils.isEmpty(group) && !hashMap.containsKey(group)) {
                    AbstractC19074t.m100205c(group);
                    hashMap.put(group, group);
                    spannableString.setSpan(new BackgroundColorSpan(C23212s8.m119606n(AbstractC16781w.ChatSearchTextHighlightColor)), matcher.start(), matcher.end(), 18);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f0 */
    private final void m119803f0(List list, int i11, EnumC2380x enumC2380x) {
        if (i11 <= 0) {
            return;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
            mediaStoreItem.m40611u0(enumC2380x);
            MediaStoreItem.C7888c m40559B = mediaStoreItem.m40559B();
            int i14 = i12 % i11;
            m40559B.m40628h(i12 / i11);
            float f11 = ((320 - ((i11 - 1) * 2)) * 1.0f) / i11;
            float f12 = 0;
            float f13 = 2 + f11;
            float f14 = f13 * f12;
            float f15 = f13 * i14;
            m40559B.m40632l(f12 + f14);
            m40559B.m40631k(f15 + f11);
            m40559B.m40627g(f11 + f14);
            m40559B.m40630j(f15);
            i12 = i13;
        }
    }

    /* renamed from: g */
    private final void m119804g(List list, List list2) {
        int i11 = 0;
        while (i11 < list.size()) {
            try {
                MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(i11);
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
                        if (AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                            if (mediaStoreItem2.m40600m0()) {
                                mediaStoreItem2.m40565E0(mediaStoreItem.m40599m());
                            }
                            list.remove(i11);
                            i11--;
                        }
                    }
                }
                i11++;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
    }

    /* renamed from: g0 */
    private final void m119805g0(List list) {
        if (list.isEmpty()) {
            return;
        }
        m119807h0(list, 0, 0, 0);
    }

    /* renamed from: h */
    private final boolean m119806h(List list, int i11, String str) {
        if (list.isEmpty()) {
            return false;
        }
        MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(0);
        MediaStoreItem mediaStoreItem2 = (MediaStoreItem) list.get(list.size() - 1);
        if (mediaStoreItem.m40563D() == i11 && mediaStoreItem2.m40563D() == i11 && AbstractC19074t.m100204b(mediaStoreItem.m40569J(), str) && AbstractC19074t.m100204b(mediaStoreItem2.m40569J(), str)) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    private final void m119807h0(List list, int i11, int i12, int i13) {
        if (list.isEmpty()) {
            return;
        }
        while (true) {
            int size = list.size() - i11;
            if (size > 0) {
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            if (i13 <= 0) {
                                int i14 = i11 + 4;
                                List subList = list.subList(i11, i14);
                                MediaStoreItem m119815u = m119815u(subList);
                                if (m119815u != null) {
                                    if (m119815u.getHeight() > m119815u.getWidth()) {
                                        if (m119806h(subList, i12, "layout3a")) {
                                            m119798Z(subList, i12);
                                        }
                                    } else if (m119806h(subList, i12, "layout3b")) {
                                        m119800a0(subList, i12);
                                    }
                                } else {
                                    i14 = i11 + 3;
                                    List subList2 = list.subList(i11, i14);
                                    if (m119815u(subList2) != null) {
                                        m119797Y(subList2, i12);
                                    } else {
                                        m119796X(subList2, i12);
                                        i12++;
                                        i11 = i14;
                                        i13 = 0;
                                    }
                                }
                                i12++;
                                i11 = i14;
                                i13 = 4;
                            } else {
                                int i15 = i11 + 3;
                                List subList3 = list.subList(i11, i15);
                                if (m119806h(subList3, i12, "layout1")) {
                                    m119796X(subList3, i12);
                                }
                                i12++;
                                i13--;
                                i11 = i15;
                            }
                        } else {
                            List subList4 = list.subList(i11, list.size());
                            if (i13 <= 0) {
                                m119797Y(subList4, i12);
                                return;
                            } else {
                                m119796X(subList4, i12);
                                return;
                            }
                        }
                    } else {
                        m119796X(list.subList(i11, list.size()), i12);
                        return;
                    }
                } else {
                    List subList5 = list.subList(i11, list.size());
                    if (i13 <= 0) {
                        MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(i11);
                        if (mediaStoreItem.getHeight() >= 400 && mediaStoreItem.getWidth() >= mediaStoreItem.getHeight() && (mediaStoreItem.getWidth() * 1.0f) / mediaStoreItem.getHeight() <= 4.0f) {
                            m119801b0(subList5, i12);
                            return;
                        } else {
                            m119796X(subList5, i12);
                            return;
                        }
                    }
                    m119796X(subList5, i12);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: i0 */
    private final void m119808i0(List list, int i11, EnumC2380x enumC2380x) {
        m119803f0(list, i11, enumC2380x);
    }

    /* renamed from: l */
    public static /* synthetic */ SelectedItemData m119809l(C23250w4 c23250w4, MediaStoreItem mediaStoreItem, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return c23250w4.m119837j(mediaStoreItem, str);
    }

    /* renamed from: m */
    public static /* synthetic */ SelectedItemData m119810m(C23250w4 c23250w4, C17945a0 c17945a0, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return c23250w4.m119839k(c17945a0, str);
    }

    /* renamed from: m0 */
    public static final void m119811m0(C17945a0 c17945a0, a aVar) {
        AbstractC19074t.m100208f(c17945a0, "$chatLine");
        AbstractC23306f.m120603N1().m101508a(new C29602r.b(c17945a0, false, null, 6, null));
        new C0766k().mo1474L4(c17945a0.mo95039W2(), c17945a0);
        if (aVar != null) {
            aVar.mo17832a(true);
        }
    }

    /* renamed from: n */
    public static final MediaItem m119812n(MediaStoreItem mediaStoreItem) {
        MediaItem mediaItem;
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        if (mediaStoreItem.m40594i0()) {
            mediaItem = new MediaItem();
        } else if (mediaStoreItem.m40602n0()) {
            mediaItem = new VideoItem();
            String m94947M4 = mediaStoreItem.m40599m().m94947M4();
            AbstractC19074t.m100207e(m94947M4, "getThumbLocalPath(...)");
            mediaItem.m41153k1(m94947M4);
        } else {
            mediaItem = null;
        }
        if (mediaItem != null) {
            String m95090b5 = mediaStoreItem.m40599m().m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            mediaItem.m41158m1(m95090b5);
            if (mediaStoreItem.m40575S() == 2) {
                String m94868D3 = mediaStoreItem.m40599m().m94868D3();
                AbstractC19074t.m100207e(m94868D3, "getHDUrl(...)");
                mediaItem.m41117P0(m94868D3);
            }
            String m95131f5 = mediaStoreItem.m40599m().m95131f5();
            AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
            mediaItem.m41149i1(m95131f5);
            mediaItem.m41164p1(mediaStoreItem.getWidth());
            mediaItem.m41118Q0(mediaStoreItem.getHeight());
            mediaItem.m41107J0(mediaStoreItem.m40599m().m95313z4());
            String m40574R = mediaStoreItem.m40574R();
            if (m40574R == null) {
                m40574R = "";
            }
            mediaItem.mo41082W0(m40574R);
            if (C21373a.f104231a.m110802n()) {
                mediaItem.m41126U0(AbstractC23112j7.m118498H(mediaStoreItem));
            }
        }
        return mediaItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:            r11 = 0;     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m119813p(String str, List list, int i11, boolean z11) {
        int i12;
        AbstractC19074t.m100208f(str, "idDel");
        AbstractC19074t.m100208f(list, "albumList");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i13 = 2;
            float f11 = (320 - ((i11 - 1) * 2)) / i11;
            Iterator it = list.iterator();
            boolean z12 = false;
            int i14 = -1;
            while (it.hasNext()) {
                AbstractC32173x4 abstractC32173x4 = (AbstractC32173x4) it.next();
                int size = abstractC32173x4.m155151j().size();
                for (int i15 = 0; i15 < size; i15++) {
                    C32187y4 c32187y4 = (C32187y4) abstractC32173x4.m155151j().get(i15);
                    if (!AbstractC19074t.m100204b(str, String.valueOf(c32187y4.m155175c())) && !AbstractC19074t.m100204b(str, String.valueOf(c32187y4.m155183k()))) {
                    }
                    i14 = c32187y4.m155178f();
                    abstractC32173x4.m155151j().remove(i15);
                    z12 = true;
                }
                if (abstractC32173x4.m155151j().isEmpty()) {
                    list.remove(abstractC32173x4);
                    return;
                }
                if (z12 && z11) {
                    int i16 = 0;
                    if (size >= 0) {
                        boolean z13 = false;
                        i12 = 0;
                        while (true) {
                            if (i16 == abstractC32173x4.m155151j().size()) {
                                if (z13) {
                                }
                            } else {
                                if (((C32187y4) abstractC32173x4.m155151j().get(i16)).m155178f() == i14) {
                                    if (!z13) {
                                        i12 = i16;
                                        z13 = true;
                                    }
                                } else if (z13) {
                                    break;
                                }
                                if (i16 == size) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    if (i12 >= 0 && i12 < i16 && i16 < size) {
                        int i17 = -1;
                        while (i12 < i16) {
                            i17++;
                            float f12 = (i13 + f11) * i17;
                            float f13 = f12 + f11;
                            C32187y4.b m155176d = ((C32187y4) abstractC32173x4.m155151j().get(i12)).m155176d();
                            if (m155176d != null) {
                                m155176d.m155201j(0.0f);
                                m155176d.m155199h(f12);
                                m155176d.m155200i(f13);
                                m155176d.m155197f(m155176d.m155196e() + f11);
                            }
                            i12++;
                            i13 = 2;
                        }
                    }
                }
                i13 = 2;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    public static final boolean m119814r(String str) {
        if (AbstractC25495a.m132078c(str) && C21373a.f104231a.m110802n()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private final MediaStoreItem m119815u(List list) {
        MediaStoreItem mediaStoreItem = (MediaStoreItem) list.get(0);
        if (mediaStoreItem.getWidth() < 400 || mediaStoreItem.getHeight() < 400) {
            return null;
        }
        float width = (mediaStoreItem.getWidth() * 1.0f) / mediaStoreItem.getHeight();
        if (width > 4.0f || width < 0.25f) {
            return null;
        }
        return mediaStoreItem;
    }

    /* renamed from: x */
    public static /* synthetic */ Spanned m119816x(C23250w4 c23250w4, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "";
        }
        return c23250w4.m119847w(i11, str);
    }

    /* renamed from: z */
    private final Calendar m119817z() {
        return (Calendar) f112645b.getValue();
    }

    /* renamed from: B */
    public final String m119818B(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (C0943w.f3447a.m4473g(str) != null && !AbstractC25495a.m132079d(str)) {
            return "group_" + str;
        }
        return str;
    }

    /* renamed from: C */
    public final int m119819C(C17945a0 c17945a0) {
        C17990p0 c17990p0;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17990p0) {
            c17990p0 = (C17990p0) m94929K2;
        } else {
            c17990p0 = null;
        }
        if (c17990p0 == null) {
            return -1;
        }
        String str = c17990p0.f91115D;
        if (str == null) {
            str = "";
        }
        if (c17945a0.m95022U7() || AbstractC26687h.m137062c(c17945a0, c17990p0)) {
            return -1;
        }
        if (!AbstractC31990k7.m154226g(str) && !AbstractC31990k7.m154225f(str)) {
            if (AbstractC31990k7.m154228i(str)) {
                return AbstractC8020f0.str_save_video_context_menu;
            }
            return AbstractC8020f0.str_save_file_context_menu;
        }
        return AbstractC8020f0.str_save_photo_context_menu;
    }

    /* renamed from: F */
    public final int m119820F() {
        try {
            return AbstractC23304d.f113328S2[(int) (Math.random() * AbstractC23304d.f113328S2.length)];
        } catch (Exception unused) {
            return -11819806;
        }
    }

    /* renamed from: H */
    public final Drawable m119821H(String str, String str2) {
        AbstractC19074t.m100208f(str, "linkDomain");
        AbstractC19074t.m100208f(str2, "linkUrl");
        char charAt = str.charAt(0);
        C16640q2 mo88410d = C16640q2.m88404a().mo88408b().mo88409c().mo88407a().mo88410d(String.valueOf(charAt), m119787G(str2), AbstractC23136l9.m118742r(4.0f));
        AbstractC19074t.m100207e(mo88410d, "buildRoundRect(...)");
        return mo88410d;
    }

    /* renamed from: I */
    public final String m119822I(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (AbstractC25495a.m132079d(str)) {
            return "2";
        }
        return "1";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:            if (p716zh.C31944h6.m153548n(r0).length() > 0) goto L46;     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC2382z m119823J(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!AbstractC19646n0.m103031t1(c17945a0.m95041W4()) && !AbstractC19646n0.m102886D1(c17945a0.m95041W4()) && !AbstractC19646n0.m102995k1(c17945a0.m95041W4())) {
            if (!AbstractC19646n0.m103011o1(c17945a0)) {
                if (AbstractC19646n0.m103044x1(c17945a0.m95041W4())) {
                    String m95019U3 = c17945a0.m95019U3();
                    AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                }
                if (AbstractC19646n0.m103003m1(c17945a0.m95041W4())) {
                    return EnumC2382z.f9947t;
                }
                return EnumC2382z.f9944q;
            }
            return EnumC2382z.f9946s;
        }
        return EnumC2382z.f9945r;
    }

    /* renamed from: K */
    public final EnumC23663t m119824K(EnumC2363o enumC2363o) {
        AbstractC19074t.m100208f(enumC2363o, "filterMode");
        int i11 = b.f112649c[enumC2363o.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return EnumC23663t.f114624q;
            }
            return EnumC23663t.f114627t;
        }
        return EnumC23663t.f114626s;
    }

    /* renamed from: M */
    public final int m119825M(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (enumC2382z == EnumC2382z.f9946s) {
            return 8;
        }
        if (enumC2382z == EnumC2382z.f9947t) {
            return 9;
        }
        return 2;
    }

    /* renamed from: N */
    public final int m119826N(MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        if (mediaStoreItem.m40598l0()) {
            return 19;
        }
        if (mediaStoreItem.m40581Y()) {
            return 22;
        }
        if (mediaStoreItem.m40593h0()) {
            return 12;
        }
        if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m94868D3())) {
            return 4;
        }
        return 3;
    }

    /* renamed from: P */
    public final boolean m119827P(String str, boolean z11, C31973j5 c31973j5, boolean z12, boolean z13) {
        if (TextUtils.equals(CoreUtility.f89233i, str)) {
            return true;
        }
        if (z11 && c31973j5 != null) {
            if (z12) {
                return true;
            }
            if (z13) {
                AbstractC19074t.m100205c(str);
                if (!c31973j5.m153780q0(str) && !c31973j5.m153744V(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m119828Q(String str, String str2) {
        try {
            C31973j5 m4472f = C0943w.f3447a.m4472f(str);
            if (m4472f != null) {
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                if (!m4472f.m153744V(str3)) {
                    String str4 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str4, "currentUserUid");
                    if (!m4472f.m153780q0(str4) && (str2 == null || !AbstractC19074t.m100204b(str2, CoreUtility.f89233i))) {
                        return false;
                    }
                }
            } else if (str2 == null || !AbstractC19074t.m100204b(str2, CoreUtility.f89233i)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: b */
    public final C7906d m119829b(MediaStoreItem mediaStoreItem, List list) {
        Object obj;
        AbstractC19074t.m100208f(mediaStoreItem, "addedItem");
        AbstractC19074t.m100208f(list, "albumList");
        long m95313z4 = mediaStoreItem.m40599m().m95313z4();
        Calendar m119848y = m119848y();
        m119848y.setTimeInMillis(m95313z4);
        AbstractC23160o0.m119283q1(m119848y);
        long timeInMillis = m119848y.getTimeInMillis();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C7906d.b m40819h = ((C7906d) obj).m40819h();
                if (m40819h != null && m40819h.m40842b() == timeInMillis) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C7906d c7906d = (C7906d) obj;
        if (c7906d == null) {
            c7906d = C7906d.Companion.m40837a(timeInMillis);
            list.add(c7906d);
        }
        C7906d.b m40819h2 = c7906d.m40819h();
        if (m40819h2 != null) {
            m40819h2.m40845h(timeInMillis);
        }
        mediaStoreItem.m40618z0(timeInMillis);
        c7906d.m40814c(mediaStoreItem);
        return c7906d;
    }

    /* renamed from: c */
    public final C7906d m119830c(List list, MediaStoreItem mediaStoreItem, Map map, boolean z11, EnumC2382z enumC2382z) {
        long j11;
        C17945a0 m40599m;
        AbstractC19074t.m100208f(list, "containerSameDay");
        AbstractC19074t.m100208f(map, "headerAlbumList");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (mediaStoreItem != null && (m40599m = mediaStoreItem.m40599m()) != null) {
            j11 = m40599m.m95313z4();
        } else {
            j11 = 0;
        }
        Calendar m119848y = m119848y();
        m119848y.setTimeInMillis(j11);
        AbstractC23160o0.m119283q1(m119848y);
        long timeInMillis = m119848y.getTimeInMillis();
        String m119785D = m119785D(timeInMillis, EnumC2369r.f9911q, true);
        C7906d c7906d = (C7906d) map.get(m119785D);
        if (c7906d == null) {
            c7906d = C7906d.Companion.m40837a(timeInMillis);
            map.put(m119785D, c7906d);
        }
        C7906d.b m40819h = c7906d.m40819h();
        if (m40819h != null) {
            m40819h.m40845h(timeInMillis);
        }
        if (z11) {
            c7906d.m40823l().clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
            mediaStoreItem2.m40618z0(timeInMillis);
            c7906d.m40823l().add(mediaStoreItem2);
        }
        if (enumC2382z == EnumC2382z.f9945r) {
            m119838j0(c7906d.m40823l(), C3499e0.Companion.m17646b());
        }
        return c7906d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m119831d(C7906d c7906d, List list, boolean z11, EnumC2381y enumC2381y) {
        int i11;
        int m116584g;
        AbstractC19074t.m100208f(c7906d, "albumItem");
        AbstractC19074t.m100208f(list, "lstItems");
        AbstractC19074t.m100208f(enumC2381y, "layoutMode");
        m119804g(list, c7906d.m40823l());
        if (enumC2381y == EnumC2381y.f9939p) {
            if (z11) {
                int m40821j = c7906d.m40821j() + 1;
                List m40822k = c7906d.m40822k();
                int i12 = 0;
                if (!m40822k.isEmpty()) {
                    List list2 = (List) m40822k.get(m40822k.size() - 1);
                    if (!list2.isEmpty()) {
                        String m40623c = ((MediaStoreItem) list2.get(0)).m40559B().m40623c();
                        int m40622b = ((MediaStoreItem) list2.get(0)).m40559B().m40622b();
                        if (!AbstractC19074t.m100204b("layout2a", m40623c) && !AbstractC19074t.m100204b("layout2b", m40623c) && !AbstractC19074t.m100204b("layout3a", m40623c) && !AbstractC19074t.m100204b("layout3b", m40623c)) {
                            if (AbstractC19074t.m100204b("layout1", m40623c) && list2.size() < 3) {
                                int size = 3 - list2.size();
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(list2);
                                m116584g = AbstractC22543l.m116584g(size, list.size());
                                arrayList.addAll(list.subList(0, m116584g));
                                m119796X(arrayList, m40622b);
                                i12 = size;
                            }
                        } else {
                            i11 = 4;
                            if (i12 < list.size()) {
                                m119807h0(list, i12, m40821j, i11);
                            }
                            c7906d.m40815d(list);
                            c7906d.m40836z();
                            return;
                        }
                    }
                }
                i11 = 0;
                if (i12 < list.size()) {
                }
                c7906d.m40815d(list);
                c7906d.m40836z();
                return;
            }
            c7906d.m40815d(list);
            m119838j0(c7906d.m40823l(), enumC2381y);
            return;
        }
        c7906d.m40815d(list);
        c7906d.m40835x();
        if (enumC2381y != EnumC2381y.f9940q) {
            m119838j0(c7906d.m40823l(), enumC2381y);
        }
    }

    /* renamed from: d0 */
    public final void m119832d0(Matcher matcher, SpannableString spannableString, int i11) {
        AbstractC19074t.m100208f(matcher, "matcher");
        AbstractC19074t.m100208f(spannableString, "spannableString");
        try {
            HashMap hashMap = new HashMap();
            while (matcher.find()) {
                String group = matcher.group();
                if (!TextUtils.isEmpty(group) && !hashMap.containsKey(group)) {
                    AbstractC19074t.m100205c(group);
                    hashMap.put(group, group);
                    AbstractC23217t2.m119663o(spannableString, matcher.start(), matcher.end(), i11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public final void m119833e(C7226u3 c7226u3, View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new c(c7226u3));
        }
    }

    /* renamed from: e0 */
    public final void m119834e0(MessageId messageId, int i11, String str, C24753f c24753f, int i12, wa0 wa0Var, Rect rect) {
        if (messageId == null) {
            return;
        }
        try {
            if (!C23055e5.m118272g(true)) {
                return;
            }
            if (c24753f == null) {
                C24751d m126650x = C24261h.Companion.m126656b().m126650x(messageId);
                if (m126650x != null) {
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    c24753f = m126650x.m128570n(Integer.parseInt(str2));
                    if (c24753f == null) {
                    }
                }
                c24753f = C24265l.Companion.m126709b().m126700p();
            }
            if (wa0Var != null) {
                wa0Var.mo66703SA(c24753f.m128595h(), rect);
            }
            AbstractC19646n0.m102952Z1(i11, messageId, str, c24753f, i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    public final List m119835f(EnumC2382z enumC2382z, boolean z11, String str, C17945a0 c17945a0) {
        int m119819C;
        EnumC31105a m151139t;
        AbstractC19074t.m100208f(enumC2382z, "_mediaType");
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (enumC2382z == EnumC2382z.f9944q) {
            enumC2382z = m119823J(c17945a0);
        }
        ArrayList arrayList = new ArrayList();
        if (AbstractC25495a.m132078c(str) && C21373a.f104231a.m110807w().m110825b()) {
            HashMap hashMap = new HashMap();
            if (z11) {
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_from_collection));
                hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_remove_from_collection));
            } else {
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_add_item_to_collection));
                hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_btn_add_item_to_collection));
            }
            arrayList.add(hashMap);
        }
        EnumC2382z enumC2382z2 = EnumC2382z.f9947t;
        if (enumC2382z != enumC2382z2 || ((m151139t = AbstractC31111g.m151139t(c17945a0)) != EnumC31105a.f143335v && m151139t != EnumC31105a.f143337x)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.share));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.share));
            arrayList.add(hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        if (enumC2382z == EnumC2382z.f9946s) {
            hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_copy_link));
            hashMap3.put("id", Integer.valueOf(AbstractC8020f0.str_media_store_copy_link));
            arrayList.add(hashMap3);
        } else if (enumC2382z == enumC2382z2 && (m119819C = m119819C(c17945a0)) != -1) {
            hashMap3.put("name", AbstractC23136l9.m118743r0(m119819C));
            hashMap3.put("id", Integer.valueOf(m119819C));
            arrayList.add(hashMap3);
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_original_msg));
        hashMap4.put("id", Integer.valueOf(AbstractC8020f0.str_view_original_msg));
        arrayList.add(hashMap4);
        List singletonList = Collections.singletonList(c17945a0);
        AbstractC19074t.m100207e(singletonList, "singletonList(...)");
        if (C3522q.m17810f(str, singletonList).m17833a()) {
            HashMap hashMap5 = new HashMap();
            hashMap5.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
            hashMap5.put("id", Integer.valueOf(AbstractC8020f0.delete));
            arrayList.add(hashMap5);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final EnumC2382z m119836i(int i11) {
        if (!AbstractC19646n0.m103031t1(i11) && !AbstractC19646n0.m102886D1(i11) && !AbstractC19646n0.m102995k1(i11)) {
            if (!AbstractC19646n0.m103035u1(i11) && !AbstractC19646n0.m103044x1(i11)) {
                if (AbstractC19646n0.m103003m1(i11)) {
                    return EnumC2382z.f9947t;
                }
                return null;
            }
            return EnumC2382z.f9946s;
        }
        return EnumC2382z.f9945r;
    }

    /* renamed from: j */
    public final SelectedItemData m119837j(MediaStoreItem mediaStoreItem, String str) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        AbstractC19074t.m100208f(str, "tabType");
        return new SelectedItemData(str, mediaStoreItem.m40599m());
    }

    /* renamed from: j0 */
    public final void m119838j0(List list, EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(enumC2381y, "layoutMode");
        int i11 = b.f112647a[enumC2381y.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                m119805g0(list);
                return;
            } else {
                m119808i0(list, 4, EnumC2380x.f9934q);
                return;
            }
        }
        m119808i0(list, 3, EnumC2380x.f9935r);
    }

    /* renamed from: k */
    public final SelectedItemData m119839k(C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "tabType");
        return new SelectedItemData(str, c17945a0);
    }

    /* renamed from: k0 */
    public final boolean m119840k0(MessageId messageId, C3508j c3508j, EnumC2382z enumC2382z) {
        List m131496e;
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(c3508j, "albumItem");
        AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        try {
            AbstractC3498e m17615T = c3508j.m17615T(enumC2382z);
            if (m17615T != null && !m17615T.mo17561n().isEmpty()) {
                m131496e = AbstractC25366r.m131496e(messageId);
                return m17615T.m17571z(m131496e);
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0044, code lost:            r13.mo17831F(true);     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x001a, B:10:0x0022, B:13:0x0029, B:14:0x005b, B:17:0x006d, B:21:0x0094, B:26:0x007b, B:36:0x0044, B:37:0x0047), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m119841l0(String str, C17945a0 c17945a0, a aVar) {
        String str2;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        try {
            boolean z11 = true;
            if (c17945a0.m95089b4() != 3 && c17945a0.m95089b4() != 2 && c17945a0.m95089b4() != 4 && !c17945a0.m95180k8()) {
                C23288a c23288a = C23288a.f113033a;
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                AbstractC18428c.m97659b(c23288a, mo95039W2, 0, new Runnable() { // from class: me0.v4

                    /* renamed from: q */
                    public final /* synthetic */ C23250w4.a f112625q;

                    public /* synthetic */ RunnableC23240v4(C23250w4.a aVar2) {
                        r2 = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C23250w4.m119811m0(C17945a0.this, r2);
                    }
                }, 2, null);
                if (System.currentTimeMillis() - c17945a0.m94974P4() >= 120000) {
                    z11 = false;
                }
                if (!c17945a0.m94847A6()) {
                    if (z11) {
                        str2 = "10951";
                    } else {
                        str2 = "10950";
                    }
                } else if (C18644n.m98531l().m98558u(str)) {
                    if (z11) {
                        str2 = "99501";
                    } else {
                        str2 = "99500";
                    }
                } else if (z11) {
                    str2 = "99511";
                } else {
                    str2 = "99510";
                }
                AbstractC23647d.m123897g(str2);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(aVar2, c17945a0));
            c0766k.mo1474L4(c17945a0.mo95039W2(), c17945a0);
            if (System.currentTimeMillis() - c17945a0.m94974P4() >= 120000) {
            }
            if (!c17945a0.m94847A6()) {
            }
            AbstractC23647d.m123897g(str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            if (aVar2 != null) {
                aVar2.mo17831F(false);
            }
        }
    }

    /* renamed from: o */
    public final void m119842o(List list, String str) {
        List m131496e;
        AbstractC19074t.m100208f(list, "messageIds");
        AbstractC19074t.m100208f(str, "conversationId");
        if (list.isEmpty()) {
            return;
        }
        try {
            System.currentTimeMillis();
            List<C17945a0> m41557s = C7956b.Companion.m41573b().m41557s(list);
            ArrayList arrayList = new ArrayList();
            if (!m41557s.isEmpty()) {
                for (C17945a0 c17945a0 : m41557s) {
                    try {
                        C29590f m120610Q = AbstractC23306f.m120610Q();
                        AbstractC19074t.m100207e(m120610Q, "provideDeleteMsgLocalUseCase(...)");
                        m120610Q.m101508a(new C29590f.b(str, c17945a0));
                        C19610a m102633j = C19610a.m102633j();
                        m131496e = AbstractC25366r.m131496e(c17945a0);
                        m102633j.m102641o(m131496e);
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    if (!c17945a0.m94847A6() && c17945a0.m94877E3()) {
                        arrayList.add(c17945a0.m95029V3());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C24261h.Companion.m126656b().m126647n(str, arrayList, false);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: q */
    public final boolean m119843q() {
        return !AbstractC23304d.m120536g().f147983d;
    }

    /* renamed from: s */
    public final boolean m119844s() {
        return AbstractC23309i.m121036I3();
    }

    /* renamed from: t */
    public final void m119845t(C7906d c7906d) {
        int m116584g;
        AbstractC19074t.m100208f(c7906d, "albumItem");
        float f11 = 316 / 3;
        int m40824m = c7906d.m40824m();
        int i11 = ((m40824m - 1) / 3) + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 3;
            m116584g = AbstractC22543l.m116584g(i13 + 3, m40824m);
            int i14 = -1;
            while (i13 < m116584g) {
                MediaStoreItem.C7888c m40559B = ((MediaStoreItem) c7906d.m40823l().get(i13)).m40559B();
                m40559B.m40629i("layout1");
                m40559B.m40628h(i12);
                i14++;
                float f12 = (2 + f11) * i14;
                m40559B.m40632l(0.0f);
                m40559B.m40630j(f12);
                m40559B.m40631k(f12 + f11);
                m40559B.m40627g(f11);
                i13++;
            }
        }
    }

    /* renamed from: v */
    public final String m119846v(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String str = "";
        if (c17945a0.m95248s3() != 2) {
            return "";
        }
        long m95238r3 = c17945a0.m95238r3();
        if (m95238r3 > 0) {
            str = "" + AbstractC23041d2.m118226y(m95238r3);
        }
        if (c17945a0.m95003S4() > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_folder_items);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(c17945a0.m95003S4())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return str + " • " + format;
        }
        return str;
    }

    /* renamed from: w */
    public final Spanned m119847w(int i11, String str) {
        String m118746s0;
        AbstractC19074t.m100208f(str, "moreDesc");
        if (i11 == 1) {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_single, Integer.valueOf(i11));
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_plural, Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(m118746s0);
        if (str.length() > 0) {
            sb2.append("<br>");
            sb2.append(str);
        }
        Spanned m7440a = AbstractC1463b.m7440a(sb2.toString(), 0);
        AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
        return m7440a;
    }

    /* renamed from: y */
    public final Calendar m119848y() {
        Calendar calendar = Calendar.getInstance();
        AbstractC19074t.m100207e(calendar, "getInstance(...)");
        return calendar;
    }
}
