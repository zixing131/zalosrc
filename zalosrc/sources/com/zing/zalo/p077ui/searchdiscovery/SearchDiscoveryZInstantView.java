package com.zing.zalo.p077ui.searchdiscovery;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.searchdiscovery.C13004b;
import com.zing.zalo.p077ui.searchdiscovery.SearchDiscoveryZInstantView;
import com.zing.zalo.p077ui.searchdiscovery.widget.TouchMonitorFrameLayout;
import com.zing.zalo.p077ui.searchglobal.C13027c;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTextInputLayout;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.InterfaceC17107c1;
import com.zing.zalo.zinstant.InterfaceC17246y0;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import ga0.C19322f1;
import gg0.AbstractC19444a;
import java.util.Arrays;
import java.util.List;
import kn.AbstractC21777d;
import lk0.InterfaceC22508f;
import me0.AbstractC23059e9;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p006a0.C0012a;
import p140ev.C18620i;
import p172fy.C19171b;
import p189gv.C19609h;
import p363nh.C23744a;
import p405ov.C24561c;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p612wk.AbstractC29069a;
import p649xl.C30154za;
import p716zh.C32002l4;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import sy.AbstractC26412d;
import v50.C27870vb;
import vg.AbstractC28207v1;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class SearchDiscoveryZInstantView extends BaseZaloView {
    public static final C12980a Companion = new C12980a(null);

    /* renamed from: W0 */
    private static String f67150W0 = "ZinstantFullSearchDiscovery";

    /* renamed from: X0 */
    private static String f67151X0 = "ZinstantFullSearchDiscovery";

    /* renamed from: M0 */
    private C30154za f67152M0;

    /* renamed from: O0 */
    private EditText f67154O0;

    /* renamed from: P0 */
    private ImageView f67155P0;

    /* renamed from: Q0 */
    private boolean f67156Q0;

    /* renamed from: R0 */
    private boolean f67157R0;

    /* renamed from: N0 */
    private final InterfaceC24854k f67153N0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C13004b.class), new C12999t(new C12998s(this)), C13000u.f67185q);

    /* renamed from: S0 */
    private EnumC12981b f67158S0 = EnumC12981b.f67162p;

    /* renamed from: T0 */
    private final C17170o f67159T0 = new C12983d();

    /* renamed from: U0 */
    private final C13001v f67160U0 = new C13001v();

    /* renamed from: V0 */
    private final C13002w f67161V0 = new C13002w();

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$a */
    /* loaded from: classes6.dex */
    public static final class C12980a {
        private C12980a() {
        }

        public /* synthetic */ C12980a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC12981b {

        /* renamed from: p */
        public static final EnumC12981b f67162p = new EnumC12981b("MODE_UNKNOWN", 0);

        /* renamed from: q */
        public static final EnumC12981b f67163q = new EnumC12981b("MODE_PRESTATE", 1);

        /* renamed from: r */
        public static final EnumC12981b f67164r = new EnumC12981b("MODE_SEARCH_RESULT", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC12981b[] f67165s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f67166t;

        static {
            EnumC12981b[] m72952b = m72952b();
            f67165s = m72952b;
            f67166t = AbstractC30166b.m148796a(m72952b);
        }

        private EnumC12981b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12981b[] m72952b() {
            return new EnumC12981b[]{f67162p, f67163q, f67164r};
        }

        public static EnumC12981b valueOf(String str) {
            return (EnumC12981b) Enum.valueOf(EnumC12981b.class, str);
        }

        public static EnumC12981b[] values() {
            return (EnumC12981b[]) f67165s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12982c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67167a;

        static {
            int[] iArr = new int[EnumC12981b.values().length];
            try {
                iArr[EnumC12981b.f67163q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12981b.f67164r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67167a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$d */
    /* loaded from: classes6.dex */
    public static final class C12983d extends C17170o {
        C12983d() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            C30154za c30154za = SearchDiscoveryZInstantView.this.f67152M0;
            if (c30154za == null) {
                AbstractC19074t.m100223u("binding");
                c30154za = null;
            }
            return c30154za.f140128r.getWidth();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return SearchDiscoveryZInstantView.f67151X0;
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: m */
        public int mo72953m() {
            C30154za c30154za = SearchDiscoveryZInstantView.this.f67152M0;
            if (c30154za == null) {
                AbstractC19074t.m100223u("binding");
                c30154za = null;
            }
            return c30154za.f140128r.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$e */
    /* loaded from: classes6.dex */
    public static final class C12984e extends AbstractC19075u implements InterfaceC18505l {
        C12984e() {
            super(1);
        }

        /* renamed from: a */
        public final void m72954a(C24848g0 c24848g0) {
            SearchDiscoveryZInstantView.this.m72916eN();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72954a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$f */
    /* loaded from: classes6.dex */
    public static final class C12985f extends AbstractC19075u implements InterfaceC18505l {
        C12985f() {
            super(1);
        }

        /* renamed from: a */
        public final void m72955a(InterfaceC22508f interfaceC22508f) {
            SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
            AbstractC19074t.m100205c(interfaceC22508f);
            searchDiscoveryZInstantView.m72905VM(interfaceC22508f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72955a((InterfaceC22508f) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$g */
    /* loaded from: classes6.dex */
    public static final class C12986g extends AbstractC19075u implements InterfaceC18505l {
        C12986g() {
            super(1);
        }

        /* renamed from: a */
        public final void m72956a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                SearchDiscoveryZInstantView.this.m72918fN();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72956a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$h */
    /* loaded from: classes6.dex */
    public static final class C12987h extends AbstractC19075u implements InterfaceC18505l {
        C12987h() {
            super(1);
        }

        /* renamed from: a */
        public final void m72957a(C13004b.b bVar) {
            SearchDiscoveryZInstantView.this.m72920gN(bVar.m73034a(), bVar.m73035b());
            if (SearchDiscoveryZInstantView.this.f67158S0 == EnumC12981b.f67163q && !SearchDiscoveryZInstantView.this.f67157R0) {
                SearchDiscoveryZInstantView.this.f67157R0 = true;
                SearchDiscoveryZInstantView.this.m72889FM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72957a((C13004b.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$i */
    /* loaded from: classes6.dex */
    public static final class C12988i extends AbstractC19075u implements InterfaceC18505l {
        C12988i() {
            super(1);
        }

        /* renamed from: a */
        public final void m72958a(ContactProfile contactProfile) {
            SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
            AbstractC19074t.m100205c(contactProfile);
            searchDiscoveryZInstantView.m72911bN(contactProfile);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72958a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$j */
    /* loaded from: classes6.dex */
    public static final class C12989j extends AbstractC19075u implements InterfaceC18505l {
        C12989j() {
            super(1);
        }

        /* renamed from: a */
        public final void m72959a(ContactProfile contactProfile) {
            SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
            AbstractC19074t.m100205c(contactProfile);
            searchDiscoveryZInstantView.m72914dN(contactProfile);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72959a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$k */
    /* loaded from: classes6.dex */
    public static final class C12990k extends AbstractC19075u implements InterfaceC18505l {
        C12990k() {
            super(1);
        }

        /* renamed from: a */
        public final void m72960a(C13004b.c cVar) {
            SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
            AbstractC19074t.m100205c(cVar);
            searchDiscoveryZInstantView.m72912cN(cVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72960a((C13004b.c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$l */
    /* loaded from: classes6.dex */
    public static final class C12991l extends AbstractC19075u implements InterfaceC18505l {
        C12991l() {
            super(1);
        }

        /* renamed from: a */
        public final void m72961a(String str) {
            SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
            AbstractC19074t.m100205c(str);
            searchDiscoveryZInstantView.m72930lN(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72961a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$m */
    /* loaded from: classes6.dex */
    public static final class C12992m extends AbstractC19075u implements InterfaceC18505l {
        C12992m() {
            super(1);
        }

        /* renamed from: a */
        public final void m72962a(C24848g0 c24848g0) {
            SearchDiscoveryZInstantView.m72897NM(SearchDiscoveryZInstantView.this, false, 1, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72962a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$n */
    /* loaded from: classes6.dex */
    public static final class C12993n extends AbstractC19075u implements InterfaceC18505l {
        C12993n() {
            super(1);
        }

        /* renamed from: a */
        public final void m72963a(C13004b.b bVar) {
            SearchDiscoveryZInstantView.this.m72920gN(bVar.m73034a(), bVar.m73035b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72963a((C13004b.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$o */
    /* loaded from: classes6.dex */
    public static final class C12994o extends ZdsActionBar.AbstractC16987c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18494a f67179a;

        C12994o(InterfaceC18494a interfaceC18494a) {
            this.f67179a = interfaceC18494a;
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            this.f67179a.mo12V4();
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            this.f67179a.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$p */
    /* loaded from: classes6.dex */
    static final class C12995p extends AbstractC19075u implements InterfaceC18494a {
        C12995p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72964a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72964a() {
            SearchDiscoveryZInstantView.this.m72895LM().m73007D0();
            if (!SearchDiscoveryZInstantView.this.m92681pJ() && !SearchDiscoveryZInstantView.this.m92677nJ()) {
                SearchDiscoveryZInstantView.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$q */
    /* loaded from: classes6.dex */
    public static final class C12996q implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f67181p;

        C12996q(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f67181p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f67181p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f67181p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$r */
    /* loaded from: classes6.dex */
    public static final class C12997r extends AbstractC18391a {
        C12997r() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchDiscoveryZInstantView.this.m72922hN();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$s */
    /* loaded from: classes6.dex */
    public static final class C12998s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f67183q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12998s(ZaloView zaloView) {
            super(0);
            this.f67183q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f67183q;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$t */
    /* loaded from: classes6.dex */
    public static final class C12999t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f67184q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12999t(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f67184q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f67184q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$u */
    /* loaded from: classes6.dex */
    static final class C13000u extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13000u f67185q = new C13000u();

        C13000u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C13004b.d();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$v */
    /* loaded from: classes6.dex */
    public static final class C13001v implements InterfaceC17246y0 {
        C13001v() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17246y0
        /* renamed from: a */
        public void mo44293a(String str, String str2, InterfaceC24785k interfaceC24785k) {
            boolean z11;
            C13004b m72895LM = SearchDiscoveryZInstantView.this.m72895LM();
            if (SearchDiscoveryZInstantView.this.f67158S0 == EnumC12981b.f67164r) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!m72895LM.m73014L0(str, str2, z11)) {
                SearchDiscoveryZInstantView.this.m72926jN(str, str2, interfaceC24785k);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.SearchDiscoveryZInstantView$w */
    /* loaded from: classes6.dex */
    public static final class C13002w implements InterfaceC17107c1 {
        C13002w() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m72970e(SearchDiscoveryZInstantView searchDiscoveryZInstantView, Exception exc) {
            AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
            searchDiscoveryZInstantView.m72908YM(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m72971f(SearchDiscoveryZInstantView searchDiscoveryZInstantView) {
            AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
            searchDiscoveryZInstantView.m72909ZM();
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: a */
        public void mo72972a() {
            C24561c.m127942b("SearchDiscoveryZInstantView", "initZinstantLayout success");
            if (AbstractC19444a.m101693a()) {
                SearchDiscoveryZInstantView.this.m72909ZM();
            } else {
                final SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
                searchDiscoveryZInstantView.mo70710wy(new Runnable() { // from class: ba0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchDiscoveryZInstantView.C13002w.m72971f(SearchDiscoveryZInstantView.this);
                    }
                });
            }
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: c */
        public void mo72973c(final Exception exc) {
            int i11;
            if (exc instanceof ZinstantException) {
                i11 = ((ZinstantException) exc).m91676a();
            } else {
                i11 = -999;
            }
            C24561c.m127942b("SearchDiscoveryZInstantView", "initZinstantLayout errorCode=" + i11);
            if (AbstractC19444a.m101693a()) {
                SearchDiscoveryZInstantView.this.m72908YM(exc);
            } else {
                final SearchDiscoveryZInstantView searchDiscoveryZInstantView = SearchDiscoveryZInstantView.this;
                searchDiscoveryZInstantView.mo70710wy(new Runnable() { // from class: ba0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchDiscoveryZInstantView.C13002w.m72970e(SearchDiscoveryZInstantView.this, exc);
                    }
                });
            }
        }
    }

    /* renamed from: CM */
    private final void m72886CM() {
        C30154za c30154za = this.f67152M0;
        C30154za c30154za2 = null;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        if (c30154za.f140127q.getVisibility() != 8) {
            C30154za c30154za3 = this.f67152M0;
            if (c30154za3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30154za2 = c30154za3;
            }
            c30154za2.f140127q.animate().alpha(0.0f).setDuration(125L).withEndAction(new Runnable() { // from class: ba0.f
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDiscoveryZInstantView.m72887DM(SearchDiscoveryZInstantView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m72887DM(SearchDiscoveryZInstantView searchDiscoveryZInstantView) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        C30154za c30154za = searchDiscoveryZInstantView.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140127q.setVisibility(8);
    }

    /* renamed from: EM */
    private final void m72888EM() {
        Object obj;
        ClipData m15b;
        ClipData.Item itemAt;
        if (C19322f1.f95940C) {
            try {
                m72895LM().m73016O0("");
                Context context = getContext();
                ClipboardManager clipboardManager = null;
                if (context != null) {
                    obj = context.getSystemService("clipboard");
                } else {
                    obj = null;
                }
                if (obj instanceof ClipboardManager) {
                    clipboardManager = (ClipboardManager) obj;
                }
                if (clipboardManager != null && (m15b = new C0012a(clipboardManager, new SensitiveData("clipboard_access_text_global_search", "global_search", null, 4, null)).m15b()) != null && (itemAt = m15b.getItemAt(0)) != null && itemAt.getText() != null) {
                    m72895LM().m73016O0(itemAt.getText().toString());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SearchDiscoveryZInstantView", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m72889FM() {
        if (!this.f67156Q0) {
            this.f67156Q0 = true;
        } else {
            AbstractC19444a.m101694b(new Runnable() { // from class: ba0.c
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDiscoveryZInstantView.m72890GM(SearchDiscoveryZInstantView.this);
                }
            }, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m72890GM(SearchDiscoveryZInstantView searchDiscoveryZInstantView) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        if (!searchDiscoveryZInstantView.f72421L0.m92677nJ() && !searchDiscoveryZInstantView.f72421L0.m92681pJ()) {
            searchDiscoveryZInstantView.m72938pN(true);
        }
    }

    /* renamed from: HM */
    private final boolean m72891HM() {
        return AbstractC21777d.m112310a(this.f72421L0.m92693xK(), this.f72421L0.m92642L3());
    }

    /* renamed from: IM */
    private final String m72892IM() {
        return "ZinstantFullSearchDiscovery-" + View.generateViewId();
    }

    /* renamed from: JM */
    private final String m72893JM() {
        String m72975b;
        C13003a c13003a = (C13003a) m72895LM().m103747M();
        if (c13003a == null || (m72975b = c13003a.m72975b()) == null) {
            return "0";
        }
        return m72975b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:            r7 = on0.AbstractC24341v.m127114D(r1, "\n", " ", false, 4, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            r0 = on0.AbstractC24341v.m127114D(r7, "\r", " ", false, 4, null);     */
    /* renamed from: KM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m72894KM() {
        Editable text;
        String m127114D;
        String m127114D2;
        CharSequence m127168X0;
        EditText editText = this.f67154O0;
        if (editText != null && (text = editText.getText()) != null && (r1 = text.toString()) != null && m127114D != null && m127114D2 != null) {
            m127168X0 = AbstractC24342w.m127168X0(m127114D2);
            String obj = m127168X0.toString();
            if (obj != null) {
                return obj;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final C13004b m72895LM() {
        return (C13004b) this.f67153N0.getValue();
    }

    /* renamed from: MM */
    private final void m72896MM(boolean z11) {
        EditText editText = this.f67154O0;
        if (editText != null) {
            if (z11) {
                editText.clearFocus();
            }
            AbstractC2379w.m12430d(editText);
        }
    }

    /* renamed from: NM */
    static /* synthetic */ void m72897NM(SearchDiscoveryZInstantView searchDiscoveryZInstantView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        searchDiscoveryZInstantView.m72896MM(z11);
    }

    /* renamed from: OM */
    private final void m72898OM() {
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140128r.setGestureListener(new TouchMonitorFrameLayout.InterfaceC13005a() { // from class: ba0.d
            @Override // com.zing.zalo.p077ui.searchdiscovery.widget.TouchMonitorFrameLayout.InterfaceC13005a
            /* renamed from: a */
            public final void mo13124a() {
                SearchDiscoveryZInstantView.m72899PM(SearchDiscoveryZInstantView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m72899PM(SearchDiscoveryZInstantView searchDiscoveryZInstantView) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        m72897NM(searchDiscoveryZInstantView, false, 1, null);
    }

    /* renamed from: QM */
    private final void m72900QM() {
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140127q.setOnClickListener(new View.OnClickListener() { // from class: ba0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDiscoveryZInstantView.m72901RM(SearchDiscoveryZInstantView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m72901RM(SearchDiscoveryZInstantView searchDiscoveryZInstantView, View view) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        searchDiscoveryZInstantView.m72940qN();
        C30154za c30154za = searchDiscoveryZInstantView.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.mo91437z0();
    }

    /* renamed from: SM */
    private final void m72902SM() {
        m72898OM();
        m72903TM();
        m72900QM();
        m72940qN();
    }

    /* renamed from: TM */
    private final void m72903TM() {
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        ZaloZinstantCommonLayout zaloZinstantCommonLayout = c30154za.f140131u;
        zaloZinstantCommonLayout.setZinstantLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        zaloZinstantCommonLayout.setActionDelegate(this.f67160U0);
        zaloZinstantCommonLayout.setLayoutCallback(this.f67161V0);
        zaloZinstantCommonLayout.setContextProvider(this.f67159T0);
    }

    /* renamed from: UM */
    private final boolean m72904UM(Exception exc) {
        if (exc instanceof ZinstantException) {
            return ((ZinstantException) exc).m91678c();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public final void m72905VM(InterfaceC22508f interfaceC22508f) {
        List<C24860q> m131496e;
        C30154za c30154za = this.f67152M0;
        C30154za c30154za2 = null;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.m91433f1(interfaceC22508f);
        C13004b.b bVar = (C13004b.b) m72895LM().m73025e0().mo9215f();
        if (bVar != null) {
            C30154za c30154za3 = this.f67152M0;
            if (c30154za3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30154za2 = c30154za3;
            }
            ZaloZinstantCommonLayout zaloZinstantCommonLayout = c30154za2.f140131u;
            m131496e = AbstractC25366r.m131496e(new C24860q(bVar.m73034a(), bVar.m73035b()));
            zaloZinstantCommonLayout.setActions(m131496e);
        }
    }

    /* renamed from: WM */
    private final void m72906WM() {
        m72895LM().m73032m0().m9219j(this, new C12996q(new C12985f()));
        m72895LM().m73005B0().m9219j(this, new C12996q(new C12986g()));
        m72895LM().m73025e0().m9219j(this, new C12996q(new C12987h()));
        m72895LM().m73027g0().m9219j(this, new C12996q(new C12988i()));
        m72895LM().m73029i0().m9219j(this, new C12996q(new C12989j()));
        m72895LM().m73028h0().m9219j(this, new C12996q(new C12990k()));
        m72895LM().m73031l0().m9219j(this, new C12996q(new C12991l()));
        m72895LM().m73026f0().m9219j(this, new C12996q(new C12992m()));
        m72895LM().m73024c0().m9219j(this, new C12996q(new C12993n()));
        m72895LM().m73030j0().m9219j(this, new C12996q(new C12984e()));
    }

    /* renamed from: XM */
    private final void m72907XM() {
        m72896MM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public final void m72908YM(Exception exc) {
        if (m72904UM(exc)) {
            m72936oN();
        } else {
            m72918fN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public final void m72909ZM() {
        C30154za c30154za = this.f67152M0;
        C30154za c30154za2 = null;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140129s.setVisibility(8);
        C30154za c30154za3 = this.f67152M0;
        if (c30154za3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30154za2 = c30154za3;
        }
        c30154za2.f140131u.setVisibility(0);
        m72886CM();
        C13004b.b bVar = (C13004b.b) m72895LM().m73025e0().mo9215f();
        if (bVar != null) {
            m72920gN(bVar.m73034a(), bVar.m73035b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m72910aN(SearchDiscoveryZInstantView searchDiscoveryZInstantView, View view) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        searchDiscoveryZInstantView.m72895LM().m73008E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public final void m72911bN(ContactProfile contactProfile) {
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
        m140776b.putBoolean("extra_open_from_search", true);
        m140776b.putString("STR_SOURCE_START_VIEW", "global_search");
        AbstractC23059e9.m118318G(3);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final void m72912cN(C13004b.c cVar) {
        JSONObject m2488n;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 == null || (m2488n = cVar.m73037a().m2488n()) == null) {
            return;
        }
        WebBaseView.Companion.m86843s(m92676n2, new C19609h(m2488n), null, cVar.m73038b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m72914dN(ContactProfile contactProfile) {
        C17487o0 c17487o0;
        C26365a m135743b = new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(8)).m135761t(true).m135743b();
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            c17487o0 = m92676n2.mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), m135743b, 0, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final void m72916eN() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        bundle.putInt("extra_src", 5);
        AbstractC26412d.a aVar = AbstractC26412d.Companion;
        InterfaceC27218a m92676n2 = m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        aVar.m136233E(m92676n2, bundle, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public final void m72918fN() {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_OPEN_SOURCE_POSITION", m72893JM());
        bundle.putString("EXTRA_OPEN_SOURCE_ACTION", m72949y());
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        C13027c c13027c = C13027c.f67294a;
        C17487o0 m92693xK = m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        c13027c.m73214b(m92693xK, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public final void m72920gN(String str, String str2) {
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.m91999q0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public final void m72922hN() {
        try {
            String m72894KM = m72894KM();
            if (m72894KM != m72895LM().m73023b0()) {
                m72895LM().m73015N0(m72894KM);
                m72924iN(m72894KM);
            }
            m72895LM().m73019R0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iN */
    private final void m72924iN(String str) {
        if (str.length() > 0) {
            m72928kN(EnumC12981b.f67164r);
            m72895LM().m73018Q0();
        } else {
            m72928kN(EnumC12981b.f67163q);
            m72895LM().m73021Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public final void m72926jN(String str, String str2, InterfaceC24785k interfaceC24785k) {
        if (AbstractC19074t.m100204b("action.open.mp", str)) {
            str2 = C18620i.Companion.m98406a(str2, C18620i.f93669L);
        }
        String str3 = str2;
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        AbstractC28207v1.m141989h3(str, 2, m92676n2(), this, str3, c30154za.f140131u.m91448V0(str, str3, interfaceC24785k), null, null, null);
    }

    /* renamed from: kN */
    private final void m72928kN(EnumC12981b enumC12981b) {
        if (enumC12981b != this.f67158S0) {
            int i11 = C12982c.f67167a[enumC12981b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f67158S0 = EnumC12981b.f67164r;
                    m72895LM().m73020T0(m72894KM());
                    return;
                }
                return;
            }
            this.f67158S0 = EnumC12981b.f67163q;
            m72895LM().m73020T0(m72894KM());
            m72895LM().m73022Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public final void m72930lN(String str) {
        EditText editText;
        if (!mo60294yp() && (editText = this.f67154O0) != null) {
            editText.setText(str);
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: mN */
    private final void m72932mN() {
        EditText editText = this.f67154O0;
        if (editText != null) {
            editText.setImeOptions(2);
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ba0.e
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m72934nN;
                    m72934nN = SearchDiscoveryZInstantView.m72934nN(SearchDiscoveryZInstantView.this, textView, i11, keyEvent);
                    return m72934nN;
                }
            });
            editText.addTextChangedListener(new C12997r());
            Editable text = editText.getText();
            AbstractC19074t.m100207e(text, "getText(...)");
            if (text.length() > 0) {
                ImageView imageView = this.f67155P0;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                m72922hN();
                return;
            }
            ImageView imageView2 = this.f67155P0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final boolean m72934nN(SearchDiscoveryZInstantView searchDiscoveryZInstantView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(searchDiscoveryZInstantView, "this$0");
        if (!AbstractC29069a.Companion.m145171a(i11, 2) && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        searchDiscoveryZInstantView.m72907XM();
        return true;
    }

    /* renamed from: oN */
    private final void m72936oN() {
        C30154za c30154za = this.f67152M0;
        C30154za c30154za2 = null;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140129s.setVisibility(8);
        C30154za c30154za3 = this.f67152M0;
        if (c30154za3 == null) {
            AbstractC19074t.m100223u("binding");
            c30154za3 = null;
        }
        c30154za3.f140131u.setVisibility(8);
        C30154za c30154za4 = this.f67152M0;
        if (c30154za4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30154za2 = c30154za4;
        }
        c30154za2.f140127q.setVisibility(0);
    }

    /* renamed from: pN */
    private final void m72938pN(boolean z11) {
        EditText editText = this.f67154O0;
        if (editText != null) {
            if (z11) {
                editText.clearFocus();
            }
            AbstractC2379w.m12432f(editText);
        }
    }

    /* renamed from: qN */
    private final void m72940qN() {
        C30154za c30154za = this.f67152M0;
        C30154za c30154za2 = null;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140127q.setVisibility(8);
        C30154za c30154za3 = this.f67152M0;
        if (c30154za3 == null) {
            AbstractC19074t.m100223u("binding");
            c30154za3 = null;
        }
        c30154za3.f140131u.setVisibility(8);
        C30154za c30154za4 = this.f67152M0;
        if (c30154za4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30154za2 = c30154za4;
        }
        c30154za2.f140129s.setVisibility(0);
    }

    /* renamed from: rN */
    private final void m72942rN() {
        String str;
        if (this.f67158S0 == EnumC12981b.f67164r) {
            if (AbstractC19074t.m100204b(f67151X0, f67150W0)) {
                f67150W0 = m72892IM();
            }
            str = m72892IM();
        } else {
            str = f67150W0;
        }
        f67151X0 = str;
    }

    /* renamed from: y */
    private final String m72949y() {
        String m72974a;
        C13003a c13003a = (C13003a) m72895LM().m103747M();
        if (c13003a == null || (m72974a = c13003a.m72974a()) == null) {
            return "0";
        }
        return m72974a;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        m72895LM().m103748N(C13003a.Companion.m72976a(m92642L3()));
        m72895LM().m73013K0(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30154za m148783c = C30154za.m148783c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148783c, "inflate(...)");
        this.f67152M0 = m148783c;
        m72902SM();
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        return c30154za.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m72942rN();
        m72895LM().m73011I0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m72895LM().m73012J0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 7000);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            Context context = m87077NK.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            SearchGlobalTextInputLayout searchGlobalTextInputLayout = new SearchGlobalTextInputLayout(context, null, 0, 6, null);
            m87077NK.setCustomMiddleItem(searchGlobalTextInputLayout);
            this.f67154O0 = searchGlobalTextInputLayout.getSearchEditText();
            this.f67155P0 = searchGlobalTextInputLayout.getClearTextButton();
            m72932mN();
            m87077NK.setLeadingFunctionCallback(new C12994o(new C12995p()));
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: ba0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchDiscoveryZInstantView.m72910aN(SearchDiscoveryZInstantView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.onPause();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m72895LM().m73010G0(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.onStart();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || m92683qJ() || !mo60294yp()) {
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ == null || !m92662fJ.m93002G0() || !this.f72421L0.m92683qJ()) {
                    m72889FM();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m72906WM();
        if (bundle == null) {
            m72928kN(EnumC12981b.f67163q);
        }
        m72895LM().m73006C0();
        m72895LM().m73017P0();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SearchDiscoveryZInstantView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f72421L0.m92649TI().m93012K0() != null) {
                ZaloView m93012K0 = this.f72421L0.m92649TI().m93012K0();
                AbstractC19074t.m100205c(m93012K0);
                if (m93012K0.onKeyUp(i11, keyEvent)) {
                    return true;
                }
            }
            m72895LM().m73009F0();
            if (m72891HM()) {
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C30154za c30154za = this.f67152M0;
        if (c30154za == null) {
            AbstractC19074t.m100223u("binding");
            c30154za = null;
        }
        c30154za.f140131u.onResume();
        m72888EM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 7000) {
            m72895LM().m73017P0();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 7000);
    }
}
