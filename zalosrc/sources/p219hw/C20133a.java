package p219hw;

import ac.C0708i;
import android.content.Context;
import android.graphics.Outline;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.C17072x0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import ki0.C21740h;
import l30.AbstractC22055v0;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import me0.C23212s8;
import org.json.JSONObject;
import p142ey.C18644n;
import p219hw.C20133a;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import qm0.AbstractC25332a0;

/* renamed from: hw.a */
/* loaded from: classes4.dex */
public final class C20133a extends AbstractC1925r {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private HashMap f99435A;

    /* renamed from: t */
    private int f99436t;

    /* renamed from: u */
    private InterfaceC18509p f99437u;

    /* renamed from: v */
    private InterfaceC18510q f99438v;

    /* renamed from: w */
    private String f99439w;

    /* renamed from: x */
    private InterfaceC18505l f99440x;

    /* renamed from: y */
    private InterfaceC18505l f99441y;

    /* renamed from: z */
    private HashSet f99442z;

    /* renamed from: hw.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hw.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC1915h.d {
        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            if (AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r) && AbstractC19074t.m100204b(contactProfile.f42446v, contactProfile2.f42446v) && AbstractC19074t.m100204b(contactProfile.f42455y, contactProfile2.f42455y)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            return AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r);
        }
    }

    public C20133a(int i11) {
        super(new b());
        this.f99436t = i11;
        this.f99439w = "";
        this.f99442z = new HashSet();
        this.f99435A = new HashMap();
    }

    /* renamed from: S */
    private final int m105064S(String str) {
        List m10632L = m10632L();
        AbstractC19074t.m100207e(m10632L, "getCurrentList(...)");
        Iterator it = m10632L.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!AbstractC19074t.m100204b(((ContactProfile) it.next()).f42434r, str)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    private final void m105065f0(String str) {
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "UpdateMutualGroupNumber");
        }
    }

    /* renamed from: T */
    public final InterfaceC18505l m105066T() {
        return this.f99440x;
    }

    /* renamed from: U */
    public final String m105067U() {
        return this.f99439w;
    }

    /* renamed from: V */
    public final Integer m105068V(String str) {
        AbstractC19074t.m100208f(str, "userId");
        return (Integer) this.f99435A.get(str);
    }

    /* renamed from: W */
    public final InterfaceC18505l m105069W() {
        return this.f99441y;
    }

    /* renamed from: X */
    public final ContactProfile m105070X(int i11) {
        if (i11 >= 0 && i11 < mo10003k()) {
            return (ContactProfile) m10633M(i11);
        }
        return null;
    }

    /* renamed from: Y */
    public final int m105071Y() {
        return this.f99436t;
    }

    /* renamed from: Z */
    public final InterfaceC18509p m105072Z() {
        return this.f99437u;
    }

    /* renamed from: a0 */
    public final InterfaceC18510q m105073a0() {
        return this.f99438v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        Object m10633M = m10633M(i11);
        AbstractC19074t.m100207e(m10633M, "getItem(...)");
        cVar.m105120s0((ContactProfile) m10633M, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo9991B(c cVar, int i11, List list) {
        AbstractC19074t.m100208f(cVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (!list.isEmpty()) {
            for (Object obj : list) {
                Object m10633M = m10633M(i11);
                AbstractC19074t.m100207e(m10633M, "getItem(...)");
                cVar.m105120s0((ContactProfile) m10633M, obj);
            }
            return;
        }
        super.mo9991B(cVar, i11, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return new c(this, viewGroup, 0, 2, null);
    }

    /* renamed from: e0 */
    public final void m105077e0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "HideLoading");
        }
    }

    /* renamed from: g0 */
    public final void m105078g0(InterfaceC18505l interfaceC18505l) {
        this.f99440x = interfaceC18505l;
    }

    /* renamed from: h0 */
    public final void m105079h0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f99439w = str;
    }

    /* renamed from: i0 */
    public final void m105080i0(InterfaceC18505l interfaceC18505l) {
        this.f99441y = interfaceC18505l;
    }

    /* renamed from: j0 */
    public final void m105081j0(InterfaceC18509p interfaceC18509p) {
        this.f99437u = interfaceC18509p;
    }

    /* renamed from: k0 */
    public final void m105082k0(InterfaceC18510q interfaceC18510q) {
        this.f99438v = interfaceC18510q;
    }

    /* renamed from: l0 */
    public final void m105083l0(String str) {
        AbstractC19074t.m100208f(str, "userId");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "UpdateBlockStatus");
        }
    }

    /* renamed from: m0 */
    public final void m105084m0(String str, String str2) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "aliasName");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            this.f99439w = str2;
            m10010r(m105064S, "UpdateAliasName");
        }
    }

    /* renamed from: o0 */
    public final void m105085o0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "UpdateAddFriendDescription");
        }
    }

    /* renamed from: p0 */
    public final void m105086p0(List list) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "lst");
        m131185M0 = AbstractC25332a0.m131185M0(list);
        m10635O(m131185M0);
    }

    /* renamed from: q0 */
    public final void m105087q0(String str, int i11) {
        AbstractC19074t.m100208f(str, "userId");
        this.f99435A.put(str, Integer.valueOf(i11));
        m105065f0(str);
    }

    /* renamed from: r0 */
    public final void m105088r0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "UpdateStory");
        }
    }

    /* renamed from: s0 */
    public final void m105089s0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m105064S = m105064S(str);
        if (m105064S >= 0 && m105064S < mo10003k()) {
            m10010r(m105064S, "UpdateToggleMarkAsCloseFriend");
        }
    }

    /* renamed from: hw.a$c */
    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C23528a f99443I;

        /* renamed from: J */
        private final C20150n f99444J;

        /* renamed from: K */
        final /* synthetic */ C20133a f99445K;

        /* renamed from: hw.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends ViewOutlineProvider {

            /* renamed from: a */
            final /* synthetic */ NestedScrollView f99446a;

            a(NestedScrollView nestedScrollView) {
                this.f99446a = nestedScrollView;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                AbstractC19074t.m100208f(view, "view");
                AbstractC19074t.m100208f(outline, "outline");
                float applyDimension = TypedValue.applyDimension(1, 16.0f, this.f99446a.getContext().getResources().getDisplayMetrics());
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + applyDimension), applyDimension);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(C20133a c20133a, ViewGroup viewGroup, int i11) {
            super(r0);
            AbstractC19074t.m100208f(viewGroup, "parent");
            this.f99445K = c20133a;
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(c20133a.m105071Y(), -2));
            frameLayout.setBackgroundResource(AbstractC16803z.bg_full_rounded_corner_12);
            NestedScrollView nestedScrollView = new NestedScrollView(viewGroup.getContext());
            nestedScrollView.setOutlineProvider(new a(nestedScrollView));
            nestedScrollView.setClipToOutline(true);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Context context2 = viewGroup.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            DecorModuleView decorModuleView = new DecorModuleView(context, new C20150n(context2));
            decorModuleView.setId(i11);
            nestedScrollView.addView(decorModuleView, -1, -2);
            frameLayout.addView(nestedScrollView);
            this.f99444J = (C20150n) ((DecorModuleView) this.f7784p.findViewById(i11)).getModule();
            this.f99443I = new C23528a(this.f7784p.getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A0 */
        public static final void m105092A0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_Message");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B0 */
        public static final void m105093B0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_CommonGroup");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C0 */
        public static final void m105094C0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_MutualFeed");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D0 */
        public static final void m105095D0(C20133a c20133a, ContactProfile contactProfile, C17072x0 c17072x0, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            AbstractC19074t.m100208f(c17072x0, "$switch");
            InterfaceC18510q m105073a0 = c20133a.m105073a0();
            if (m105073a0 != null) {
                m105073a0.mo45599Hr(contactProfile, Boolean.valueOf(c17072x0.m89141i0()), "MiniUserDetail_MarkAsCloseFriend");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E0 */
        public static final void m105096E0(C20133a c20133a, ContactProfile contactProfile, C17072x0 c17072x0, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            AbstractC19074t.m100208f(c17072x0, "$switch");
            InterfaceC18510q m105073a0 = c20133a.m105073a0();
            if (m105073a0 != null) {
                m105073a0.mo45599Hr(contactProfile, Boolean.valueOf(c17072x0.m89141i0()), "MiniUserDetail_MarkAsCloseFriend");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F0 */
        public static final void m105097F0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_ManageBlock");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G0 */
        public static final void m105098G0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_DeleteFriend");
            }
        }

        /* renamed from: H0 */
        private final void m105099H0(C16971e c16971e, String str) {
            c16971e.m90905k2(AbstractC22055v0.m115116F(str, AbstractC21244b.m110054d(c16971e.getContext())), AbstractC22055v0.m115115E(str, AbstractC21244b.m110054d(c16971e.getContext())));
            c16971e.m90900f2(AbstractC22055v0.m115112B(str));
        }

        /* renamed from: I0 */
        private final Spannable m105100I0(int i11) {
            SpannableString spannableString;
            int i12;
            int i13;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_view_group_in_common);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            SpannableString spannableString2 = new SpannableString(m118743r0);
            if (i11 >= 0) {
                i13 = m118743r0.length() + 1;
                String str = m118743r0 + " (" + i11 + ")";
                i12 = str.length();
                spannableString = new SpannableString(str);
            } else {
                spannableString = spannableString2;
                i12 = -1;
                i13 = -1;
            }
            if (i13 >= 0) {
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.TextColor2)), i13, i12, 33);
                spannableString.setSpan(new RelativeSizeSpan(0.8666667f), i13, i12, 33);
            }
            return spannableString;
        }

        /* renamed from: J0 */
        private final void m105101J0(C16959c0 c16959c0, ContactProfile contactProfile) {
            String m118743r0;
            String str;
            try {
                String str2 = contactProfile.f42367P0;
                if (str2 == null) {
                    ContactProfile mo98491j = C18644n.m98531l().m98553p().mo98491j(contactProfile.f42434r);
                    if (mo98491j != null) {
                        str2 = mo98491j.f42367P0;
                    } else {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    if (str2.length() == 0) {
                        c16959c0.mo44614b1(8);
                    } else {
                        JSONObject jSONObject = new JSONObject(str2);
                        String m119208N0 = AbstractC23160o0.m119208N0(System.currentTimeMillis(), jSONObject.getLong("time") * 1000);
                        String m118335n = AbstractC23059e9.m118335n(jSONObject.getInt("srcType"));
                        AbstractC19074t.m100205c(m119208N0);
                        if (m119208N0.length() == 0) {
                            AbstractC19074t.m100205c(m118335n);
                            if (m118335n.length() == 0) {
                                c16959c0.mo44614b1(8);
                            }
                        }
                        if (m119208N0.equals(AbstractC23136l9.m118743r0(AbstractC8020f0.str_today))) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_just_added_through_title);
                        } else if (m119208N0.length() > 0) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_added_since_title) + " " + m119208N0;
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_added_since_title);
                        }
                        AbstractC19074t.m100205c(m118743r0);
                        AbstractC19074t.m100205c(m118335n);
                        if (m118335n.length() > 0) {
                            str = " " + AbstractC23136l9.m118746s0(AbstractC8020f0.str_mini_profile_via, m118335n);
                        } else {
                            str = "";
                        }
                        c16959c0.m90805G1(m118743r0 + str);
                        c16959c0.mo44614b1(0);
                    }
                    this.f99444J.m105136x1().mo44614b1(8);
                    return;
                }
                if (!this.f99445K.f99442z.contains(contactProfile.f42434r) && C23055e5.m118273h(false, 1, null)) {
                    this.f99445K.f99442z.add(contactProfile.f42434r);
                    InterfaceC18505l m105066T = this.f99445K.m105066T();
                    if (m105066T != null) {
                        m105066T.mo205i9(contactProfile);
                    }
                    this.f99444J.m105136x1().mo44614b1(0);
                } else {
                    this.f99444J.m105136x1().mo44614b1(8);
                }
                c16959c0.mo44614b1(8);
            } catch (Exception e11) {
                e11.printStackTrace();
                c16959c0.mo44614b1(8);
            }
        }

        /* renamed from: K0 */
        private final void m105102K0(C17072x0 c17072x0, String str) {
            boolean contains = C21927m.m114302u().m114351p().contains(str);
            if (AbstractC21935u.m114558y(str) && C21927m.m114302u().m114351p() != null && c17072x0.m89141i0() != contains) {
                c17072x0.mo89091D0(contains);
            }
        }

        /* renamed from: t0 */
        private final void m105113t0(String str) {
            int i11;
            C21693c m105129q1 = this.f99444J.m105129q1();
            if (C21927m.m114302u().m114312J().m153137g(str)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            m105129q1.mo44614b1(i11);
        }

        /* renamed from: u0 */
        private final void m105114u0(final ContactProfile contactProfile) {
            C16971e m105126A1 = this.f99444J.m105126A1();
            final C20133a c20133a = this.f99445K;
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            m105099H0(m105126A1, str);
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            m105126A1.m90886N1(str2);
            m105126A1.mo89109M0(new C16719g.c() { // from class: hw.k
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105115v0(C20133a.this, contactProfile, c16719g);
                }
            });
            C0708i c0708i = new C0708i();
            String str3 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str3, "uid");
            c0708i.m1075f("friend_uid", str3);
            m105126A1.setTrackingExtraData(c0708i);
            String str4 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str4, "uid");
            m105113t0(str4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public static final void m105115v0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_Avatar");
            }
        }

        /* renamed from: w0 */
        private final void m105116w0(final ContactProfile contactProfile) {
            C21740h m105137y1 = this.f99444J.m105137y1();
            final C20133a c20133a = this.f99445K;
            m105137y1.m111959G1(contactProfile.m40383Q(true, false));
            m105137y1.mo89109M0(new C16719g.c() { // from class: hw.b
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105117x0(C20133a.this, contactProfile, c16719g);
                }
            });
            C17023o m105127o1 = this.f99444J.m105127o1();
            final C20133a c20133a2 = this.f99445K;
            C0708i c0708i = new C0708i();
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            c0708i.m1075f("friend_uid", str);
            m105127o1.setTrackingExtraData(c0708i);
            m105127o1.mo89109M0(new C16719g.c() { // from class: hw.c
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105118y0(C20133a.this, contactProfile, c16719g);
                }
            });
            this.f99444J.m105138z1().m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zalo_name_title, contactProfile.mo2475c()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x0 */
        public static final void m105117x0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_Name");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y0 */
        public static final void m105118y0(C20133a c20133a, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(c20133a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            InterfaceC18509p m105072Z = c20133a.m105072Z();
            if (m105072Z != null) {
                m105072Z.mo240pC(contactProfile, "MiniUserDetail_ChangeAlias");
            }
        }

        /* renamed from: z0 */
        private final void m105119z0(final ContactProfile contactProfile) {
            C17023o m105128p1 = this.f99444J.m105128p1();
            final C20133a c20133a = this.f99445K;
            m105128p1.m91114u1(AbstractC8020f0.str_tv_sendmes_short);
            m105128p1.m91111q1(AbstractC2810d.zds_ic_chat_line_24);
            C0708i c0708i = new C0708i();
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            c0708i.m1075f("friend_uid", str);
            m105128p1.setTrackingExtraData(c0708i);
            m105128p1.mo89109M0(new C16719g.c() { // from class: hw.d
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105092A0(C20133a.this, contactProfile, c16719g);
                }
            });
            m105101J0(this.f99444J.m105130r1(), contactProfile);
            C16959c0 m105135w1 = this.f99444J.m105135w1();
            final C20133a c20133a2 = this.f99445K;
            HashMap hashMap = c20133a2.f99435A;
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            if (hashMap.containsKey(str2)) {
                Integer num = (Integer) c20133a2.f99435A.get(contactProfile.f42434r);
                if (num != null) {
                    AbstractC19074t.m100205c(num);
                    m105135w1.m90805G1(m105100I0(num.intValue()));
                    C0708i c0708i2 = new C0708i();
                    String str3 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    c0708i2.m1075f("friend_uid", str3);
                    c0708i2.m1072c("mutual_group_number", num.intValue());
                    m105135w1.setTrackingExtraData(c0708i2);
                }
            } else {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_view_group_in_common);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m105135w1.m90805G1(m118743r0);
                InterfaceC18505l m105069W = c20133a2.m105069W();
                if (m105069W != null) {
                    String str4 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str4, "uid");
                    m105069W.mo205i9(str4);
                }
            }
            m105135w1.mo89109M0(new C16719g.c() { // from class: hw.e
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105093B0(C20133a.this, contactProfile, c16719g);
                }
            });
            C16959c0 m105134v1 = this.f99444J.m105134v1();
            final C20133a c20133a3 = this.f99445K;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_view_shared_feed);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m105134v1.m90805G1(m118743r02);
            C0708i c0708i3 = new C0708i();
            String str5 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str5, "uid");
            c0708i3.m1075f("friend_uid", str5);
            m105134v1.setTrackingExtraData(c0708i3);
            m105134v1.mo89109M0(new C16719g.c() { // from class: hw.f
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105094C0(C20133a.this, contactProfile, c16719g);
                }
            });
            C16959c0 m105133u1 = this.f99444J.m105133u1();
            final C20133a c20133a4 = this.f99445K;
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_option_close_friend);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            m105133u1.m90805G1(m118743r03);
            C0708i c0708i4 = new C0708i();
            String str6 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str6, "uid");
            c0708i4.m1075f("friend_uid", str6);
            c0708i4.m1072c("option", !C21927m.m114302u().m114351p().contains(contactProfile.f42434r) ? 1 : 0);
            m105133u1.setTrackingExtraData(c0708i4);
            C16719g m90822y1 = m105133u1.m90822y1();
            AbstractC19074t.m100206d(m90822y1, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.SwitchModule");
            final C17072x0 c17072x0 = (C17072x0) m90822y1;
            c17072x0.m91359p1().mo89109M0(new C16719g.c() { // from class: hw.g
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105095D0(C20133a.this, contactProfile, c17072x0, c16719g);
                }
            });
            m105133u1.mo89109M0(new C16719g.c() { // from class: hw.h
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105096E0(C20133a.this, contactProfile, c17072x0, c16719g);
                }
            });
            String str7 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str7, "uid");
            m105102K0(c17072x0, str7);
            C16959c0 m105132t1 = this.f99444J.m105132t1();
            final C20133a c20133a5 = this.f99445K;
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_manage_block_title);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            m105132t1.m90805G1(m118743r04);
            C0708i c0708i5 = new C0708i();
            String str8 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str8, "uid");
            c0708i5.m1075f("friend_uid", str8);
            m105132t1.setTrackingExtraData(c0708i5);
            m105132t1.mo89109M0(new C16719g.c() { // from class: hw.i
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105097F0(C20133a.this, contactProfile, c16719g);
                }
            });
            C16959c0 m105131s1 = this.f99444J.m105131s1();
            final C20133a c20133a6 = this.f99445K;
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_delete_friend_title);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            m105131s1.m90805G1(m118743r05);
            m105131s1.m90806H1(C23212s8.m119607o(m105131s1.getContext(), AbstractC2807a.support_error));
            C0708i c0708i6 = new C0708i();
            String str9 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str9, "uid");
            c0708i6.m1075f("friend_uid", str9);
            m105131s1.setTrackingExtraData(c0708i6);
            m105131s1.mo89109M0(new C16719g.c() { // from class: hw.j
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C20133a.c.m105098G0(C20133a.this, contactProfile, c16719g);
                }
            });
        }

        /* renamed from: s0 */
        public final void m105120s0(ContactProfile contactProfile, Object obj) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            if (obj == null) {
                m105114u0(contactProfile);
                m105116w0(contactProfile);
                m105119z0(contactProfile);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "UpdateToggleMarkAsCloseFriend")) {
                C16719g m90822y1 = this.f99444J.m105133u1().m90822y1();
                AbstractC19074t.m100206d(m90822y1, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.SwitchModule");
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                m105102K0((C17072x0) m90822y1, str);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "UpdateAddFriendDescription")) {
                m105101J0(this.f99444J.m105130r1(), contactProfile);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "HideLoading")) {
                this.f99444J.m105136x1().mo44614b1(8);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "UpdateAliasName")) {
                if (this.f99445K.m105067U().length() > 0) {
                    this.f99444J.m105137y1().m111959G1(this.f99445K.m105067U());
                    this.f99445K.m105079h0("");
                    return;
                } else {
                    this.f99444J.m105137y1().m111959G1(contactProfile.m40383Q(true, false));
                    return;
                }
            }
            if (AbstractC19074t.m100204b(obj, "UpdateBlockStatus")) {
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                m105113t0(str2);
                return;
            }
            if (AbstractC19074t.m100204b(obj, "UpdateMutualGroupNumber")) {
                C16959c0 m105135w1 = this.f99444J.m105135w1();
                Integer num = (Integer) this.f99445K.f99435A.get(contactProfile.f42434r);
                if (num != null) {
                    C0708i c0708i = new C0708i();
                    String str3 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    c0708i.m1075f("friend_uid", str3);
                    AbstractC19074t.m100205c(num);
                    c0708i.m1072c("mutual_group_number", num.intValue());
                    m105135w1.setTrackingExtraData(c0708i);
                    m105135w1.m90805G1(m105100I0(num.intValue()));
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(obj, "UpdateStory")) {
                C16971e m105126A1 = this.f99444J.m105126A1();
                String str4 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str4, "uid");
                m105099H0(m105126A1, str4);
            }
        }

        public /* synthetic */ c(C20133a c20133a, ViewGroup viewGroup, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(c20133a, viewGroup, (i12 & 2) != 0 ? View.generateViewId() : i11);
        }
    }
}
