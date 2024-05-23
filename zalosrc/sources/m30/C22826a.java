package m30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.story.p076ui.StoryViewerAndReactionRow;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import m30.C22826a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p649xl.C29724b4;
import p716zh.C31844ab;
import qm0.AbstractC25332a0;

/* renamed from: m30.a */
/* loaded from: classes5.dex */
public final class C22826a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final C23528a f111428r;

    /* renamed from: s */
    private List f111429s;

    /* renamed from: t */
    private boolean f111430t;

    /* renamed from: u */
    private boolean f111431u;

    /* renamed from: v */
    private b f111432v;

    /* renamed from: m30.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: m30.a$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo88173a(C31844ab c31844ab);

        /* renamed from: b */
        void mo88174b();

        /* renamed from: c */
        void mo88175c(C31844ab c31844ab, int i11);

        /* renamed from: d */
        void mo88176d(int i11, String str);
    }

    /* renamed from: m30.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C29724b4 f111433I;

        /* renamed from: m30.a$c$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m117538a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29724b4 m147757c = C29724b4.m147757c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m147757c, "inflate(...)");
                return new c(m147757c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C29724b4 c29724b4) {
            super(c29724b4.getRoot());
            AbstractC19074t.m100208f(c29724b4, "binding");
            this.f111433I = c29724b4;
        }

        /* renamed from: k0 */
        public static final void m117536k0(b bVar, View view) {
            if (bVar != null) {
                bVar.mo88174b();
            }
        }

        /* renamed from: j0 */
        public final void m117537j0(boolean z11, boolean z12, b bVar) {
            C29724b4 c29724b4 = this.f111433I;
            if (z11) {
                AbstractC23136l9.m118744r1(c29724b4.f137299r.f138654q, 0);
                AbstractC23136l9.m118744r1(c29724b4.f137298q, 8);
            } else if (z12) {
                AbstractC23136l9.m118744r1(c29724b4.f137299r.f138654q, 8);
                AbstractC23136l9.m118744r1(c29724b4.f137298q, 0);
                c29724b4.f137298q.setOnClickListener(new View.OnClickListener() { // from class: m30.b
                    public /* synthetic */ ViewOnClickListenerC22827b() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C22826a.c.m117536k0(C22826a.b.this, view);
                    }
                });
            }
        }
    }

    /* renamed from: m30.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final StoryViewerAndReactionRow f111434I;

        /* renamed from: m30.a$d$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m117540a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new d(new StoryViewerAndReactionRow(context, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StoryViewerAndReactionRow storyViewerAndReactionRow) {
            super(storyViewerAndReactionRow);
            AbstractC19074t.m100208f(storyViewerAndReactionRow, "contentView");
            this.f111434I = storyViewerAndReactionRow;
        }

        /* renamed from: i0 */
        public final void m117539i0(int i11, C31844ab c31844ab, C23528a c23528a, b bVar) {
            AbstractC19074t.m100208f(c23528a, "aQuery");
            if (c31844ab != null) {
                this.f111434I.m56607u(i11, c31844ab, c23528a, bVar);
            }
        }
    }

    public C22826a(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f111428r = c23528a;
        this.f111429s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        m131207g0 = AbstractC25332a0.m131207g0(this.f111429s, i11);
        C31844ab c31844ab = (C31844ab) m131207g0;
        if (abstractC1876c0 instanceof d) {
            ((d) abstractC1876c0).m117539i0(i11, c31844ab, this.f111428r, this.f111432v);
        } else if (abstractC1876c0 instanceof c) {
            ((c) abstractC1876c0).m117537j0(this.f111430t, this.f111431u, this.f111432v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 == 2) {
                return c.Companion.m117538a(viewGroup);
            }
            throw new ClassCastException("StoryViewerAndReactionAdapter Unknown view type: " + i11);
        }
        return d.Companion.m117540a(viewGroup);
    }

    /* renamed from: L */
    public final boolean m117531L() {
        return this.f111431u;
    }

    /* renamed from: M */
    public final void m117532M(List list) {
        List m131187O0;
        AbstractC19074t.m100208f(list, "items");
        try {
            m131187O0 = AbstractC25332a0.m131187O0(list);
            this.f111429s = m131187O0;
            m10008p();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: N */
    public final void m117533N(b bVar) {
        this.f111432v = bVar;
    }

    /* renamed from: O */
    public final void m117534O(boolean z11, boolean z12, boolean z13) {
        try {
            if (z11 == this.f111430t && z12 == this.f111431u) {
                return;
            }
            this.f111430t = z11;
            this.f111431u = z12;
            if (z13) {
                m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int i11;
        int size = this.f111429s.size();
        if (!this.f111430t && !this.f111431u) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        return size + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if ((!this.f111430t && !this.f111431u) || i11 < this.f111429s.size()) {
            return 1;
        }
        return 2;
    }
}
