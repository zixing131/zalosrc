package com.zing.zalo.p077ui.maintab.me;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.maintab.me.QuickActionView;
import com.zing.zalo.p077ui.maintab.me.SettingItemNewView;
import com.zing.zalo.p077ui.maintab.me.UserInfoItemView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import qm0.AbstractC25368s;
import r70.AbstractC25672d;
import r70.C25669a;
import r70.C25670b;
import r70.C25673e;
import r70.C25687s;

/* loaded from: classes5.dex */
public final class TabMeAdapter extends RecyclerView.AbstractC1880g {
    public static final C12139a Companion = new C12139a(null);

    /* renamed from: r */
    private Context f63386r;

    /* renamed from: s */
    private boolean f63387s;

    /* renamed from: t */
    private List f63388t;

    /* renamed from: u */
    private InterfaceC12140b f63389u;

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeAdapter$a */
    /* loaded from: classes5.dex */
    public static final class C12139a {
        private C12139a() {
        }

        public /* synthetic */ C12139a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeAdapter$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC12140b extends UserInfoItemView.InterfaceC12157a, SettingItemNewView.InterfaceC12137a, QuickActionView.InterfaceC12135a, InterfaceC12141c {
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeAdapter$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC12141c {
        /* renamed from: v4 */
        AbstractC1785o mo67862v4();
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeAdapter$d */
    /* loaded from: classes5.dex */
    public static final class C12142d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private UserInfoItemView f63390I;

        /* renamed from: J */
        private View f63391J;

        /* renamed from: K */
        private SettingItemNewView f63392K;

        /* renamed from: L */
        private QuickActionView f63393L;

        /* renamed from: M */
        private LayoutZinstantTabMe f63394M;

        /* renamed from: N */
        private ListItemSetting f63395N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12142d(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            m67869o0(view, i11);
        }

        /* renamed from: i0 */
        public final View m67863i0() {
            return this.f63391J;
        }

        /* renamed from: j0 */
        public final ListItemSetting m67864j0() {
            return this.f63395N;
        }

        /* renamed from: k0 */
        public final QuickActionView m67865k0() {
            return this.f63393L;
        }

        /* renamed from: l0 */
        public final SettingItemNewView m67866l0() {
            return this.f63392K;
        }

        /* renamed from: m0 */
        public final UserInfoItemView m67867m0() {
            return this.f63390I;
        }

        /* renamed from: n0 */
        public final LayoutZinstantTabMe m67868n0() {
            return this.f63394M;
        }

        /* renamed from: o0 */
        public final void m67869o0(View view, int i11) {
            AbstractC19074t.m100208f(view, "convertView");
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    this.f63395N = (ListItemSetting) view;
                                    return;
                                }
                                return;
                            } else {
                                LayoutZinstantTabMe layoutZinstantTabMe = (LayoutZinstantTabMe) view;
                                this.f63394M = layoutZinstantTabMe;
                                if (layoutZinstantTabMe != null) {
                                    layoutZinstantTabMe.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                                    return;
                                }
                                return;
                            }
                        }
                        this.f63393L = (QuickActionView) view;
                        return;
                    }
                    this.f63392K = (SettingItemNewView) view;
                    return;
                }
                this.f63391J = view;
                return;
            }
            this.f63390I = (UserInfoItemView) view;
        }
    }

    public TabMeAdapter(Context context) {
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        this.f63386r = context;
        m131502j = AbstractC25368s.m131502j();
        this.f63388t = m131502j;
    }

    /* renamed from: L */
    private final void m67854L(LayoutZinstantTabMe layoutZinstantTabMe) {
        AbstractC1785o mo67862v4;
        InterfaceC12140b interfaceC12140b = this.f63389u;
        if (interfaceC12140b != null && (mo67862v4 = interfaceC12140b.mo67862v4()) != null) {
            mo67862v4.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.ui.maintab.me.TabMeAdapter$ensureItemViewBindToLifecycle$1

                /* renamed from: com.zing.zalo.ui.maintab.me.TabMeAdapter$ensureItemViewBindToLifecycle$1$a */
                /* loaded from: classes5.dex */
                public /* synthetic */ class C12143a {

                    /* renamed from: a */
                    public static final /* synthetic */ int[] f63397a;

                    static {
                        int[] iArr = new int[AbstractC1785o.a.values().length];
                        try {
                            iArr[AbstractC1785o.a.ON_START.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[AbstractC1785o.a.ON_STOP.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        f63397a = iArr;
                    }
                }

                public TabMeAdapter$ensureItemViewBindToLifecycle$1() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    AbstractC19074t.m100208f(interfaceC1801w, "source");
                    AbstractC19074t.m100208f(aVar, "event");
                    int i11 = C12143a.f63397a[aVar.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        interfaceC1801w.getLifecycle().mo9338d(this);
                                        return;
                                    }
                                    return;
                                }
                                LayoutZinstantTabMe.this.m67837f();
                                return;
                            }
                            LayoutZinstantTabMe.this.m67834c();
                            return;
                        }
                        LayoutZinstantTabMe.this.m67835d();
                        return;
                    }
                    LayoutZinstantTabMe.this.m67836e();
                }
            });
        }
    }

    /* renamed from: M */
    public final List m67855M() {
        return this.f63388t;
    }

    /* renamed from: N */
    public final AbstractC25672d m67856N(int i11) {
        return (AbstractC25672d) this.f63388t.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public void mo9990A(C12142d c12142d, int i11) {
        ListItemSetting m67864j0;
        AbstractC19074t.m100208f(c12142d, "holder");
        try {
            int mo10005m = mo10005m(i11);
            AbstractC25672d abstractC25672d = (AbstractC25672d) this.f63388t.get(i11);
            C25687s c25687s = null;
            C25673e c25673e = null;
            C12158a c12158a = null;
            C25670b c25670b = null;
            C25673e c25673e2 = null;
            C25669a c25669a = null;
            if (mo10005m != 0) {
                if (mo10005m != 1) {
                    if (mo10005m != 2) {
                        if (mo10005m != 3) {
                            if (mo10005m != 4) {
                                if (mo10005m == 5 && (m67864j0 = c12142d.m67864j0()) != null) {
                                    if (abstractC25672d instanceof C25673e) {
                                        c25673e = (C25673e) abstractC25672d;
                                    }
                                    m67864j0.m74618u(c25673e, this.f63389u);
                                    return;
                                }
                                return;
                            }
                            LayoutZinstantTabMe m67868n0 = c12142d.m67868n0();
                            if (m67868n0 != null) {
                                if (abstractC25672d instanceof C12158a) {
                                    c12158a = (C12158a) abstractC25672d;
                                }
                                m67868n0.m67832a(c12158a);
                                return;
                            }
                            return;
                        }
                        QuickActionView m67865k0 = c12142d.m67865k0();
                        if (m67865k0 != null) {
                            if (abstractC25672d instanceof C25670b) {
                                c25670b = (C25670b) abstractC25672d;
                            }
                            m67865k0.m67842b(c25670b, this.f63387s);
                            m67865k0.setListener(this.f63389u);
                            return;
                        }
                        return;
                    }
                    SettingItemNewView m67866l0 = c12142d.m67866l0();
                    if (m67866l0 != null) {
                        if (abstractC25672d instanceof C25673e) {
                            c25673e2 = (C25673e) abstractC25672d;
                        }
                        m67866l0.m67852p(c25673e2);
                        m67866l0.setListener(this.f63389u);
                        return;
                    }
                    return;
                }
                View m67863i0 = c12142d.m67863i0();
                if (m67863i0 != null) {
                    if (abstractC25672d instanceof C25669a) {
                        c25669a = (C25669a) abstractC25672d;
                    }
                    if (c25669a != null) {
                        m67863i0.setLayoutParams(new ViewGroup.LayoutParams(-1, c25669a.m132554d()));
                        return;
                    }
                    return;
                }
                return;
            }
            UserInfoItemView m67867m0 = c12142d.m67867m0();
            if (m67867m0 != null) {
                if (abstractC25672d instanceof C25687s) {
                    c25687s = (C25687s) abstractC25672d;
                }
                m67867m0.m67992i(c25687s);
                m67867m0.setListener(this.f63389u);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public C12142d mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                view = new View(this.f63386r);
                            } else {
                                view = new ListItemSetting(this.f63386r);
                            }
                        } else {
                            LayoutZinstantTabMe layoutZinstantTabMe = new LayoutZinstantTabMe(this.f63386r);
                            m67854L(layoutZinstantTabMe);
                            view = layoutZinstantTabMe;
                        }
                    } else {
                        view = new QuickActionView(this.f63386r);
                    }
                } else {
                    view = new SettingItemNewView(this.f63386r);
                }
            } else {
                View view2 = new View(this.f63386r);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(8.0f)));
                view2.setBackgroundColor(C23212s8.m119607o(view2.getContext(), AbstractC16781w.SecondaryBackgroundColor));
                view = view2;
            }
        } else {
            view = new UserInfoItemView(this.f63386r);
        }
        return new C12142d(view, i11);
    }

    /* renamed from: Q */
    public final void m67859Q(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f63388t = list;
    }

    /* renamed from: R */
    public final void m67860R(InterfaceC12140b interfaceC12140b) {
        this.f63389u = interfaceC12140b;
    }

    /* renamed from: S */
    public final void m67861S(boolean z11) {
        this.f63387s = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f63388t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m67856N(i11).m132556a();
    }
}
