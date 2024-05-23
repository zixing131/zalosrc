package com.zing.zalo.feed.mvp.utils;

import ac.C0708i;
import ac.C0732w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC2144f;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p354n3.C23528a;
import p649xl.C29974p2;
import p649xl.C29992q2;
import p649xl.C30010r2;
import p649xl.C30027s2;
import p649xl.C30044t2;
import pm0.C24848g0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class DefaultBottomSheetAdapter extends RecyclerView.AbstractC1880g {
    public static final C8808b Companion = new C8808b(null);

    /* renamed from: r */
    private String f47132r;

    /* renamed from: s */
    private List f47133s;

    /* renamed from: t */
    private InterfaceC8815i f47134t;

    @InterfaceC25392g
    /* loaded from: classes4.dex */
    public static final class IconByTheme {
        public static final Companion Companion = new Companion(null);

        /* renamed from: c */
        private static final IconByTheme f47135c = new IconByTheme((String) null, (String) null, 3, (AbstractC19060k) null);

        /* renamed from: a */
        private final String f47136a;

        /* renamed from: b */
        private final String f47137b;

        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return DefaultBottomSheetAdapter$IconByTheme$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ IconByTheme(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f47136a = "";
            } else {
                this.f47136a = str;
            }
            if ((i11 & 2) == 0) {
                this.f47137b = "";
            } else {
                this.f47137b = str2;
            }
        }

        /* renamed from: b */
        public static final /* synthetic */ void m47071b(IconByTheme iconByTheme, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(iconByTheme.f47136a, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 0, iconByTheme.f47136a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(iconByTheme.f47137b, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 1, iconByTheme.f47137b);
            }
        }

        /* renamed from: a */
        public final String m47072a() {
            if (C23212s8.m119603k()) {
                return this.f47136a;
            }
            return this.f47137b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconByTheme)) {
                return false;
            }
            IconByTheme iconByTheme = (IconByTheme) obj;
            return AbstractC19074t.m100204b(this.f47136a, iconByTheme.f47136a) && AbstractC19074t.m100204b(this.f47137b, iconByTheme.f47137b);
        }

        public int hashCode() {
            return (this.f47136a.hashCode() * 31) + this.f47137b.hashCode();
        }

        public String toString() {
            return "IconByTheme(light=" + this.f47136a + ", dark=" + this.f47137b + ")";
        }

        public IconByTheme(String str, String str2) {
            AbstractC19074t.m100208f(str, "light");
            AbstractC19074t.m100208f(str2, "dark");
            this.f47136a = str;
            this.f47137b = str2;
        }

        public /* synthetic */ IconByTheme(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$a */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8807a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC8807a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public abstract void mo47073i0(Object obj);
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$b */
    /* loaded from: classes4.dex */
    public static final class C8808b {
        private C8808b() {
        }

        public /* synthetic */ C8808b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$c */
    /* loaded from: classes4.dex */
    public static final class C8809c extends AbstractC8818l {

        /* renamed from: c */
        private final TextLocalization f47138c;

        /* renamed from: d */
        private final TextLocalization f47139d;

        /* renamed from: e */
        private final IconByTheme f47140e;

        /* renamed from: f */
        private boolean f47141f;

        /* renamed from: g */
        private final String f47142g;

        /* renamed from: h */
        private final String f47143h;

        /* renamed from: i */
        private final String f47144i;

        /* renamed from: j */
        private final C0708i f47145j;

        /* renamed from: k */
        private final boolean f47146k;

        /* renamed from: l */
        private int f47147l;

        public /* synthetic */ C8809c(TextLocalization textLocalization, TextLocalization textLocalization2, IconByTheme iconByTheme, boolean z11, String str, String str2, String str3, C0708i c0708i, boolean z12, int i11, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? null : textLocalization, (i12 & 2) != 0 ? null : textLocalization2, (i12 & 4) != 0 ? null : iconByTheme, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? "" : str, (i12 & 32) == 0 ? str2 : "", (i12 & 64) != 0 ? null : str3, (i12 & 128) == 0 ? c0708i : null, (i12 & 256) == 0 ? z12 : false, (i12 & 512) != 0 ? 4 : i11);
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: a */
        public int mo47074a() {
            return this.f47147l;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: b */
        public void mo47075b(boolean z11) {
            this.f47141f = z11;
        }

        /* renamed from: c */
        public final String m47076c() {
            return this.f47143h;
        }

        /* renamed from: d */
        public final String m47077d() {
            return this.f47142g;
        }

        /* renamed from: e */
        public final IconByTheme m47078e() {
            return this.f47140e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8809c)) {
                return false;
            }
            C8809c c8809c = (C8809c) obj;
            return AbstractC19074t.m100204b(this.f47138c, c8809c.f47138c) && AbstractC19074t.m100204b(this.f47139d, c8809c.f47139d) && AbstractC19074t.m100204b(this.f47140e, c8809c.f47140e) && this.f47141f == c8809c.f47141f && AbstractC19074t.m100204b(this.f47142g, c8809c.f47142g) && AbstractC19074t.m100204b(this.f47143h, c8809c.f47143h) && AbstractC19074t.m100204b(this.f47144i, c8809c.f47144i) && AbstractC19074t.m100204b(this.f47145j, c8809c.f47145j) && this.f47146k == c8809c.f47146k && this.f47147l == c8809c.f47147l;
        }

        /* renamed from: f */
        public final boolean m47079f() {
            return this.f47146k;
        }

        /* renamed from: g */
        public final TextLocalization m47080g() {
            return this.f47139d;
        }

        /* renamed from: h */
        public final TextLocalization m47081h() {
            return this.f47138c;
        }

        public int hashCode() {
            TextLocalization textLocalization = this.f47138c;
            int hashCode = (textLocalization == null ? 0 : textLocalization.hashCode()) * 31;
            TextLocalization textLocalization2 = this.f47139d;
            int hashCode2 = (hashCode + (textLocalization2 == null ? 0 : textLocalization2.hashCode())) * 31;
            IconByTheme iconByTheme = this.f47140e;
            int hashCode3 = (((((((hashCode2 + (iconByTheme == null ? 0 : iconByTheme.hashCode())) * 31) + AbstractC2144f.m11520a(this.f47141f)) * 31) + this.f47142g.hashCode()) * 31) + this.f47143h.hashCode()) * 31;
            String str = this.f47144i;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            C0708i c0708i = this.f47145j;
            return ((((hashCode4 + (c0708i != null ? c0708i.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f47146k)) * 31) + this.f47147l;
        }

        /* renamed from: i */
        public final C0708i m47082i() {
            return this.f47145j;
        }

        /* renamed from: j */
        public final String m47083j() {
            return this.f47144i;
        }

        /* renamed from: k */
        public boolean m47084k() {
            return this.f47141f;
        }

        public String toString() {
            return "DynamicOptionRowData(title=" + this.f47138c + ", subTitle=" + this.f47139d + ", iconUrl=" + this.f47140e + ", isShowDivider=" + this.f47141f + ", actionType=" + this.f47142g + ", actionData=" + this.f47143h + ", trackingId=" + this.f47144i + ", trackingExtraData=" + this.f47145j + ", showBetaBadge=" + this.f47146k + ", rowType=" + this.f47147l + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8809c(TextLocalization textLocalization, TextLocalization textLocalization2, IconByTheme iconByTheme, boolean z11, String str, String str2, String str3, C0708i c0708i, boolean z12, int i11) {
            super(i11, false, 2, null);
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            this.f47138c = textLocalization;
            this.f47139d = textLocalization2;
            this.f47140e = iconByTheme;
            this.f47141f = z11;
            this.f47142g = str;
            this.f47143h = str2;
            this.f47144i = str3;
            this.f47145j = c0708i;
            this.f47146k = z12;
            this.f47147l = i11;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$d */
    /* loaded from: classes4.dex */
    public final class C8810d extends AbstractC8807a {

        /* renamed from: I */
        private final C29974p2 f47148I;

        /* renamed from: J */
        private final RecyclingImageView f47149J;

        /* renamed from: K */
        private C23528a f47150K;

        /* renamed from: L */
        final /* synthetic */ DefaultBottomSheetAdapter f47151L;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C8810d(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C29974p2 c29974p2) {
            super(r3);
            AbstractC19074t.m100208f(c29974p2, "binding");
            this.f47151L = defaultBottomSheetAdapter;
            TrackingRelativeLayout root = c29974p2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f47148I = c29974p2;
            RecyclingImageView recyclingImageView = new RecyclingImageView(c29974p2.getRoot().getContext());
            int i11 = AbstractC23222t7.f112514B;
            recyclingImageView.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
            this.f47149J = recyclingImageView;
            this.f47150K = new C23528a(c29974p2.getRoot().getContext());
            c29974p2.f138937q.m90587c(recyclingImageView);
            c29974p2.f138937q.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
        }

        /* renamed from: l0 */
        public static final void m47086l0(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C8809c c8809c, View view) {
            AbstractC19074t.m100208f(defaultBottomSheetAdapter, "this$0");
            AbstractC19074t.m100208f(c8809c, "$data");
            C0732w.m1177r(C0732w.Companion.m1189a(), "click_dynamic_slot_avatar_bts", null, null, null, 14, null);
            InterfaceC8815i interfaceC8815i = defaultBottomSheetAdapter.f47134t;
            if (interfaceC8815i != null) {
                interfaceC8815i.mo46379m(c8809c.m47077d(), c8809c.m47076c());
            }
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: k0 */
        public void mo47073i0(C8809c c8809c) {
            String str;
            String str2;
            String m44977b;
            AbstractC19074t.m100208f(c8809c, "data");
            Context context = this.f47148I.getRoot().getContext();
            C23528a c23528a = (C23528a) this.f47150K.m123612r(this.f47149J);
            IconByTheme m47078e = c8809c.m47078e();
            if (m47078e != null) {
                str = m47078e.m47072a();
            } else {
                str = null;
            }
            c23528a.m123616v(str);
            ListItem listItem = this.f47148I.f138937q;
            TextLocalization m47081h = c8809c.m47081h();
            String str3 = "";
            if (m47081h == null || (str2 = m47081h.m44977b()) == null) {
                str2 = "";
            }
            listItem.setTitle(str2);
            ListItem listItem2 = this.f47148I.f138937q;
            TextLocalization m47080g = c8809c.m47080g();
            if (m47080g != null && (m44977b = m47080g.m44977b()) != null) {
                str3 = m44977b;
            }
            listItem2.setSubtitle(str3);
            this.f47148I.f138937q.setLeadingGravity(EnumC16952b0.CENTER);
            if (c8809c.m47084k()) {
                this.f47148I.f138937q.m90592m(true);
                this.f47148I.f138937q.m90591l(AbstractC23222t7.f112545X, 0, 0, 0);
            } else {
                this.f47148I.f138937q.m90592m(false);
            }
            String m47083j = c8809c.m47083j();
            if (m47083j != null) {
                this.f47148I.getRoot().setIdTracking(m47083j);
            }
            C0708i m47082i = c8809c.m47082i();
            if (m47082i != null) {
                this.f47148I.getRoot().setTrackingExtraData(m47082i);
            }
            this.f47148I.getRoot().setOnClickListener(new View.OnClickListener() { // from class: qr.e

                /* renamed from: q */
                public final /* synthetic */ DefaultBottomSheetAdapter.C8809c f122056q;

                public /* synthetic */ ViewOnClickListenerC25472e(DefaultBottomSheetAdapter.C8809c c8809c2) {
                    r2 = c8809c2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultBottomSheetAdapter.C8810d.m47086l0(DefaultBottomSheetAdapter.this, r2, view);
                }
            });
            if (c8809c2.m47079f()) {
                AbstractC19074t.m100205c(context);
                C16974f c16974f = new C16974f(context);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_beta_badge);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                c16974f.m90972v(m118743r0);
                c16974f.m90974x(EnumC16991i.NEW_TEXT);
                this.f47148I.f138937q.getBadgeTitle().setVisibility(0);
                this.f47148I.f138937q.getBadgeTitle().m90493g(c16974f);
                return;
            }
            this.f47148I.f138937q.getBadgeTitle().setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$e */
    /* loaded from: classes4.dex */
    public final class C8811e extends AbstractC8807a {

        /* renamed from: I */
        final /* synthetic */ DefaultBottomSheetAdapter f47152I;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C8811e(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C29992q2 c29992q2) {
            super(r2);
            AbstractC19074t.m100208f(c29992q2, "binding");
            this.f47152I = defaultBottomSheetAdapter;
            RelativeLayout root = c29992q2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: j0 */
        public void mo47073i0(C8812f c8812f) {
            AbstractC19074t.m100208f(c8812f, "data");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$f */
    /* loaded from: classes4.dex */
    public static final class C8812f extends AbstractC8818l {

        /* renamed from: c */
        private int f47153c;

        public C8812f(int i11) {
            super(i11, false, 2, null);
            this.f47153c = i11;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: a */
        public int mo47074a() {
            return this.f47153c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8812f) && this.f47153c == ((C8812f) obj).f47153c;
        }

        public int hashCode() {
            return this.f47153c;
        }

        public String toString() {
            return "FullDividerRowData(rowType=" + this.f47153c + ")";
        }

        public /* synthetic */ C8812f(int i11, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? 3 : i11);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$g */
    /* loaded from: classes4.dex */
    public static final class C8813g extends AbstractC8818l {

        /* renamed from: c */
        private final String f47154c;

        /* renamed from: d */
        private int f47155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8813g(String str, int i11) {
            super(i11, false, 2, null);
            AbstractC19074t.m100208f(str, "text");
            this.f47154c = str;
            this.f47155d = i11;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: a */
        public int mo47074a() {
            return this.f47155d;
        }

        /* renamed from: c */
        public final String m47089c() {
            return this.f47154c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8813g)) {
                return false;
            }
            C8813g c8813g = (C8813g) obj;
            return AbstractC19074t.m100204b(this.f47154c, c8813g.f47154c) && this.f47155d == c8813g.f47155d;
        }

        public int hashCode() {
            return (this.f47154c.hashCode() * 31) + this.f47155d;
        }

        public String toString() {
            return "LabelRowData(text=" + this.f47154c + ", rowType=" + this.f47155d + ")";
        }

        public /* synthetic */ C8813g(String str, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(str, (i12 & 2) != 0 ? 0 : i11);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$h */
    /* loaded from: classes4.dex */
    public final class C8814h extends AbstractC8807a {

        /* renamed from: I */
        private final C30010r2 f47156I;

        /* renamed from: J */
        final /* synthetic */ DefaultBottomSheetAdapter f47157J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C8814h(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C30010r2 c30010r2) {
            super(r2);
            AbstractC19074t.m100208f(c30010r2, "binding");
            this.f47157J = defaultBottomSheetAdapter;
            RelativeLayout root = c30010r2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f47156I = c30010r2;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: j0 */
        public void mo47073i0(C8813g c8813g) {
            AbstractC19074t.m100208f(c8813g, "data");
            this.f47156I.f139188q.setText(c8813g.m47089c());
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$i */
    /* loaded from: classes4.dex */
    public interface InterfaceC8815i {
        /* renamed from: l */
        void mo46378l(int i11);

        /* renamed from: m */
        void mo46379m(String str, String str2);
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$j */
    /* loaded from: classes4.dex */
    public static final class C8816j extends AbstractC8818l {

        /* renamed from: c */
        private final int f47158c;

        /* renamed from: d */
        private final int f47159d;

        /* renamed from: e */
        private final String f47160e;

        /* renamed from: f */
        private final String f47161f;

        /* renamed from: g */
        private boolean f47162g;

        /* renamed from: h */
        private final String f47163h;

        /* renamed from: i */
        private final C0708i f47164i;

        /* renamed from: j */
        private int f47165j;

        /* renamed from: k */
        private final boolean f47166k;

        public /* synthetic */ C8816j(int i11, int i12, String str, String str2, boolean z11, String str3, C0708i c0708i, int i13, boolean z12, int i14, AbstractC19060k abstractC19060k) {
            this(i11, i12, str, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? false : z11, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : c0708i, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? false : z12);
        }

        /* renamed from: d */
        public static /* synthetic */ C8816j m47091d(C8816j c8816j, int i11, int i12, String str, String str2, boolean z11, String str3, C0708i c0708i, int i13, boolean z12, int i14, Object obj) {
            return c8816j.m47092c((i14 & 1) != 0 ? c8816j.f47158c : i11, (i14 & 2) != 0 ? c8816j.f47159d : i12, (i14 & 4) != 0 ? c8816j.f47160e : str, (i14 & 8) != 0 ? c8816j.f47161f : str2, (i14 & 16) != 0 ? c8816j.f47162g : z11, (i14 & 32) != 0 ? c8816j.f47163h : str3, (i14 & 64) != 0 ? c8816j.f47164i : c0708i, (i14 & 128) != 0 ? c8816j.f47165j : i13, (i14 & 256) != 0 ? c8816j.f47166k : z12);
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: a */
        public int mo47074a() {
            return this.f47165j;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: b */
        public void mo47075b(boolean z11) {
            this.f47162g = z11;
        }

        /* renamed from: c */
        public final C8816j m47092c(int i11, int i12, String str, String str2, boolean z11, String str3, C0708i c0708i, int i13, boolean z12) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "description");
            return new C8816j(i11, i12, str, str2, z11, str3, c0708i, i13, z12);
        }

        /* renamed from: e */
        public final String m47093e() {
            return this.f47161f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8816j)) {
                return false;
            }
            C8816j c8816j = (C8816j) obj;
            return this.f47158c == c8816j.f47158c && this.f47159d == c8816j.f47159d && AbstractC19074t.m100204b(this.f47160e, c8816j.f47160e) && AbstractC19074t.m100204b(this.f47161f, c8816j.f47161f) && this.f47162g == c8816j.f47162g && AbstractC19074t.m100204b(this.f47163h, c8816j.f47163h) && AbstractC19074t.m100204b(this.f47164i, c8816j.f47164i) && this.f47165j == c8816j.f47165j && this.f47166k == c8816j.f47166k;
        }

        /* renamed from: f */
        public final int m47094f() {
            return this.f47159d;
        }

        /* renamed from: g */
        public final int m47095g() {
            return this.f47158c;
        }

        /* renamed from: h */
        public final boolean m47096h() {
            return this.f47166k;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f47158c * 31) + this.f47159d) * 31) + this.f47160e.hashCode()) * 31) + this.f47161f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f47162g)) * 31;
            String str = this.f47163h;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C0708i c0708i = this.f47164i;
            return ((((hashCode2 + (c0708i != null ? c0708i.hashCode() : 0)) * 31) + this.f47165j) * 31) + AbstractC2144f.m11520a(this.f47166k);
        }

        /* renamed from: i */
        public final String m47097i() {
            return this.f47160e;
        }

        /* renamed from: j */
        public final C0708i m47098j() {
            return this.f47164i;
        }

        /* renamed from: k */
        public final String m47099k() {
            return this.f47163h;
        }

        /* renamed from: l */
        public boolean m47100l() {
            return this.f47162g;
        }

        public String toString() {
            return "OptionRowData(optionId=" + this.f47158c + ", iconRes=" + this.f47159d + ", title=" + this.f47160e + ", description=" + this.f47161f + ", isShowDivider=" + this.f47162g + ", trackingId=" + this.f47163h + ", trackingExtraData=" + this.f47164i + ", rowType=" + this.f47165j + ", showBetaBadge=" + this.f47166k + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8816j(int i11, int i12, String str, String str2, boolean z11, String str3, C0708i c0708i, int i13, boolean z12) {
            super(i13, false, 2, null);
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "description");
            this.f47158c = i11;
            this.f47159d = i12;
            this.f47160e = str;
            this.f47161f = str2;
            this.f47162g = z11;
            this.f47163h = str3;
            this.f47164i = c0708i;
            this.f47165j = i13;
            this.f47166k = z12;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$k */
    /* loaded from: classes4.dex */
    public final class C8817k extends AbstractC8807a {

        /* renamed from: I */
        private final C30027s2 f47167I;

        /* renamed from: J */
        private final RecyclingImageView f47168J;

        /* renamed from: K */
        final /* synthetic */ DefaultBottomSheetAdapter f47169K;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C8817k(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C30027s2 c30027s2) {
            super(r3);
            AbstractC19074t.m100208f(c30027s2, "binding");
            this.f47169K = defaultBottomSheetAdapter;
            TrackingRelativeLayout root = c30027s2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f47167I = c30027s2;
            RecyclingImageView recyclingImageView = new RecyclingImageView(c30027s2.getRoot().getContext());
            int i11 = AbstractC23222t7.f112514B;
            recyclingImageView.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
            this.f47168J = recyclingImageView;
            c30027s2.f139284q.m90587c(recyclingImageView);
            c30027s2.f139284q.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
        }

        /* renamed from: l0 */
        public static final void m47102l0(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C8816j c8816j, View view) {
            AbstractC19074t.m100208f(defaultBottomSheetAdapter, "this$0");
            AbstractC19074t.m100208f(c8816j, "$data");
            InterfaceC8815i interfaceC8815i = defaultBottomSheetAdapter.f47134t;
            if (interfaceC8815i != null) {
                interfaceC8815i.mo46378l(c8816j.m47095g());
            }
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: k0 */
        public void mo47073i0(C8816j c8816j) {
            AbstractC19074t.m100208f(c8816j, "data");
            Context context = this.f47167I.getRoot().getContext();
            RecyclingImageView recyclingImageView = this.f47168J;
            AbstractC19074t.m100205c(context);
            recyclingImageView.setImageDrawable(C27280g.m139660c(context, c8816j.m47094f(), AbstractC2807a.icon_02));
            this.f47167I.f139284q.setTitle(c8816j.m47097i());
            this.f47167I.f139284q.setSubtitle(c8816j.m47093e());
            if (c8816j.m47100l()) {
                this.f47167I.f139284q.m90592m(true);
                this.f47167I.f139284q.m90591l(AbstractC23222t7.f112545X, 0, 0, 0);
            } else {
                this.f47167I.f139284q.m90592m(false);
            }
            String m47099k = c8816j.m47099k();
            if (m47099k != null) {
                this.f47167I.getRoot().setIdTracking(m47099k);
            }
            C0708i m47098j = c8816j.m47098j();
            if (m47098j != null) {
                this.f47167I.getRoot().setTrackingExtraData(m47098j);
            }
            this.f47167I.getRoot().setOnClickListener(new View.OnClickListener() { // from class: qr.f

                /* renamed from: q */
                public final /* synthetic */ DefaultBottomSheetAdapter.C8816j f122058q;

                public /* synthetic */ ViewOnClickListenerC25473f(DefaultBottomSheetAdapter.C8816j c8816j2) {
                    r2 = c8816j2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultBottomSheetAdapter.C8817k.m47102l0(DefaultBottomSheetAdapter.this, r2, view);
                }
            });
            if (c8816j2.m47096h()) {
                C16974f c16974f = new C16974f(context);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_beta_badge);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                c16974f.m90972v(m118743r0);
                c16974f.m90974x(EnumC16991i.NEW_TEXT);
                this.f47167I.f139284q.getBadgeTitle().setVisibility(0);
                this.f47167I.f139284q.getBadgeTitle().m90493g(c16974f);
                return;
            }
            this.f47167I.f139284q.getBadgeTitle().setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$l */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8818l {

        /* renamed from: a */
        private int f47170a;

        /* renamed from: b */
        private boolean f47171b;

        public AbstractC8818l(int i11, boolean z11) {
            this.f47170a = i11;
            this.f47171b = z11;
        }

        /* renamed from: a */
        public abstract int mo47074a();

        /* renamed from: b */
        public void mo47075b(boolean z11) {
            this.f47171b = z11;
        }

        public /* synthetic */ AbstractC8818l(int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, (i12 & 2) != 0 ? false : z11);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$m */
    /* loaded from: classes4.dex */
    public static final class C8819m extends AbstractC8818l {

        /* renamed from: c */
        private final int f47172c;

        /* renamed from: d */
        private int f47173d;

        public C8819m(int i11, int i12) {
            super(i12, false, 2, null);
            this.f47172c = i11;
            this.f47173d = i12;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8818l
        /* renamed from: a */
        public int mo47074a() {
            return this.f47173d;
        }

        /* renamed from: c */
        public final int m47104c() {
            return this.f47172c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8819m)) {
                return false;
            }
            C8819m c8819m = (C8819m) obj;
            return this.f47172c == c8819m.f47172c && this.f47173d == c8819m.f47173d;
        }

        public int hashCode() {
            return (this.f47172c * 31) + this.f47173d;
        }

        public String toString() {
            return "SpaceDividerRowData(height=" + this.f47172c + ", rowType=" + this.f47173d + ")";
        }

        public /* synthetic */ C8819m(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
            this(i11, (i13 & 2) != 0 ? 2 : i12);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$n */
    /* loaded from: classes4.dex */
    public final class C8820n extends AbstractC8807a {

        /* renamed from: I */
        private final C30044t2 f47174I;

        /* renamed from: J */
        final /* synthetic */ DefaultBottomSheetAdapter f47175J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C8820n(DefaultBottomSheetAdapter defaultBottomSheetAdapter, C30044t2 c30044t2) {
            super(r2);
            AbstractC19074t.m100208f(c30044t2, "binding");
            this.f47175J = defaultBottomSheetAdapter;
            FrameLayout root = c30044t2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f47174I = c30044t2;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: j0 */
        public void mo47073i0(C8819m c8819m) {
            AbstractC19074t.m100208f(c8819m, "data");
            this.f47174I.f139372q.setLayoutParams(new ViewGroup.LayoutParams(-1, c8819m.m47104c()));
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter$o */
    /* loaded from: classes4.dex */
    public final class C8821o extends AbstractC8807a {

        /* renamed from: I */
        final /* synthetic */ DefaultBottomSheetAdapter f47176I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8821o(DefaultBottomSheetAdapter defaultBottomSheetAdapter, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f47176I = defaultBottomSheetAdapter;
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.AbstractC8807a
        /* renamed from: j0 */
        public void mo47073i0(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "data");
        }
    }

    public DefaultBottomSheetAdapter(String str) {
        AbstractC19074t.m100208f(str, "userId");
        this.f47132r = str;
        this.f47133s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(AbstractC8807a abstractC8807a, int i11) {
        AbstractC19074t.m100208f(abstractC8807a, "holder");
        abstractC8807a.mo47073i0(this.f47133s.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public AbstractC8807a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return new C8821o(this, new View(viewGroup.getContext()));
                        }
                        C29974p2 m148351c = C29974p2.m148351c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                        AbstractC19074t.m100207e(m148351c, "inflate(...)");
                        return new C8810d(this, m148351c);
                    }
                    C29992q2 m148388c = C29992q2.m148388c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    AbstractC19074t.m100207e(m148388c, "inflate(...)");
                    return new C8811e(this, m148388c);
                }
                C30044t2 m148512c = C30044t2.m148512c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148512c, "inflate(...)");
                return new C8820n(this, m148512c);
            }
            C30027s2 m148474c = C30027s2.m148474c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC19074t.m100207e(m148474c, "inflate(...)");
            return new C8817k(this, m148474c);
        }
        C30010r2 m148430c = C30010r2.m148430c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148430c, "inflate(...)");
        return new C8814h(this, m148430c);
    }

    /* renamed from: O */
    public final void m47068O(List list) {
        AbstractC19074t.m100208f(list, "listData");
        this.f47133s = list;
    }

    /* renamed from: P */
    public final void m47069P(InterfaceC8815i interfaceC8815i) {
        AbstractC19074t.m100208f(interfaceC8815i, "listener");
        this.f47134t = interfaceC8815i;
    }

    /* renamed from: Q */
    public final void m47070Q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f47132r = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f47133s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((AbstractC8818l) this.f47133s.get(i11)).mo47074a();
    }
}
