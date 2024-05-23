package com.zing.zalo.p077ui.picker.stickerpanel;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7157o0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.C12922b;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12952b;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12958h;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12962l;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12967q;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12970t;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.CameraPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.EmojiChatPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.EmojiSystemPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.SearchStickerPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.SeasonalStickerPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.StickersPanelPage;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.TrendingStickerPanelPage;
import fi.C18953k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import p354n3.C23528a;
import p716zh.C31887d9;
import p716zh.C32119t6;
import pm0.C24860q;
import qm0.AbstractC25368s;
import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.b */
/* loaded from: classes6.dex */
public final class C12922b extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    private final boolean f66966A;

    /* renamed from: B */
    private final StickerView.InterfaceC10959a f66967B;

    /* renamed from: C */
    private List f66968C;

    /* renamed from: D */
    private SparseArray f66969D;

    /* renamed from: E */
    private int f66970E;

    /* renamed from: F */
    private int f66971F;

    /* renamed from: G */
    private int f66972G;

    /* renamed from: H */
    private int f66973H;

    /* renamed from: I */
    private final LayoutInflater f66974I;

    /* renamed from: J */
    private final C1761c0 f66975J;

    /* renamed from: K */
    private final C1755a0 f66976K;

    /* renamed from: L */
    private final C1755a0 f66977L;

    /* renamed from: M */
    private final C1761c0 f66978M;

    /* renamed from: N */
    private final C1761c0 f66979N;

    /* renamed from: O */
    private final C1761c0 f66980O;

    /* renamed from: P */
    private final C1761c0 f66981P;

    /* renamed from: Q */
    private final C1761c0 f66982Q;

    /* renamed from: R */
    private final C1761c0 f66983R;

    /* renamed from: S */
    private final C1761c0 f66984S;

    /* renamed from: T */
    private final C1761c0 f66985T;

    /* renamed from: U */
    private final C1761c0 f66986U;

    /* renamed from: r */
    private final C23528a f66987r;

    /* renamed from: s */
    private final int f66988s;

    /* renamed from: t */
    private final C7110j8.d f66989t;

    /* renamed from: u */
    private final InterfaceC12972v f66990u;

    /* renamed from: v */
    private final boolean f66991v;

    /* renamed from: w */
    private final String f66992w;

    /* renamed from: x */
    private final boolean f66993x;

    /* renamed from: y */
    private final int f66994y;

    /* renamed from: z */
    private final boolean f66995z;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {
        public static final C32774a Companion = new C32774a(null);

        /* renamed from: I */
        private final CameraPanelPage f66996I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$a$a */
        /* loaded from: classes6.dex */
        public static final class C32774a {

            /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$a$a$a */
            /* loaded from: classes6.dex */
            public static final class C32775a extends RecyclerView.AbstractC1890q {

                /* renamed from: a */
                final /* synthetic */ C1761c0 f66997a;

                C32775a(C1761c0 c1761c0) {
                    this.f66997a = c1761c0;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
                /* renamed from: a */
                public boolean mo10175a(int i11, int i12) {
                    this.f66997a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
                    return false;
                }
            }

            private C32774a() {
            }

            public /* synthetic */ C32774a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72792c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final a m72793b(LayoutInflater layoutInflater, ViewGroup viewGroup, C23528a c23528a, C7110j8.d dVar, C1755a0 c1755a0, C1761c0 c1761c0, InterfaceC12972v interfaceC12972v, C1761c0 c1761c02, boolean z11, C1761c0 c1761c03) {
                AbstractC19074t.m100208f(layoutInflater, "inflater");
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c23528a, "aQuery");
                AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
                AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
                AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
                AbstractC19074t.m100208f(c1761c02, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c03, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                CameraPanelPage cameraPanelPage = new CameraPanelPage(layoutInflater, viewGroup.getContext(), c23528a, dVar, c1755a0, c1761c0, interfaceC12972v);
                cameraPanelPage.setLayoutParams(layoutParams);
                if (z11) {
                    cameraPanelPage.setPadding(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                cameraPanelPage.setOnTouchListener(new View.OnTouchListener() { // from class: w90.b
                    public /* synthetic */ ViewOnTouchListenerC28831b() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72792c;
                        m72792c = C12922b.a.C32774a.m72792c(C1761c0.this, view, motionEvent);
                        return m72792c;
                    }
                });
                cameraPanelPage.setOnFlingListener(new C32775a(c1761c03));
                return new a(cameraPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CameraPanelPage cameraPanelPage) {
            super(cameraPanelPage);
            AbstractC19074t.m100208f(cameraPanelPage, "stickerPage");
            this.f66996I = cameraPanelPage;
        }

        /* renamed from: i0 */
        public final void m72790i0(C12952b c12952b, int i11) {
            AbstractC19074t.m100208f(c12952b, "currentPage");
            this.f66996I.m72818c2(c12952b.m72862c(), i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final EmojiChatPanelPage f66998I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$b$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72796c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final b m72797b(LayoutInflater layoutInflater, ViewGroup viewGroup, C1755a0 c1755a0, C1761c0 c1761c0, boolean z11, C1761c0 c1761c02) {
                AbstractC19074t.m100208f(layoutInflater, "inflater");
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c1755a0, "liveData");
                AbstractC19074t.m100208f(c1761c0, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c02, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                EmojiChatPanelPage emojiChatPanelPage = new EmojiChatPanelPage(layoutInflater, viewGroup.getContext(), c1755a0, c1761c02);
                emojiChatPanelPage.setLayoutParams(layoutParams);
                if (z11) {
                    emojiChatPanelPage.m72828h(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                emojiChatPanelPage.setListOnTouchListener(new View.OnTouchListener() { // from class: w90.c
                    public /* synthetic */ ViewOnTouchListenerC28833c() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72796c;
                        m72796c = C12922b.b.a.m72796c(C1761c0.this, view, motionEvent);
                        return m72796c;
                    }
                });
                return new b(emojiChatPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EmojiChatPanelPage emojiChatPanelPage) {
            super(emojiChatPanelPage);
            AbstractC19074t.m100208f(emojiChatPanelPage, "emojiPage");
            this.f66998I = emojiChatPanelPage;
        }

        /* renamed from: i0 */
        public final void m72794i0(C12958h c12958h) {
            AbstractC19074t.m100208f(c12958h, "currentPage");
            C7157o0.f m72861c = c12958h.m72861c();
            if (m72861c != null) {
                this.f66998I.setEmojiPageStyle(m72861c);
            }
            this.f66998I.mo72826e();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$c */
    /* loaded from: classes6.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final EmojiSystemPanelPage f66999I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$c$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72800c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final c m72801b(LayoutInflater layoutInflater, ViewGroup viewGroup, C1755a0 c1755a0, int i11, C1761c0 c1761c0, boolean z11, C1761c0 c1761c02) {
                AbstractC19074t.m100208f(layoutInflater, "inflater");
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c1755a0, "liveData");
                AbstractC19074t.m100208f(c1761c0, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c02, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                EmojiSystemPanelPage emojiSystemPanelPage = new EmojiSystemPanelPage(layoutInflater, viewGroup.getContext(), i11, c1755a0, c1761c02);
                emojiSystemPanelPage.setLayoutParams(layoutParams);
                if (z11) {
                    emojiSystemPanelPage.setPadding(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                emojiSystemPanelPage.setListOnTouchListener(new View.OnTouchListener() { // from class: w90.d
                    public /* synthetic */ ViewOnTouchListenerC28835d() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72800c;
                        m72800c = C12922b.c.a.m72800c(C1761c0.this, view, motionEvent);
                        return m72800c;
                    }
                });
                return new c(emojiSystemPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EmojiSystemPanelPage emojiSystemPanelPage) {
            super(emojiSystemPanelPage);
            AbstractC19074t.m100208f(emojiSystemPanelPage, "emojiSystemPage");
            this.f66999I = emojiSystemPanelPage;
        }

        /* renamed from: i0 */
        public final void m72798i0(int i11) {
            this.f66999I.m72832a(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$d */
    /* loaded from: classes6.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final SearchStickerPanelPage f67000I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$d$a */
        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$d$a$a */
            /* loaded from: classes6.dex */
            public static final class C32776a extends RecyclerView.AbstractC1890q {

                /* renamed from: a */
                final /* synthetic */ C1761c0 f67001a;

                C32776a(C1761c0 c1761c0) {
                    this.f67001a = c1761c0;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
                /* renamed from: a */
                public boolean mo10175a(int i11, int i12) {
                    this.f67001a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
                    return false;
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72804c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final d m72805b(ViewGroup viewGroup, C23528a c23528a, C1761c0 c1761c0, C1761c0 c1761c02, boolean z11, C1761c0 c1761c03) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c23528a, "aQuery");
                AbstractC19074t.m100208f(c1761c0, "searchKwdSelectedLiveData");
                AbstractC19074t.m100208f(c1761c02, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c03, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                SearchStickerPanelPage searchStickerPanelPage = new SearchStickerPanelPage(viewGroup.getContext(), c23528a, c1761c0);
                searchStickerPanelPage.setLayoutParams(layoutParams);
                if (z11) {
                    searchStickerPanelPage.setPadding(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                searchStickerPanelPage.setOnTouchListener(new View.OnTouchListener() { // from class: w90.e
                    public /* synthetic */ ViewOnTouchListenerC28837e() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72804c;
                        m72804c = C12922b.d.a.m72804c(C1761c0.this, view, motionEvent);
                        return m72804c;
                    }
                });
                searchStickerPanelPage.setOnFlingListener(new C32776a(c1761c03));
                return new d(searchStickerPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SearchStickerPanelPage searchStickerPanelPage) {
            super(searchStickerPanelPage);
            AbstractC19074t.m100208f(searchStickerPanelPage, "searchPage");
            this.f67000I = searchStickerPanelPage;
        }

        /* renamed from: i0 */
        public final void m72802i0() {
            C31887d9 m155014e = C32119t6.m155009c().m155014e(0);
            this.f67000I.m72833a2(C18953k.Companion.m99426f().m99404h0(), m155014e);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final SeasonalStickerPanelPage f67002I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$e$a */
        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$e$a$a */
            /* loaded from: classes6.dex */
            public static final class C32777a extends RecyclerView.AbstractC1890q {

                /* renamed from: a */
                final /* synthetic */ C1761c0 f67003a;

                C32777a(C1761c0 c1761c0) {
                    this.f67003a = c1761c0;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
                /* renamed from: a */
                public boolean mo10175a(int i11, int i12) {
                    this.f67003a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
                    return false;
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72808c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final e m72809b(ViewGroup viewGroup, C1755a0 c1755a0, C1761c0 c1761c0, boolean z11, C1761c0 c1761c02) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c1755a0, "liveData");
                AbstractC19074t.m100208f(c1761c0, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c02, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                SeasonalStickerPanelPage seasonalStickerPanelPage = new SeasonalStickerPanelPage(viewGroup.getContext(), c1755a0);
                seasonalStickerPanelPage.setLayoutParams(layoutParams);
                if (z11) {
                    seasonalStickerPanelPage.setPadding(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                seasonalStickerPanelPage.setOnTouchListener(new View.OnTouchListener() { // from class: w90.f
                    public /* synthetic */ ViewOnTouchListenerC28838f() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72808c;
                        m72808c = C12922b.e.a.m72808c(C1761c0.this, view, motionEvent);
                        return m72808c;
                    }
                });
                seasonalStickerPanelPage.setOnFlingListener(new C32777a(c1761c02));
                return new e(seasonalStickerPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SeasonalStickerPanelPage seasonalStickerPanelPage) {
            super(seasonalStickerPanelPage);
            AbstractC19074t.m100208f(seasonalStickerPanelPage, "seasonalPage");
            this.f67002I = seasonalStickerPanelPage;
        }

        /* renamed from: i0 */
        public final void m72806i0(int i11) {
            this.f67002I.m72834a2(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$f */
    /* loaded from: classes6.dex */
    public static final class f extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final StickersPanelPage f67004I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$f$a */
        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$f$a$a */
            /* loaded from: classes6.dex */
            public static final class C32778a extends RecyclerView.AbstractC1890q {

                /* renamed from: a */
                final /* synthetic */ C1761c0 f67005a;

                C32778a(C1761c0 c1761c0) {
                    this.f67005a = c1761c0;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
                /* renamed from: a */
                public boolean mo10175a(int i11, int i12) {
                    this.f67005a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
                    return false;
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static final boolean m72812c(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
                AbstractC19074t.m100208f(c1761c0, "$pagerTouchLiveData");
                c1761c0.mo9224q(motionEvent);
                return false;
            }

            /* renamed from: b */
            public final f m72813b(LayoutInflater layoutInflater, ViewGroup viewGroup, C23528a c23528a, C7110j8.d dVar, int i11, C1755a0 c1755a0, C1761c0 c1761c0, C1761c0 c1761c02, boolean z11, String str, InterfaceC12972v interfaceC12972v, boolean z12, C1761c0 c1761c03, C1761c0 c1761c04, C1761c0 c1761c05, C1761c0 c1761c06, boolean z13, C1761c0 c1761c07, C1761c0 c1761c08, boolean z14, StickerView.InterfaceC10959a interfaceC10959a) {
                AbstractC19074t.m100208f(layoutInflater, "inflater");
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c23528a, "aQuery");
                AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
                AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
                AbstractC19074t.m100208f(c1761c02, "openPopupActionLiveData");
                AbstractC19074t.m100208f(str, "autoPlayPrefix");
                AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
                AbstractC19074t.m100208f(c1761c03, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c04, "stickersPageScrollLiveData");
                AbstractC19074t.m100208f(c1761c05, "refreshPanelLiveData");
                AbstractC19074t.m100208f(c1761c06, "startDownloadStickerLiveData");
                AbstractC19074t.m100208f(c1761c07, "pagerFlingLiveData");
                AbstractC19074t.m100208f(c1761c08, "openAIStickerMpLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                StickersPanelPage stickersPanelPage = new StickersPanelPage(layoutInflater, viewGroup.getContext(), c23528a, dVar, i11, c1755a0, c1761c0, c1761c02, c1761c04, z11, str, interfaceC12972v, c1761c05, c1761c06, z12, c1761c08, z14, interfaceC10959a);
                stickersPanelPage.setLayoutParams(layoutParams);
                if (z13) {
                    stickersPanelPage.setPadding(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                stickersPanelPage.setOnTouchListener(new View.OnTouchListener() { // from class: w90.g
                    public /* synthetic */ ViewOnTouchListenerC28839g() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m72812c;
                        m72812c = C12922b.f.a.m72812c(C1761c0.this, view, motionEvent);
                        return m72812c;
                    }
                });
                stickersPanelPage.setOnFlingListener(new C32778a(c1761c07));
                return new f(stickersPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StickersPanelPage stickersPanelPage) {
            super(stickersPanelPage);
            AbstractC19074t.m100208f(stickersPanelPage, "stickersPage");
            this.f67004I = stickersPanelPage;
        }

        /* renamed from: i0 */
        public final void m72810i0(C12967q c12967q) {
            AbstractC19074t.m100208f(c12967q, "currentPage");
            this.f67004I.m72844i2(c12967q.m72863c(), c12967q.m72864d());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$g */
    /* loaded from: classes6.dex */
    public static final class g extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final TrendingStickerPanelPage f67006I;

        /* renamed from: com.zing.zalo.ui.picker.stickerpanel.b$g$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final g m72815a(LayoutInflater layoutInflater, ViewGroup viewGroup, C23528a c23528a, C1755a0 c1755a0, C1761c0 c1761c0, boolean z11, String str, InterfaceC12972v interfaceC12972v, C1761c0 c1761c02, boolean z12, C1761c0 c1761c03) {
                AbstractC19074t.m100208f(layoutInflater, "inflater");
                AbstractC19074t.m100208f(viewGroup, "parent");
                AbstractC19074t.m100208f(c23528a, "aQuery");
                AbstractC19074t.m100208f(c1755a0, "animViewActionLiveData");
                AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
                AbstractC19074t.m100208f(str, "autoPlayPrefix");
                AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
                AbstractC19074t.m100208f(c1761c02, "pagerTouchLiveData");
                AbstractC19074t.m100208f(c1761c03, "pagerFlingLiveData");
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                TrendingStickerPanelPage trendingStickerPanelPage = new TrendingStickerPanelPage(layoutInflater, viewGroup.getContext(), c23528a, c1755a0, c1761c0, z11, c1761c02, str, interfaceC12972v, c1761c03);
                trendingStickerPanelPage.setLayoutParams(layoutParams);
                if (z12) {
                    trendingStickerPanelPage.m72853j(0, StickerPanelView.Companion.m72711a(), 0, 0);
                }
                return new g(trendingStickerPanelPage);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TrendingStickerPanelPage trendingStickerPanelPage) {
            super(trendingStickerPanelPage);
            AbstractC19074t.m100208f(trendingStickerPanelPage, "trendingPage");
            this.f67006I = trendingStickerPanelPage;
        }

        /* renamed from: i0 */
        public final void m72814i0(C12970t c12970t, int i11) {
            AbstractC19074t.m100208f(c12970t, "currentPage");
            this.f67006I.m72852h(c12970t.m72872g(), c12970t.m72873h(), i11);
        }
    }

    public C12922b(Context context, C23528a c23528a, int i11, C7110j8.d dVar, InterfaceC12972v interfaceC12972v, boolean z11, String str, boolean z12, int i12, boolean z13, boolean z14, StickerView.InterfaceC10959a interfaceC10959a) {
        List m131502j;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100208f(str, "autoPlayPrefix");
        this.f66987r = c23528a;
        this.f66988s = i11;
        this.f66989t = dVar;
        this.f66990u = interfaceC12972v;
        this.f66991v = z11;
        this.f66992w = str;
        this.f66993x = z12;
        this.f66994y = i12;
        this.f66995z = z13;
        this.f66966A = z14;
        this.f66967B = interfaceC10959a;
        m131502j = AbstractC25368s.m131502j();
        this.f66968C = m131502j;
        this.f66969D = new SparseArray();
        this.f66970E = -1;
        this.f66971F = -1;
        this.f66972G = -1;
        this.f66973H = -1;
        LayoutInflater from = LayoutInflater.from(context);
        AbstractC19074t.m100207e(from, "from(...)");
        this.f66974I = from;
        this.f66975J = new C1761c0();
        this.f66976K = new C1755a0();
        this.f66977L = new C1755a0();
        this.f66978M = new C1761c0();
        this.f66979N = new C1761c0();
        this.f66980O = new C1761c0();
        this.f66981P = new C1761c0();
        this.f66982Q = new C1761c0();
        this.f66983R = new C1761c0();
        this.f66984S = new C1761c0();
        this.f66985T = new C1761c0();
        this.f66986U = new C1761c0();
    }

    /* renamed from: L */
    private final void m72768L(List list) {
        int i11;
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            InterfaceC12965o interfaceC12965o = (InterfaceC12965o) it.next();
            if (interfaceC12965o instanceof C12958h) {
                i11 = i12 + 1;
                this.f66970E = i12;
            } else if (interfaceC12965o instanceof C12962l) {
                i11 = i12 + 1;
                this.f66971F = i12;
            } else if (interfaceC12965o instanceof C12970t) {
                i11 = i12 + 1;
                this.f66972G = i12;
            } else if (interfaceC12965o instanceof C12967q) {
                i11 = i12 + 1;
                this.f66973H = i12;
            }
            i12 = i11;
        }
    }

    /* renamed from: M */
    private final boolean m72769M() {
        return this.f66991v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        this.f66969D.put(i11, abstractC1876c0.f7784p);
        InterfaceC12965o interfaceC12965o = (InterfaceC12965o) this.f66968C.get(i11);
        if (abstractC1876c0 instanceof d) {
            ((d) abstractC1876c0).m72802i0();
            return;
        }
        if (abstractC1876c0 instanceof e) {
            ((e) abstractC1876c0).m72806i0(i11);
            return;
        }
        if (abstractC1876c0 instanceof b) {
            AbstractC19074t.m100206d(interfaceC12965o, "null cannot be cast to non-null type com.zing.zalo.ui.picker.stickerpanel.custom.EmoticonPagerItem");
            ((b) abstractC1876c0).m72794i0((C12958h) interfaceC12965o);
            return;
        }
        if (abstractC1876c0 instanceof c) {
            ((c) abstractC1876c0).m72798i0(i11);
            return;
        }
        if (abstractC1876c0 instanceof a) {
            AbstractC19074t.m100206d(interfaceC12965o, "null cannot be cast to non-null type com.zing.zalo.ui.picker.stickerpanel.custom.DownloadedCategoryPagerItem");
            ((a) abstractC1876c0).m72790i0((C12952b) interfaceC12965o, i11);
        } else if (abstractC1876c0 instanceof g) {
            AbstractC19074t.m100206d(interfaceC12965o, "null cannot be cast to non-null type com.zing.zalo.ui.picker.stickerpanel.custom.TrendingStickerPagerItem");
            ((g) abstractC1876c0).m72814i0((C12970t) interfaceC12965o, i11);
        } else if (abstractC1876c0 instanceof f) {
            AbstractC19074t.m100206d(interfaceC12965o, "null cannot be cast to non-null type com.zing.zalo.ui.picker.stickerpanel.custom.StickersPagerItem");
            ((f) abstractC1876c0).m72810i0((C12967q) interfaceC12965o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == EnumC30860d.f142409t.m150004c()) {
            return d.Companion.m72805b(viewGroup, this.f66987r, this.f66975J, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142410u.m150004c()) {
            return e.Companion.m72809b(viewGroup, this.f66976K, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142408s.m150004c()) {
            return b.Companion.m72797b(this.f66974I, viewGroup, this.f66977L, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142407r.m150004c()) {
            return c.Companion.m72801b(this.f66974I, viewGroup, this.f66977L, this.f66994y, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142412w.m150004c()) {
            return a.Companion.m72793b(this.f66974I, viewGroup, this.f66987r, this.f66989t, this.f66976K, this.f66978M, this.f66990u, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142411v.m150004c()) {
            return g.Companion.m72815a(this.f66974I, viewGroup, this.f66987r, this.f66976K, this.f66978M, m72769M(), this.f66992w, this.f66990u, this.f66981P, this.f66995z, this.f66982Q);
        }
        if (i11 == EnumC30860d.f142401A.m150004c()) {
            return f.Companion.m72813b(this.f66974I, viewGroup, this.f66987r, this.f66989t, this.f66988s, this.f66976K, this.f66978M, this.f66979N, m72769M(), this.f66992w, this.f66990u, this.f66993x, this.f66981P, this.f66983R, this.f66984S, this.f66985T, this.f66995z, this.f66982Q, this.f66986U, this.f66966A, this.f66967B);
        }
        throw new ClassCastException("Unknown viewType " + i11);
    }

    /* renamed from: N */
    public final LiveData m72770N() {
        return this.f66976K;
    }

    /* renamed from: O */
    public final LiveData m72771O() {
        return this.f66980O;
    }

    /* renamed from: P */
    public final LiveData m72772P() {
        return this.f66977L;
    }

    /* renamed from: Q */
    public final int m72773Q() {
        return this.f66970E;
    }

    /* renamed from: R */
    public final LiveData m72774R() {
        return this.f66986U;
    }

    /* renamed from: S */
    public final LiveData m72775S() {
        return this.f66979N;
    }

    /* renamed from: T */
    public final InterfaceC12965o m72776T(int i11) {
        if (i11 >= 0 && i11 < this.f66968C.size()) {
            return (InterfaceC12965o) this.f66968C.get(i11);
        }
        return null;
    }

    /* renamed from: U */
    public final LiveData m72777U() {
        return this.f66978M;
    }

    /* renamed from: V */
    public final LiveData m72778V() {
        return this.f66982Q;
    }

    /* renamed from: W */
    public final LiveData m72779W() {
        return this.f66981P;
    }

    /* renamed from: X */
    public final LiveData m72780X() {
        return this.f66984S;
    }

    /* renamed from: Y */
    public final LiveData m72781Y() {
        return this.f66975J;
    }

    /* renamed from: Z */
    public final LiveData m72782Z() {
        return this.f66985T;
    }

    /* renamed from: a0 */
    public final int m72783a0(int i11) {
        int i12 = 0;
        for (InterfaceC12965o interfaceC12965o : this.f66968C) {
            int i13 = i12 + 1;
            if (!(interfaceC12965o instanceof AbstractC12964n) || i11 != ((int) interfaceC12965o.mo72858b())) {
                i12 = i13;
            } else {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: b0 */
    public final int m72784b0(int i11) {
        int i12 = this.f66973H;
        if (i12 == -1) {
            return -1;
        }
        InterfaceC12965o interfaceC12965o = (InterfaceC12965o) this.f66968C.get(i12);
        if (!(interfaceC12965o instanceof C12967q)) {
            return -1;
        }
        return ((C12967q) interfaceC12965o).m72866f(i11);
    }

    /* renamed from: c0 */
    public final int m72785c0() {
        return this.f66973H;
    }

    /* renamed from: d0 */
    public final LiveData m72786d0() {
        return this.f66983R;
    }

    /* renamed from: e0 */
    public final View m72787e0(int i11) {
        return (View) this.f66969D.get(i11);
    }

    /* renamed from: f0 */
    public final void m72788f0() {
        int i11 = this.f66970E;
        if (i11 != -1 && this.f66969D.get(i11) != null) {
            Object obj = this.f66969D.get(this.f66970E);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.picker.stickerpanel.custom.EmojiChatPanelPage");
            ((EmojiChatPanelPage) obj).m72827f();
        }
    }

    /* renamed from: g0 */
    public final void m72789g0(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f66968C = list;
        m72768L(list);
        this.f66969D.clear();
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f66968C.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((InterfaceC12965o) this.f66968C.get(i11)).mo72858b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((InterfaceC12965o) this.f66968C.get(i11)).mo72857a().m150004c();
    }
}
