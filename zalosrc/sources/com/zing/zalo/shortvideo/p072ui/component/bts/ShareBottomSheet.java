package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C24999e;
import q20.C25084g;
import q20.C25085h;
import q20.C25095r;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class ShareBottomSheet extends BaseBottomSheetView {
    public static final C9517b Companion = new C9517b(null);

    /* renamed from: M0 */
    private InterfaceC9516a f50456M0;

    /* renamed from: N0 */
    private final CoroutineScope f50457N0 = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9516a {
        /* renamed from: a */
        void mo51915a(boolean z11);

        /* renamed from: b */
        void mo51916b();

        /* renamed from: c */
        void mo51917c(boolean z11);

        /* renamed from: d */
        void mo51918d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9517b {
        private C9517b() {
        }

        public /* synthetic */ C9517b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ShareBottomSheet m51919a(String str) {
            AbstractC19074t.m100208f(str, "shareUrl");
            ShareBottomSheet shareBottomSheet = new ShareBottomSheet();
            shareBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHARE_URL", str), AbstractC24866w.m129235a("SHARE_SOURCE", "app_profile_share")));
            return shareBottomSheet;
        }

        /* renamed from: b */
        public final ShareBottomSheet m51920b(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "shareUrl");
            ShareBottomSheet shareBottomSheet = new ShareBottomSheet();
            shareBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHARE_URL", str), AbstractC24866w.m129235a("SHARE_SOURCE", "app_content_share"), AbstractC24866w.m129235a("IS_LANDSCAPE", Boolean.valueOf(z11))));
            return shareBottomSheet;
        }

        /* renamed from: c */
        public final ShareBottomSheet m51921c(String str) {
            AbstractC19074t.m100208f(str, "shareUrl");
            ShareBottomSheet shareBottomSheet = new ShareBottomSheet();
            shareBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHARE_URL", str), AbstractC24866w.m129235a("SHARE_SOURCE", "app_location_share")));
            return shareBottomSheet;
        }

        /* renamed from: d */
        public final ShareBottomSheet m51922d(String str) {
            AbstractC19074t.m100208f(str, "shareUrl");
            ShareBottomSheet shareBottomSheet = new ShareBottomSheet();
            shareBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHARE_URL", str), AbstractC24866w.m129235a("SHARE_SOURCE", "app_content_share")));
            return shareBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class EnumC9518c extends Enum {

        /* renamed from: q */
        public static final EnumC9518c f50458q = new EnumC9518c("SHARE_CHAT", 0, "share_chat");

        /* renamed from: r */
        public static final EnumC9518c f50459r = new EnumC9518c("SHARE_DIARY", 1, "share_diary");

        /* renamed from: s */
        public static final EnumC9518c f50460s = new EnumC9518c("SHARE_OTHER", 2, "share_other");

        /* renamed from: t */
        private static final /* synthetic */ EnumC9518c[] f50461t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f50462u;

        /* renamed from: p */
        private final String f50463p;

        static {
            EnumC9518c[] m51923b = m51923b();
            f50461t = m51923b;
            f50462u = AbstractC30166b.m148796a(m51923b);
        }

        private EnumC9518c(String str, int i11, String str2) {
            super(str, i11);
            this.f50463p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC9518c[] m51923b() {
            return new EnumC9518c[]{f50458q, f50459r, f50460s};
        }

        public static EnumC9518c valueOf(String str) {
            return (EnumC9518c) Enum.valueOf(EnumC9518c.class, str);
        }

        public static EnumC9518c[] values() {
            return (EnumC9518c[]) f50461t.clone();
        }

        /* renamed from: c */
        public final String m51924c() {
            return this.f50463p;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C9519d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f50464t;

        /* renamed from: u */
        final /* synthetic */ String f50465u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f50466v;

        /* renamed from: w */
        final /* synthetic */ String f50467w;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50468t;

            /* renamed from: u */
            final /* synthetic */ String f50469u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation continuation) {
                super(2, continuation);
                this.f50469u = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f50469u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50468t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                    String str = this.f50469u;
                    this.f50468t = 1;
                    obj = m143667D.mo96615s(str, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$d$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50470t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f50471u;

            /* renamed from: v */
            final /* synthetic */ String f50472v;

            /* renamed from: w */
            final /* synthetic */ String f50473w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC18505l interfaceC18505l, String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f50471u = interfaceC18505l;
                this.f50472v = str;
                this.f50473w = str2;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f50471u, this.f50472v, this.f50473w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f50470t == 0) {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18505l interfaceC18505l = this.f50471u;
                    String str = this.f50472v;
                    if (str == null) {
                        str = this.f50473w;
                    }
                    interfaceC18505l.mo205i9(str);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$d$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50474t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f50475u;

            /* renamed from: v */
            final /* synthetic */ String f50476v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC18505l interfaceC18505l, String str, Continuation continuation) {
                super(2, continuation);
                this.f50475u = interfaceC18505l;
                this.f50476v = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f50475u, this.f50476v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f50474t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f50475u.mo205i9(this.f50476v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9519d(String str, InterfaceC18505l interfaceC18505l, String str2, Continuation continuation) {
            super(2, continuation);
            this.f50465u = str;
            this.f50466v = interfaceC18505l;
            this.f50467w = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9519d(this.f50465u, this.f50466v, this.f50467w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f50464t;
            try {
            } catch (Exception unused) {
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                c cVar = new c(this.f50466v, this.f50467w, null);
                this.f50464t = 3;
                if (BuildersKt.m112534g(m112681c, cVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                a aVar = new a(this.f50465u, null);
                this.f50464t = 1;
                obj = TimeoutKt.m112879d(1000L, aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC18505l interfaceC18505l = this.f50466v;
            String str = this.f50467w;
            MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
            b bVar = new b(interfaceC18505l, (String) obj, str, null);
            this.f50464t = 2;
            if (BuildersKt.m112534g(m112681c2, bVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9519d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$e */
    /* loaded from: classes5.dex */
    public static final class C9520e extends AbstractC19075u implements InterfaceC18505l {
        C9520e() {
            super(1);
        }

        /* renamed from: a */
        public final void m51929a(String str) {
            AbstractC19074t.m100208f(str, "link");
            C25095r.f120555a.m130134b(str);
            ShareBottomSheet.this.dismiss();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51929a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$f */
    /* loaded from: classes5.dex */
    public static final class C9521f extends AbstractC19075u implements InterfaceC18505l {
        C9521f() {
            super(1);
        }

        /* renamed from: a */
        public final void m51930a(String str) {
            AbstractC19074t.m100208f(str, "link");
            C25095r.f120555a.m130135c(str);
            ShareBottomSheet.this.dismiss();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51930a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$g */
    /* loaded from: classes5.dex */
    public static final class C9522g extends AbstractC19075u implements InterfaceC18505l {
        C9522g() {
            super(1);
        }

        /* renamed from: a */
        public final void m51931a(String str) {
            AbstractC19074t.m100208f(str, "link");
            C25084g.f120484a.m130017a(ShareBottomSheet.this.getContext(), str);
            ShareBottomSheet.this.dismiss();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51931a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ShareBottomSheet$h */
    /* loaded from: classes5.dex */
    public static final class C9523h extends AbstractC19075u implements InterfaceC18505l {
        C9523h() {
            super(1);
        }

        /* renamed from: a */
        public final void m51932a(String str) {
            AbstractC19074t.m100208f(str, "link");
            C25095r.f120555a.m130133a(str);
            ShareBottomSheet.this.dismiss();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51932a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: mL */
    private final String m51908mL(String str, C24860q... c24860qArr) {
        boolean m127128x;
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (C24860q c24860q : c24860qArr) {
                String str2 = (String) c24860q.m129213a();
                String str3 = (String) c24860q.m129214b();
                if (str3 != null) {
                    m127128x = AbstractC24341v.m127128x(str3);
                    if (!m127128x) {
                        buildUpon.appendQueryParameter(str2, str3);
                    }
                }
            }
            String builder = buildUpon.toString();
            AbstractC19074t.m100205c(builder);
            return builder;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: nL */
    private final void m51909nL(String str, String str2, String str3, InterfaceC18505l interfaceC18505l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHH", Locale.getDefault());
        C27417l c27417l = C27417l.f129055a;
        BuildersKt__Builders_commonKt.m112540d(this.f50457N0, null, null, new C9519d(m51908mL(str, AbstractC24866w.m129235a("source", str2), AbstractC24866w.m129235a("share_time", simpleDateFormat.format(Long.valueOf(c27417l.m140382f().m130131a()))), AbstractC24866w.m129235a("share_uid", c27417l.m140378b().m51234g()), AbstractC24866w.m129235a("ctx", str3)), interfaceC18505l, str, null), 3, null);
    }

    /* renamed from: oL */
    public static final void m51910oL(ShareBottomSheet shareBottomSheet, String str, String str2, View view) {
        AbstractC19074t.m100208f(shareBottomSheet, "this$0");
        shareBottomSheet.m51909nL(str, str2, "messageZalo", new C9520e());
        InterfaceC9516a interfaceC9516a = shareBottomSheet.f50456M0;
        if (interfaceC9516a != null) {
            interfaceC9516a.mo51915a(true);
        }
        C27417l.f129055a.m140380d().mo146333h(EnumC9518c.f50458q.m51924c());
    }

    /* renamed from: pL */
    public static final void m51911pL(ShareBottomSheet shareBottomSheet, String str, String str2, View view) {
        AbstractC19074t.m100208f(shareBottomSheet, "this$0");
        shareBottomSheet.m51909nL(str, str2, "feedZalo", new C9521f());
        InterfaceC9516a interfaceC9516a = shareBottomSheet.f50456M0;
        if (interfaceC9516a != null) {
            interfaceC9516a.mo51917c(true);
        }
        C27417l.f129055a.m140380d().mo146333h(EnumC9518c.f50459r.m51924c());
    }

    /* renamed from: qL */
    public static final void m51912qL(ShareBottomSheet shareBottomSheet, String str, String str2, View view) {
        AbstractC19074t.m100208f(shareBottomSheet, "this$0");
        shareBottomSheet.m51909nL(str, str2, null, new C9522g());
        InterfaceC9516a interfaceC9516a = shareBottomSheet.f50456M0;
        if (interfaceC9516a != null) {
            interfaceC9516a.mo51918d();
        }
    }

    /* renamed from: rL */
    public static final void m51913rL(ShareBottomSheet shareBottomSheet, String str, String str2, View view) {
        AbstractC19074t.m100208f(shareBottomSheet, "this$0");
        shareBottomSheet.m51909nL(str, str2, null, new C9523h());
        InterfaceC9516a interfaceC9516a = shareBottomSheet.f50456M0;
        if (interfaceC9516a != null) {
            interfaceC9516a.mo51916b();
        }
        C27417l.f129055a.m140380d().mo146333h(EnumC9518c.f50460s.m51924c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
        m51756aL(true);
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("IS_LANDSCAPE", false);
        }
        m51759dL(z11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        JobKt__JobKt.m112765d(this.f50457N0.mo9207O(), null, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        JobKt__JobKt.m112768g(this.f50457N0.mo9207O(), null, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C24999e m129794c = C24999e.m129794c(layoutInflater, viewGroup, false);
        Bundle m92642L3 = m92642L3();
        String str2 = null;
        if (m92642L3 != null) {
            str = m92642L3.getString("SHARE_URL");
        } else {
            str = null;
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            str2 = m92642L32.getString("SHARE_SOURCE");
        }
        if (str != null && str2 != null) {
            User m140378b = C27417l.f129055a.m140378b();
            if (m140378b.m51245t()) {
                RobotoTextView robotoTextView = m129794c.f119861q;
                AbstractC19074t.m100207e(robotoTextView, "btnShareChat");
                AbstractC26112n.m134403i0(robotoTextView, C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_border_subtle, 0, 0, AbstractC23322a.zds_ic_chat_line_24, AbstractC27406a.zch_icon_secondary, AbstractC27407b.zch_bts_share_item_icon_inset, 6, null));
                m129794c.f119861q.setOnClickListener(new View.OnClickListener() { // from class: v10.j

                    /* renamed from: q */
                    public final /* synthetic */ String f129119q;

                    /* renamed from: r */
                    public final /* synthetic */ String f129120r;

                    public /* synthetic */ ViewOnClickListenerC27432j(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareBottomSheet.m51910oL(ShareBottomSheet.this, r2, r3, view);
                    }
                });
            } else {
                RobotoTextView robotoTextView2 = m129794c.f119861q;
                AbstractC19074t.m100207e(robotoTextView2, "btnShareChat");
                AbstractC26112n.m134367H(robotoTextView2);
            }
            if (m140378b.m51247w()) {
                RobotoTextView robotoTextView3 = m129794c.f119862r;
                AbstractC19074t.m100207e(robotoTextView3, "btnShareDiary");
                AbstractC26112n.m134403i0(robotoTextView3, C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_border_subtle, 0, 0, AbstractC23322a.zds_ic_clock_2_line_24, AbstractC27406a.zch_icon_secondary, AbstractC27407b.zch_bts_share_item_icon_inset, 6, null));
                m129794c.f119862r.setOnClickListener(new View.OnClickListener() { // from class: v10.k

                    /* renamed from: q */
                    public final /* synthetic */ String f129122q;

                    /* renamed from: r */
                    public final /* synthetic */ String f129123r;

                    public /* synthetic */ ViewOnClickListenerC27433k(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareBottomSheet.m51911pL(ShareBottomSheet.this, r2, r3, view);
                    }
                });
            } else {
                RobotoTextView robotoTextView4 = m129794c.f119862r;
                AbstractC19074t.m100207e(robotoTextView4, "btnShareDiary");
                AbstractC26112n.m134367H(robotoTextView4);
            }
            if (m140378b.m51244q()) {
                RobotoTextView robotoTextView5 = m129794c.f119863s;
                AbstractC19074t.m100207e(robotoTextView5, "btnShareLink");
                AbstractC26112n.m134403i0(robotoTextView5, C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_border_subtle, 0, 0, AbstractC23322a.zds_ic_link_line_24, AbstractC27406a.zch_icon_secondary, AbstractC27407b.zch_bts_share_item_icon_inset, 6, null));
                m129794c.f119863s.setOnClickListener(new View.OnClickListener() { // from class: v10.l

                    /* renamed from: q */
                    public final /* synthetic */ String f129125q;

                    /* renamed from: r */
                    public final /* synthetic */ String f129126r;

                    public /* synthetic */ ViewOnClickListenerC27434l(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareBottomSheet.m51912qL(ShareBottomSheet.this, r2, r3, view);
                    }
                });
            } else {
                RobotoTextView robotoTextView6 = m129794c.f119863s;
                AbstractC19074t.m100207e(robotoTextView6, "btnShareLink");
                AbstractC26112n.m134367H(robotoTextView6);
            }
            if (m140378b.m51246u()) {
                RobotoTextView robotoTextView7 = m129794c.f119864t;
                AbstractC19074t.m100207e(robotoTextView7, "btnShareOther");
                AbstractC26112n.m134403i0(robotoTextView7, C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_border_subtle, 0, 0, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC27406a.zch_icon_secondary, AbstractC27407b.zch_bts_share_item_icon_inset, 6, null));
                m129794c.f119864t.setOnClickListener(new View.OnClickListener() { // from class: v10.m

                    /* renamed from: q */
                    public final /* synthetic */ String f129128q;

                    /* renamed from: r */
                    public final /* synthetic */ String f129129r;

                    public /* synthetic */ ViewOnClickListenerC27435m(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareBottomSheet.m51913rL(ShareBottomSheet.this, r2, r3, view);
                    }
                });
            } else {
                RobotoTextView robotoTextView8 = m129794c.f119864t;
                AbstractC19074t.m100207e(robotoTextView8, "btnShareOther");
                AbstractC26112n.m134367H(robotoTextView8);
            }
        }
        LinearLayout root = m129794c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: sL */
    public final void m51914sL(InterfaceC9516a interfaceC9516a) {
        this.f50456M0 = interfaceC9516a;
    }
}
