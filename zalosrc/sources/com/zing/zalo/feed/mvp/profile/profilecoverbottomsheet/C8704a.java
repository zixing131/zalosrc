package com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p457qq.EnumC25467a;
import p534u1.AbstractC26941a;

/* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.a */
/* loaded from: classes4.dex */
public final class C8704a extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final C1761c0 f46758t = new C1761c0();

    /* renamed from: u */
    private final DefaultBottomSheetAdapter.C8813g f46759u;

    /* renamed from: v */
    private final DefaultBottomSheetAdapter.C8816j f46760v;

    /* renamed from: w */
    private final DefaultBottomSheetAdapter.C8816j f46761w;

    /* renamed from: x */
    private final DefaultBottomSheetAdapter.C8816j f46762x;

    /* renamed from: y */
    private final C1761c0 f46763y;

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            if (cls.isAssignableFrom(C8704a.class)) {
                return new C8704a();
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.a$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a */
        private final int f46764a;

        public d(int i11) {
            this.f46764a = i11;
        }

        /* renamed from: a */
        public final int m46418a() {
            return this.f46764a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f46764a == ((d) obj).f46764a;
        }

        public int hashCode() {
            return this.f46764a;
        }

        public String toString() {
            return "OptionSelectedEvent(optionId=" + this.f46764a + ")";
        }
    }

    public C8704a() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changecover_dialog_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f46759u = new DefaultBottomSheetAdapter.C8813g(m118743r0, 0, 2, null);
        int i11 = AbstractC23322a.zds_ic_photo_line_24;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_full_profile_cover);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f46760v = new DefaultBottomSheetAdapter.C8816j(7, i11, m118743r02, null, false, "social_profile_cover_view_detail", null, 0, false, 472, null);
        int i12 = AbstractC23322a.zds_ic_camera_line_24;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        this.f46761w = new DefaultBottomSheetAdapter.C8816j(8, i12, m118743r03, null, false, "social_profile_cover_take_new_photo", null, 0, false, 472, null);
        int i13 = AbstractC23322a.zds_ic_add_photo_line_24;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        this.f46762x = new DefaultBottomSheetAdapter.C8816j(9, i13, m118743r04, null, false, "social_profile_cover_choose_from_gallery", null, 0, false, 472, null);
        this.f46763y = new C1761c0();
    }

    /* renamed from: O */
    private final List m46411O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46759u);
        arrayList.add(this.f46760v);
        arrayList.add(this.f46761w);
        arrayList.add(this.f46762x);
        return arrayList;
    }

    /* renamed from: P */
    private final List m46412P() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46759u);
        arrayList.add(this.f46761w);
        arrayList.add(this.f46762x);
        return arrayList;
    }

    /* renamed from: S */
    private final void m46413S(List list) {
        int size = list.size() - 2;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                DefaultBottomSheetAdapter.AbstractC8818l abstractC8818l = (DefaultBottomSheetAdapter.AbstractC8818l) list.get(i11);
                int i12 = i11 + 1;
                DefaultBottomSheetAdapter.AbstractC8818l abstractC8818l2 = (DefaultBottomSheetAdapter.AbstractC8818l) list.get(i12);
                if (((abstractC8818l instanceof DefaultBottomSheetAdapter.C8816j) || (abstractC8818l instanceof DefaultBottomSheetAdapter.C8809c)) && ((abstractC8818l2 instanceof DefaultBottomSheetAdapter.C8816j) || (abstractC8818l2 instanceof DefaultBottomSheetAdapter.C8809c))) {
                    abstractC8818l.mo47075b(true);
                }
                if (i11 != size) {
                    i11 = i12;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: Q */
    public final LiveData m46414Q() {
        return this.f46758t;
    }

    /* renamed from: R */
    public final C1761c0 m46415R() {
        return this.f46763y;
    }

    /* renamed from: T */
    public final void m46416T(String str) {
        List m46412P;
        AbstractC19074t.m100208f(str, "entrypoint");
        if (AbstractC19074t.m100204b(str, EnumC25467a.f122043q.m131933c())) {
            m46412P = m46411O();
        } else {
            m46412P = m46412P();
        }
        m46413S(m46412P);
        this.f46758t.mo9224q(m46412P);
    }

    /* renamed from: U */
    public final void m46417U(int i11) {
        this.f46763y.mo9224q(new C19964c(new d(i11)));
    }
}
