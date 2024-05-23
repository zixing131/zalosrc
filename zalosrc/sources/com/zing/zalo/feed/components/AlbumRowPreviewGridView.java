package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bo.C3061y2;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.feed.uicontrols.C8884o;
import com.zing.zalo.feed.uicontrols.FeedGridModulesView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p559uv.C27373c;
import p649xl.C29978p6;

/* loaded from: classes4.dex */
public final class AlbumRowPreviewGridView extends RelativeLayout {

    /* renamed from: p */
    private C29978p6 f44117p;

    /* renamed from: q */
    private InterfaceC8067a f44118q;

    /* renamed from: r */
    public C23528a f44119r;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewGridView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8067a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewGridView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43483a(InterfaceC8067a interfaceC8067a) {
            }

            /* renamed from: b */
            public static void m43484b(InterfaceC8067a interfaceC8067a, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            }

            /* renamed from: c */
            public static void m43485c(InterfaceC8067a interfaceC8067a) {
            }

            /* renamed from: d */
            public static void m43486d(InterfaceC8067a interfaceC8067a, int i11) {
            }

            /* renamed from: e */
            public static void m43487e(InterfaceC8067a interfaceC8067a) {
            }
        }

        /* renamed from: c */
        void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11);

        /* renamed from: i */
        void mo43428i(int i11);

        /* renamed from: n1 */
        void mo43430n1();

        /* renamed from: r2 */
        void mo43431r2();

        /* renamed from: x1 */
        void mo43433x1();
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewGridView$b */
    /* loaded from: classes4.dex */
    public static final class C8068b implements C8880k.f {
        C8068b() {
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: a */
        public void mo43488a(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: b */
        public void mo43489b(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            InterfaceC8067a albumRowPreviewGridListener = AlbumRowPreviewGridView.this.getAlbumRowPreviewGridListener();
            if (albumRowPreviewGridListener != null) {
                albumRowPreviewGridListener.mo43425c(animationTarget, itemAlbumMobile, i11);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: c */
        public void mo43490c(int i11) {
            InterfaceC8067a albumRowPreviewGridListener = AlbumRowPreviewGridView.this.getAlbumRowPreviewGridListener();
            if (albumRowPreviewGridListener != null) {
                albumRowPreviewGridListener.mo43428i(i11);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: d */
        public void mo43491d(ItemAlbumMobile itemAlbumMobile, int i11) {
        }
    }

    public AlbumRowPreviewGridView(Context context) {
        super(context);
        m43482f(context);
    }

    /* renamed from: e */
    private final void m43475e(C3061y2 c3061y2) {
        m43476g(c3061y2);
        m43478i(c3061y2);
    }

    /* renamed from: g */
    private final void m43476g(C3061y2 c3061y2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11 = 8;
        C29978p6 c29978p6 = null;
        if (c3061y2.m14717f()) {
            C29978p6 c29978p62 = this.f44117p;
            if (c29978p62 == null) {
                AbstractC19074t.m100223u("binding");
                c29978p62 = null;
            }
            ViewGroup.LayoutParams layoutParams = c29978p62.f138966r.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = c3061y2.m14715d();
            }
            C29978p6 c29978p63 = this.f44117p;
            if (c29978p63 == null) {
                AbstractC19074t.m100223u("binding");
                c29978p63 = null;
            }
            FeedGridModulesView feedGridModulesView = c29978p63.f138970v;
            feedGridModulesView.setVisibility(0);
            feedGridModulesView.setWidth(AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left) + AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)));
            feedGridModulesView.setUseFileCache(false);
            C8884o c8884o = new C8884o(c3061y2.m14714c(), 0, AbstractC20826v0.m108824n0(0), -1);
            feedGridModulesView.m47295V(c8884o, 0, c3061y2.m14713b(), false);
            feedGridModulesView.m47297X(c8884o, false, 0);
            feedGridModulesView.setItemClickListener(new C8068b());
            C29978p6 c29978p64 = this.f44117p;
            if (c29978p64 == null) {
                AbstractC19074t.m100223u("binding");
                c29978p64 = null;
            }
            Button button = c29978p64.f138965q;
            if (c3061y2.m14712a()) {
                i11 = 0;
            }
            button.setVisibility(i11);
            C29978p6 c29978p65 = this.f44117p;
            if (c29978p65 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29978p6 = c29978p65;
            }
            c29978p6.f138965q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlbumRowPreviewGridView.m43477h(AlbumRowPreviewGridView.this, view);
                }
            });
            return;
        }
        C29978p6 c29978p66 = this.f44117p;
        if (c29978p66 == null) {
            AbstractC19074t.m100223u("binding");
            c29978p66 = null;
        }
        c29978p66.f138970v.setVisibility(8);
        C29978p6 c29978p67 = this.f44117p;
        if (c29978p67 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29978p6 = c29978p67;
        }
        c29978p6.f138965q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m43477h(AlbumRowPreviewGridView albumRowPreviewGridView, View view) {
        AbstractC19074t.m100208f(albumRowPreviewGridView, "this$0");
        InterfaceC8067a interfaceC8067a = albumRowPreviewGridView.f44118q;
        if (interfaceC8067a != null) {
            interfaceC8067a.mo43430n1();
        }
    }

    /* renamed from: i */
    private final void m43478i(C3061y2 c3061y2) {
        int i11;
        C29978p6 c29978p6 = null;
        if (c3061y2.m14718g()) {
            C27373c m14716e = c3061y2.m14716e();
            if (m14716e != null) {
                C29978p6 c29978p62 = this.f44117p;
                if (c29978p62 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p62 = null;
                }
                int i12 = 0;
                c29978p62.f138969u.setVisibility(0);
                C23528a aQuery = getAQuery();
                C29978p6 c29978p63 = this.f44117p;
                if (c29978p63 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p63 = null;
                }
                ((C23528a) aQuery.m123612r(c29978p63.f138967s)).m123618x(m14716e.m140268v(), C23278z2.m120126f0());
                C29978p6 c29978p64 = this.f44117p;
                if (c29978p64 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p64 = null;
                }
                c29978p64.f138971w.setText(AbstractC3460h.m17440h(m14716e.m140264r()));
                C29978p6 c29978p65 = this.f44117p;
                if (c29978p65 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p65 = null;
                }
                RobotoTextView robotoTextView = c29978p65.f138971w;
                if (m14716e.m140264r() > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                robotoTextView.setVisibility(i11);
                C29978p6 c29978p66 = this.f44117p;
                if (c29978p66 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p66 = null;
                }
                ImageView imageView = c29978p66.f138968t;
                if (!c3061y2.m14713b()) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                C29978p6 c29978p67 = this.f44117p;
                if (c29978p67 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p67 = null;
                }
                c29978p67.f138968t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AlbumRowPreviewGridView.m43479j(AlbumRowPreviewGridView.this, view);
                    }
                });
                C29978p6 c29978p68 = this.f44117p;
                if (c29978p68 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29978p68 = null;
                }
                c29978p68.f138969u.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AlbumRowPreviewGridView.m43480k(AlbumRowPreviewGridView.this, view);
                    }
                });
            }
            C29978p6 c29978p69 = this.f44117p;
            if (c29978p69 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29978p6 = c29978p69;
            }
            c29978p6.f138965q.setVisibility(8);
            return;
        }
        C29978p6 c29978p610 = this.f44117p;
        if (c29978p610 == null) {
            AbstractC19074t.m100223u("binding");
            c29978p610 = null;
        }
        c29978p610.f138969u.setVisibility(8);
        C29978p6 c29978p611 = this.f44117p;
        if (c29978p611 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29978p6 = c29978p611;
        }
        c29978p6.f138969u.setVerticalScrollbarPosition(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m43479j(AlbumRowPreviewGridView albumRowPreviewGridView, View view) {
        AbstractC19074t.m100208f(albumRowPreviewGridView, "this$0");
        InterfaceC8067a interfaceC8067a = albumRowPreviewGridView.f44118q;
        if (interfaceC8067a != null) {
            interfaceC8067a.mo43433x1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m43480k(AlbumRowPreviewGridView albumRowPreviewGridView, View view) {
        AbstractC19074t.m100208f(albumRowPreviewGridView, "this$0");
        InterfaceC8067a interfaceC8067a = albumRowPreviewGridView.f44118q;
        if (interfaceC8067a != null) {
            interfaceC8067a.mo43431r2();
        }
    }

    /* renamed from: d */
    public final void m43481d(C3061y2 c3061y2) {
        if (c3061y2 == null) {
            return;
        }
        if (this.f44117p == null) {
            AbstractC19074t.m100223u("binding");
        }
        m43475e(c3061y2);
    }

    /* renamed from: f */
    public final void m43482f(Context context) {
        C29978p6 m148363c = C29978p6.m148363c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148363c, "inflate(...)");
        this.f44117p = m148363c;
        setAQuery(new C23528a(context));
    }

    public final C23528a getAQuery() {
        C23528a c23528a = this.f44119r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("aQuery");
        return null;
    }

    public final InterfaceC8067a getAlbumRowPreviewGridListener() {
        return this.f44118q;
    }

    public final View getPreviewGrid() {
        C29978p6 c29978p6 = this.f44117p;
        if (c29978p6 == null) {
            AbstractC19074t.m100223u("binding");
            c29978p6 = null;
        }
        FeedGridModulesView feedGridModulesView = c29978p6.f138970v;
        AbstractC19074t.m100207e(feedGridModulesView, "photoPreviewGrid");
        return feedGridModulesView;
    }

    public final void setAQuery(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44119r = c23528a;
    }

    public final void setAlbumRowPreviewGridListener(InterfaceC8067a interfaceC8067a) {
        this.f44118q = interfaceC8067a;
    }

    public AlbumRowPreviewGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43482f(context);
    }
}
