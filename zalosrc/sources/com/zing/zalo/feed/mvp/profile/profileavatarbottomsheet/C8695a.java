package com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet;

import ac.C0708i;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p142ey.C18634d;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p325lj.C22494a;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p427pq.EnumC24904a;
import p534u1.AbstractC26941a;

/* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a */
/* loaded from: classes4.dex */
public final class C8695a extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final DefaultBottomSheetAdapter.C8816j f46734A;

    /* renamed from: B */
    private final DefaultBottomSheetAdapter.C8816j f46735B;

    /* renamed from: C */
    private final DefaultBottomSheetAdapter.C8816j f46736C;

    /* renamed from: D */
    private final C1761c0 f46737D;

    /* renamed from: t */
    private final C1761c0 f46738t = new C1761c0();

    /* renamed from: u */
    private final DefaultBottomSheetAdapter.C8813g f46739u;

    /* renamed from: v */
    private final DefaultBottomSheetAdapter.C8816j f46740v;

    /* renamed from: w */
    private final DefaultBottomSheetAdapter.C8816j f46741w;

    /* renamed from: x */
    private final DefaultBottomSheetAdapter.C8813g f46742x;

    /* renamed from: y */
    private final DefaultBottomSheetAdapter.C8816j f46743y;

    /* renamed from: z */
    private final DefaultBottomSheetAdapter.C8816j f46744z;

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a */
        private final String f46745a;

        /* renamed from: b */
        private final String f46746b;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            this.f46745a = str;
            this.f46746b = str2;
        }

        /* renamed from: a */
        public final String m46396a() {
            return this.f46746b;
        }

        /* renamed from: b */
        public final String m46397b() {
            return this.f46745a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f46745a, bVar.f46745a) && AbstractC19074t.m100204b(this.f46746b, bVar.f46746b);
        }

        public int hashCode() {
            return (this.f46745a.hashCode() * 31) + this.f46746b.hashCode();
        }

        public String toString() {
            return "DynamicOptionSelectedEvent(actionType=" + this.f46745a + ", actionData=" + this.f46746b + ")";
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            if (cls.isAssignableFrom(C8695a.class)) {
                return new C8695a();
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a$d */
    /* loaded from: classes4.dex */
    public interface d {
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.a$e */
    /* loaded from: classes4.dex */
    public static final class e implements d {

        /* renamed from: a */
        private final int f46747a;

        public e(int i11) {
            this.f46747a = i11;
        }

        /* renamed from: a */
        public final int m46398a() {
            return this.f46747a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f46747a == ((e) obj).f46747a;
        }

        public int hashCode() {
            return this.f46747a;
        }

        public String toString() {
            return "OptionSelectedEvent(optionId=" + this.f46747a + ")";
        }
    }

    public C8695a() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_cm_type_story);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f46739u = new DefaultBottomSheetAdapter.C8813g(m118743r0, 0, 2, null);
        int i11 = AbstractC23322a.zds_ic_story_notif_line_24;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_story);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f46740v = new DefaultBottomSheetAdapter.C8816j(1, i11, m118743r02, null, false, "social_profile_avatar_view_story", null, 0, false, 472, null);
        int i12 = AbstractC23322a.zds_ic_add_story_line_24;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_details_create_story);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        this.f46741w = new DefaultBottomSheetAdapter.C8816j(2, i12, m118743r03, null, false, "social_profile_avatar_create_story", null, 0, false, 472, null);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changeavt_dialog_title);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        this.f46742x = new DefaultBottomSheetAdapter.C8813g(m118743r04, 0, 2, null);
        int i13 = AbstractC23322a.zds_ic_user_circle_line_24;
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_avataralbum);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        this.f46743y = new DefaultBottomSheetAdapter.C8816j(3, i13, m118743r05, null, false, "social_profile_avatar_view_avatar", null, 0, false, 472, null);
        int i14 = AbstractC23322a.zds_ic_camera_line_24;
        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto);
        AbstractC19074t.m100207e(m118743r06, "getString(...)");
        this.f46744z = new DefaultBottomSheetAdapter.C8816j(4, i14, m118743r06, null, false, "social_profile_avatar_take_new_photo", null, 0, false, 472, null);
        int i15 = AbstractC23322a.zds_ic_add_photo_line_24;
        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary);
        AbstractC19074t.m100207e(m118743r07, "getString(...)");
        this.f46734A = new DefaultBottomSheetAdapter.C8816j(5, i15, m118743r07, null, false, "social_profile_avatar_choose_from_gallery", null, 0, false, 472, null);
        int i16 = AbstractC23322a.zds_ic_gallery_line_24;
        String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reuseavatar);
        AbstractC19074t.m100207e(m118743r08, "getString(...)");
        this.f46735B = new DefaultBottomSheetAdapter.C8816j(6, i16, m118743r08, null, false, "social_profile_avatar_choose_from_old_avatar", null, 0, false, 472, null);
        int i17 = AbstractC23322a.zds_ic_ai_generated_avatar_line_24;
        String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_ai_avt_title);
        AbstractC19074t.m100207e(m118743r09, "getString(...)");
        this.f46736C = new DefaultBottomSheetAdapter.C8816j(7, i17, m118743r09, null, false, "social_profile_avatar_create_ai_avatar", null, 0, C22494a.f110026a.m116289d(), 216, null);
        this.f46737D = new C1761c0();
    }

    /* renamed from: O */
    private final List m46385O() {
        DefaultBottomSheetAdapter.C8816j m47092c;
        DefaultBottomSheetAdapter.C8816j m47092c2;
        ArrayList arrayList = new ArrayList();
        m47092c = r2.m47092c((r20 & 1) != 0 ? r2.f47158c : 0, (r20 & 2) != 0 ? r2.f47159d : 0, (r20 & 4) != 0 ? r2.f47160e : null, (r20 & 8) != 0 ? r2.f47161f : null, (r20 & 16) != 0 ? r2.f47162g : false, (r20 & 32) != 0 ? r2.f47163h : null, (r20 & 64) != 0 ? r2.f47164i : m46389S(1), (r20 & 128) != 0 ? r2.f47165j : 0, (r20 & 256) != 0 ? this.f46740v.f47166k : false);
        arrayList.add(m47092c);
        m47092c2 = r15.m47092c((r20 & 1) != 0 ? r15.f47158c : 0, (r20 & 2) != 0 ? r15.f47159d : 0, (r20 & 4) != 0 ? r15.f47160e : null, (r20 & 8) != 0 ? r15.f47161f : null, (r20 & 16) != 0 ? r15.f47162g : false, (r20 & 32) != 0 ? r15.f47163h : null, (r20 & 64) != 0 ? r15.f47164i : m46389S(1), (r20 & 128) != 0 ? r15.f47165j : 0, (r20 & 256) != 0 ? this.f46743y.f47166k : false);
        arrayList.add(m47092c2);
        return arrayList;
    }

    /* renamed from: P */
    private final List m46386P() {
        DefaultBottomSheetAdapter.C8816j m47092c;
        DefaultBottomSheetAdapter.C8816j m47092c2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46739u);
        if (AbstractC22055v0.m115118H(CoreUtility.f89233i)) {
            m47092c2 = r4.m47092c((r20 & 1) != 0 ? r4.f47158c : 0, (r20 & 2) != 0 ? r4.f47159d : 0, (r20 & 4) != 0 ? r4.f47160e : null, (r20 & 8) != 0 ? r4.f47161f : null, (r20 & 16) != 0 ? r4.f47162g : false, (r20 & 32) != 0 ? r4.f47163h : null, (r20 & 64) != 0 ? r4.f47164i : m46389S(0), (r20 & 128) != 0 ? r4.f47165j : 0, (r20 & 256) != 0 ? this.f46740v.f47166k : false);
            arrayList.add(m47092c2);
        }
        arrayList.add(this.f46741w);
        arrayList.add(new DefaultBottomSheetAdapter.C8819m(AbstractC23222t7.f112566j, 0, 2, null));
        arrayList.add(new DefaultBottomSheetAdapter.C8812f(0, 1, null));
        arrayList.add(new DefaultBottomSheetAdapter.C8819m(AbstractC23222t7.f112566j, 0, 2, null));
        arrayList.add(this.f46742x);
        C23302b c23302b = C23302b.f113247a;
        if (!c23302b.m120523d(AbstractC23304d.f113368c0.f42446v)) {
            m47092c = r5.m47092c((r20 & 1) != 0 ? r5.f47158c : 0, (r20 & 2) != 0 ? r5.f47159d : 0, (r20 & 4) != 0 ? r5.f47160e : null, (r20 & 8) != 0 ? r5.f47161f : null, (r20 & 16) != 0 ? r5.f47162g : false, (r20 & 32) != 0 ? r5.f47163h : null, (r20 & 64) != 0 ? r5.f47164i : m46389S(0), (r20 & 128) != 0 ? r5.f47165j : 0, (r20 & 256) != 0 ? this.f46743y.f47166k : false);
            arrayList.add(m47092c);
        }
        arrayList.add(this.f46744z);
        arrayList.add(this.f46734A);
        C18634d c18634d = C18634d.f93778a;
        c18634d.m98486j(false);
        boolean m116287b = C22494a.f110026a.m116287b();
        boolean m98479c = c18634d.m98479c();
        if (!c23302b.m120523d(AbstractC23304d.f113368c0.f42446v)) {
            arrayList.add(this.f46735B);
        }
        if (m116287b) {
            arrayList.add(this.f46736C);
        }
        if (m98479c) {
            arrayList.add(new DefaultBottomSheetAdapter.C8809c(new TextLocalization(c18634d.m98485i(), c18634d.m98484h()), new TextLocalization(c18634d.m98481e(), c18634d.m98480d()), new DefaultBottomSheetAdapter.IconByTheme(c18634d.m98483g(), c18634d.m98482f()), false, c18634d.m98478b(), c18634d.m98477a(), "social_profile_dynamic_option", null, false, 0, 904, null));
        }
        return arrayList;
    }

    /* renamed from: Q */
    private final List m46387Q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46742x);
        arrayList.add(this.f46744z);
        arrayList.add(this.f46734A);
        boolean m116287b = C22494a.f110026a.m116287b();
        if (!C23302b.f113247a.m120523d(AbstractC23304d.f113368c0.f42446v)) {
            arrayList.add(this.f46735B);
        }
        if (m116287b) {
            arrayList.add(this.f46736C);
        }
        return arrayList;
    }

    /* renamed from: R */
    private final List m46388R() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46742x);
        C23302b c23302b = C23302b.f113247a;
        if (!c23302b.m120523d(AbstractC23304d.f113368c0.f42446v)) {
            arrayList.add(this.f46743y);
        }
        arrayList.add(this.f46744z);
        arrayList.add(this.f46734A);
        boolean m116287b = C22494a.f110026a.m116287b();
        if (!c23302b.m120523d(AbstractC23304d.f113368c0.f42446v)) {
            arrayList.add(this.f46735B);
        }
        if (m116287b) {
            arrayList.add(this.f46736C);
        }
        return arrayList;
    }

    /* renamed from: S */
    private final C0708i m46389S(int i11) {
        C0708i c0708i = new C0708i();
        c0708i.m1072c("profile_type", i11);
        return c0708i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[LOOP:0: B:5:0x0009->B:11:0x0030, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[SYNTHETIC] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m46390V(List list) {
        try {
            int size = list.size() - 2;
            if (size >= 0) {
                int i11 = 0;
                while (true) {
                    DefaultBottomSheetAdapter.AbstractC8818l abstractC8818l = (DefaultBottomSheetAdapter.AbstractC8818l) list.get(i11);
                    int i12 = i11 + 1;
                    DefaultBottomSheetAdapter.AbstractC8818l abstractC8818l2 = (DefaultBottomSheetAdapter.AbstractC8818l) list.get(i12);
                    if (!(abstractC8818l instanceof DefaultBottomSheetAdapter.C8816j)) {
                        if (abstractC8818l instanceof DefaultBottomSheetAdapter.C8809c) {
                        }
                        if (i11 == size) {
                            i11 = i12;
                        } else {
                            return;
                        }
                    }
                    if ((abstractC8818l2 instanceof DefaultBottomSheetAdapter.C8816j) || (abstractC8818l2 instanceof DefaultBottomSheetAdapter.C8809c)) {
                        abstractC8818l.mo47075b(true);
                    }
                    if (i11 == size) {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122773c(e11);
        }
    }

    /* renamed from: T */
    public final LiveData m46391T() {
        return this.f46738t;
    }

    /* renamed from: U */
    public final C1761c0 m46392U() {
        return this.f46737D;
    }

    /* renamed from: W */
    public final void m46393W(String str, String str2) {
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        this.f46737D.mo9224q(new C19964c(new b(str, str2)));
    }

    /* renamed from: X */
    public final void m46394X(String str, String str2) {
        List m46387Q;
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "entrypoint");
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i) && AbstractC19074t.m100204b(str2, EnumC24904a.f119495q.m129507c())) {
            m46387Q = m46386P();
        } else if (AbstractC19074t.m100204b(str2, EnumC24904a.f119495q.m129507c())) {
            m46387Q = m46385O();
        } else if (AbstractC19074t.m100204b(str2, EnumC24904a.f119496r.m129507c())) {
            m46387Q = m46388R();
        } else {
            m46387Q = m46387Q();
        }
        m46390V(m46387Q);
        this.f46738t.mo9224q(m46387Q);
    }

    /* renamed from: Y */
    public final void m46395Y(int i11) {
        this.f46737D.mo9224q(new C19964c(new e(i11)));
    }
}
