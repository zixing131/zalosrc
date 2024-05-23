package com.zing.zalo.camera.colorpalette;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.camera.colorpalette.customview.ColorFillButton;
import com.zing.zalo.camera.colorpalette.customview.ColorImageButton;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import se.AbstractC26235a;

/* renamed from: com.zing.zalo.camera.colorpalette.a */
/* loaded from: classes3.dex */
public final class C7577a extends RecyclerView.AbstractC1880g {
    public static final c Companion = new c(null);

    /* renamed from: s */
    private static final int f41039s = AbstractC23136l9.m118736p(AbstractC16802y.color_palette_color_item_size);

    /* renamed from: t */
    private static final int f41040t = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: r */
    private List f41041r = new ArrayList();

    /* renamed from: com.zing.zalo.camera.colorpalette.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {
        public static final C32704a Companion = new C32704a(null);

        /* renamed from: I */
        private final ColorFillButton f41042I;

        /* renamed from: com.zing.zalo.camera.colorpalette.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32704a {
            private C32704a() {
            }

            public /* synthetic */ C32704a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m39177a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                ColorFillButton colorFillButton = new ColorFillButton(context);
                colorFillButton.setSize(C7577a.Companion.m39180a());
                return new a(colorFillButton);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f41042I = (ColorFillButton) view;
        }

        /* renamed from: i0 */
        public final void m39176i0(AbstractC26235a abstractC26235a) {
            AbstractC19074t.m100208f(abstractC26235a, "item");
            ColorFillButton colorFillButton = this.f41042I;
            if (abstractC26235a instanceof AbstractC26235a.b) {
                AbstractC26235a.b bVar = (AbstractC26235a.b) abstractC26235a;
                colorFillButton.setPaintCircleColor(bVar.m134891c());
                colorFillButton.setShowInnerStroke(bVar.m134892d());
            } else if (abstractC26235a instanceof AbstractC26235a.a) {
                AbstractC26235a.a aVar = (AbstractC26235a.a) abstractC26235a;
                if (!aVar.m134889g()) {
                    colorFillButton.setPaintCircleColor(aVar.m134887e());
                } else {
                    colorFillButton.m39183b(aVar.m134887e(), aVar.m134885c());
                }
                colorFillButton.setShowInnerStroke(aVar.m134886d());
            }
            colorFillButton.setButtonSelected(abstractC26235a.m134883a());
        }
    }

    /* renamed from: com.zing.zalo.camera.colorpalette.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private ColorImageButton f41043I;

        /* renamed from: com.zing.zalo.camera.colorpalette.a$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m39179a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                ColorImageButton colorImageButton = new ColorImageButton(context);
                colorImageButton.setSize(C7577a.Companion.m39180a());
                return new b(colorImageButton);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f41043I = (ColorImageButton) view;
        }

        /* renamed from: i0 */
        public final void m39178i0(AbstractC26235a.c cVar) {
            AbstractC19074t.m100208f(cVar, "item");
            ColorImageButton colorImageButton = this.f41043I;
            colorImageButton.setIconId(cVar.m134893c());
            colorImageButton.setButtonSelected(cVar.m134883a());
        }
    }

    /* renamed from: com.zing.zalo.camera.colorpalette.a$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m39180a() {
            return C7577a.f41039s;
        }

        /* renamed from: b */
        public final int m39181b() {
            return C7577a.f41040t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof a) {
            ((a) abstractC1876c0).m39176i0(m39174O(i11));
        } else if (abstractC1876c0 instanceof b) {
            AbstractC26235a m39174O = m39174O(i11);
            AbstractC19074t.m100206d(m39174O, "null cannot be cast to non-null type com.zing.zalo.camera.colorpalette.model.ColorItem.ImageData");
            ((b) abstractC1876c0).m39178i0((AbstractC26235a.c) m39174O);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 == 1) {
                return b.Companion.m39179a(viewGroup);
            }
            throw new ClassCastException("Unknown viewType " + i11);
        }
        return a.Companion.m39177a(viewGroup);
    }

    /* renamed from: N */
    public final void m39173N(boolean z11) {
        if (!this.f41041r.isEmpty()) {
            if (this.f41041r.get(0) instanceof AbstractC26235a.a) {
                int size = this.f41041r.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = this.f41041r.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.camera.colorpalette.model.ColorItem.CaptionFillData");
                    ((AbstractC26235a.a) obj).m134890h(z11);
                }
                m10008p();
            }
        }
    }

    /* renamed from: O */
    public final AbstractC26235a m39174O(int i11) {
        return (AbstractC26235a) this.f41041r.get(i11);
    }

    /* renamed from: P */
    public final void m39175P(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f41041r = list;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f41041r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m39174O(i11) instanceof AbstractC26235a.c ? 1 : 0;
    }
}
