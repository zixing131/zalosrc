package com.zing.zalo.adapters;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.StickerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p134el.C18464c;
import p134el.C18466e;
import p134el.C18467f;
import p227i3.C20218v;
import p588vw.C28652r;
import p716zh.C31949hb;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import z90.AbstractC31727b;

/* renamed from: com.zing.zalo.adapters.o0 */
/* loaded from: classes3.dex */
public final class C7157o0 extends RecyclerView.AbstractC1880g {
    public static final d Companion = new d(null);

    /* renamed from: A */
    private f f39161A;

    /* renamed from: B */
    private AbstractC31727b f39162B;

    /* renamed from: C */
    private C1761c0 f39163C;

    /* renamed from: D */
    private C1761c0 f39164D;

    /* renamed from: E */
    private C1761c0 f39165E;

    /* renamed from: F */
    private final View.OnTouchListener f39166F;

    /* renamed from: r */
    private final int f39167r;

    /* renamed from: s */
    private int f39168s;

    /* renamed from: t */
    private int f39169t;

    /* renamed from: u */
    private int f39170u;

    /* renamed from: v */
    private final List f39171v;

    /* renamed from: w */
    private final InterfaceC24854k f39172w;

    /* renamed from: x */
    private final InterfaceC24854k f39173x;

    /* renamed from: y */
    private int f39174y;

    /* renamed from: z */
    private RecyclerView f39175z;

    /* renamed from: com.zing.zalo.adapters.o0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f39176q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1755a0 c1755a0) {
            super(1);
            this.f39176q = c1755a0;
        }

        /* renamed from: a */
        public final void m36421a(C18464c c18464c) {
            AbstractC19074t.m100208f(c18464c, "emojiClickParam");
            this.f39176q.mo9224q(c18464c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m36421a((C18464c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f39177q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1755a0 c1755a0) {
            super(1);
            this.f39177q = c1755a0;
        }

        /* renamed from: a */
        public final void m36422a(C18466e c18466e) {
            AbstractC19074t.m100208f(c18466e, "emojiLongClickParam");
            this.f39177q.mo9224q(c18466e);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m36422a((C18466e) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f39178q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1755a0 c1755a0) {
            super(1);
            this.f39178q = c1755a0;
        }

        /* renamed from: a */
        public final void m36423a(C18467f c18467f) {
            AbstractC19074t.m100208f(c18467f, "emojiTouchUpParam");
            this.f39178q.mo9224q(c18467f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m36423a((C18467f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$e */
    /* loaded from: classes3.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final int f39179I;

        /* renamed from: J */
        private final StickerView[] f39180J;

        /* renamed from: K */
        private final TextView[] f39181K;

        /* renamed from: L */
        private final LinearLayout[] f39182L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LinearLayout linearLayout, int i11, int i12, int i13, int i14, int i15) {
            super(linearLayout);
            int i16;
            AbstractC19074t.m100208f(linearLayout, "rowLayout");
            this.f39179I = i11;
            StickerView[] stickerViewArr = new StickerView[i11];
            for (int i17 = 0; i17 < i11; i17++) {
                Context context = this.f7784p.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                stickerViewArr[i17] = new StickerView(context);
            }
            this.f39180J = stickerViewArr;
            int i18 = this.f39179I;
            TextView[] textViewArr = new TextView[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                textViewArr[i19] = new TextView(this.f7784p.getContext());
            }
            this.f39181K = textViewArr;
            int i21 = this.f39179I;
            LinearLayout[] linearLayoutArr = new LinearLayout[i21];
            for (int i22 = 0; i22 < i21; i22++) {
                linearLayoutArr[i22] = new LinearLayout(this.f7784p.getContext());
            }
            this.f39182L = linearLayoutArr;
            int i23 = this.f39179I;
            for (int i24 = 0; i24 < i23; i24++) {
                StickerView stickerView = this.f39180J[i24];
                stickerView.setLayoutParams(new LinearLayout.LayoutParams(i12, i12));
                stickerView.setPadding(i13, i13, i13, i13);
                stickerView.setBackgroundResource(AbstractC16803z.item_emoji_background);
                LinearLayout linearLayout2 = this.f39182L[i24];
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
                linearLayout2.addView(stickerView);
                linearLayout2.setPadding(0, i14, 0, i14);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setBackgroundResource(AbstractC16803z.item_emoji_background);
                TextView textView = this.f39181K[i24];
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setGravity(17);
                textView.setText("");
                textView.setTextColor(-16777216);
                if (AbstractC23136l9.m118731n0(MainApplication.Companion.m35500c()) <= 480) {
                    i16 = 18;
                } else if (i15 == 1) {
                    i16 = 38;
                } else {
                    i16 = 24;
                }
                textView.setTextSize(1, i16);
                textView.setPadding(0, AbstractC23136l9.m118742r(6.0f), 0, AbstractC23136l9.m118742r(10.0f));
                linearLayout2.addView(textView);
                linearLayout.addView(linearLayout2);
            }
        }

        /* renamed from: i0 */
        public final int m36424i0() {
            return this.f39179I;
        }

        /* renamed from: j0 */
        public final TextView[] m36425j0() {
            return this.f39181K;
        }

        /* renamed from: k0 */
        public final StickerView[] m36426k0() {
            return this.f39180J;
        }

        /* renamed from: l0 */
        public final LinearLayout[] m36427l0() {
            return this.f39182L;
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$f */
    /* loaded from: classes3.dex */
    public static final class f implements Serializable {

        /* renamed from: p */
        public boolean f39183p = true;

        /* renamed from: q */
        public int f39184q;
    }

    /* renamed from: com.zing.zalo.adapters.o0$g */
    /* loaded from: classes3.dex */
    public static final class g extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private TextView f39185I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextView textView) {
            super(textView);
            AbstractC19074t.m100208f(textView, "currentLabel");
            this.f39185I = textView;
        }

        /* renamed from: i0 */
        public final TextView m36428i0() {
            return this.f39185I;
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f39186q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28652r mo12V4() {
            return C28652r.m143349v();
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f39187q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(MainApplication.Companion.m35500c(), 10.0f));
        }
    }

    /* renamed from: com.zing.zalo.adapters.o0$j */
    /* loaded from: classes3.dex */
    static final class j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f39188p;

        j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f39188p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f39188p;
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
            this.f39188p.mo205i9(obj);
        }
    }

    public C7157o0(boolean z11, AbstractC31727b abstractC31727b) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f39171v = new ArrayList();
        m129210a = AbstractC24856m.m129210a(h.f39186q);
        this.f39172w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(i.f39187q);
        this.f39173x = m129210a2;
        this.f39174y = -1;
        this.f39166F = new View.OnTouchListener() { // from class: com.zing.zalo.adapters.m0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m36412o0;
                m36412o0 = C7157o0.m36412o0(C7157o0.this, view, motionEvent);
                return m36412o0;
            }
        };
        m36414b0(z11);
        this.f39162B = abstractC31727b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m36400U(StickerView stickerView, C7157o0 c7157o0, View view) {
        AbstractC19074t.m100208f(stickerView, "$emoticonImageView");
        AbstractC19074t.m100208f(c7157o0, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            String emoticon = stickerView.getEmoticon();
            if (!TextUtils.isEmpty(emoticon)) {
                c7157o0.m36404Y(view, r1);
                int m118742r = r1[1] + AbstractC23136l9.m118742r(2.0f);
                int[] iArr = {0, m118742r};
                AbstractC31727b abstractC31727b = c7157o0.f39162B;
                if (abstractC31727b != null) {
                    abstractC31727b.mo38306d(emoticon, iArr[0], m118742r);
                }
                C1761c0 c1761c0 = c7157o0.f39163C;
                if (c1761c0 != null) {
                    c1761c0.mo9224q(new C18464c(emoticon, iArr[0], iArr[1]));
                }
            }
            int i11 = c7157o0.f39174y;
            if (i11 == -2) {
                C28652r.m143349v().m143369f(stickerView.getEmoticon());
            } else if (i11 == -3) {
                C28652r.m143349v().m143370g(stickerView.getEmoticon());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final boolean m36401V(StickerView stickerView, C7157o0 c7157o0, View view) {
        AbstractC19074t.m100208f(stickerView, "$emoticonImageView");
        AbstractC19074t.m100208f(c7157o0, "this$0");
        AbstractC19074t.m100208f(view, "view");
        String emoticon = stickerView.getEmoticon();
        if (!TextUtils.isEmpty(emoticon)) {
            RecyclerView recyclerView = c7157o0.f39175z;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
            c7157o0.m36404Y(view, r0);
            int m118742r = r0[1] + AbstractC23136l9.m118742r(2.0f);
            int[] iArr = {0, m118742r};
            AbstractC31727b abstractC31727b = c7157o0.f39162B;
            if (abstractC31727b != null) {
                abstractC31727b.mo71323f(emoticon, iArr[0], m118742r);
            }
            C1761c0 c1761c0 = c7157o0.f39164D;
            if (c1761c0 != null) {
                c1761c0.mo9224q(new C18466e(emoticon, iArr[0], iArr[1]));
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m36402W(StickerView stickerView, C7157o0 c7157o0, int i11, View view) {
        AbstractC19074t.m100208f(stickerView, "$emoticonImageView");
        AbstractC19074t.m100208f(c7157o0, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            String emoticon = stickerView.getEmoticon();
            if (!TextUtils.isEmpty(emoticon)) {
                c7157o0.m36404Y(view, r1);
                int i12 = r1[1] + i11;
                int[] iArr = {0, i12};
                AbstractC31727b abstractC31727b = c7157o0.f39162B;
                if (abstractC31727b != null) {
                    abstractC31727b.mo38306d(emoticon, iArr[0], i12);
                }
                C1761c0 c1761c0 = c7157o0.f39163C;
                if (c1761c0 != null) {
                    c1761c0.mo9224q(new C18464c(emoticon, iArr[0], iArr[1]));
                }
            }
            int i13 = c7157o0.f39174y;
            if (i13 == -2) {
                C28652r.m143349v().m143369f(stickerView.getEmoticon());
            } else if (i13 == -3) {
                C28652r.m143349v().m143370g(stickerView.getEmoticon());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final boolean m36403X(StickerView stickerView, C7157o0 c7157o0, int i11, View view) {
        AbstractC19074t.m100208f(stickerView, "$emoticonImageView");
        AbstractC19074t.m100208f(c7157o0, "this$0");
        AbstractC19074t.m100208f(view, "view");
        String emoticon = stickerView.getEmoticon();
        if (!TextUtils.isEmpty(emoticon)) {
            RecyclerView recyclerView = c7157o0.f39175z;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
            c7157o0.m36404Y(view, r0);
            int i12 = r0[1] + i11;
            int[] iArr = {0, i12};
            AbstractC31727b abstractC31727b = c7157o0.f39162B;
            if (abstractC31727b != null) {
                abstractC31727b.mo71323f(emoticon, iArr[0], i12);
            }
            C1761c0 c1761c0 = c7157o0.f39164D;
            if (c1761c0 != null) {
                c1761c0.mo9224q(new C18466e(emoticon, iArr[0], iArr[1]));
            }
        }
        return true;
    }

    /* renamed from: Y */
    private final void m36404Y(View view, int[] iArr) {
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + (view.getHeight() / 2);
    }

    /* renamed from: Z */
    private final C28652r m36405Z() {
        Object value = this.f39172w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (C28652r) value;
    }

    /* renamed from: a0 */
    private final int m36406a0() {
        return ((Number) this.f39173x.getValue()).intValue();
    }

    /* renamed from: c0 */
    private final List m36407c0() {
        int m143385z = C28652r.m143349v().m143385z(false);
        ArrayList arrayList = new ArrayList(C28652r.m143349v().f132845k);
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f39174y;
        if (i11 == -1) {
            List m143380t = C28652r.m143349v().m143380t(this.f39168s, false, false);
            AbstractC19074t.m100207e(m143380t, "getEmoticonsItemList(...)");
            arrayList2.addAll(m143380t);
        } else if (i11 == -2) {
            List m143380t2 = C28652r.m143349v().m143380t(this.f39168s, true, false);
            AbstractC19074t.m100207e(m143380t2, "getEmoticonsItemList(...)");
            arrayList2.addAll(m143380t2);
        } else if (i11 == -3) {
            List m143381u = C28652r.m143349v().m143381u(this.f39168s, true, false);
            AbstractC19074t.m100207e(m143381u, "getEmoticonsItemListForShortVideo(...)");
            arrayList2.addAll(m143381u);
        } else if (i11 >= 0 && i11 <= m143385z) {
            int size = ((C31949hb) arrayList.get(i11)).m153605c().size();
            int i12 = this.f39168s;
            int i13 = ((size + i12) - 1) / i12;
            for (int i14 = 0; i14 < i13; i14++) {
                C28652r.c cVar = new C28652r.c(0);
                int i15 = this.f39168s;
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((this.f39168s * i14) + i16 < ((C31949hb) arrayList.get(this.f39174y)).m153605c().size()) {
                        cVar.f132857c.add(((C31949hb) arrayList.get(this.f39174y)).m153605c().get((this.f39168s * i14) + i16));
                    }
                }
                arrayList2.add(cVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: d0 */
    private final void m36408d0() {
        final List m36407c0 = m36407c0();
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.n0
            @Override // java.lang.Runnable
            public final void run() {
                C7157o0.m36409e0(m36407c0, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m36409e0(List list, C7157o0 c7157o0) {
        AbstractC19074t.m100208f(list, "$result");
        AbstractC19074t.m100208f(c7157o0, "this$0");
        List list2 = list;
        if (!list2.isEmpty()) {
            c7157o0.f39171v.clear();
            c7157o0.f39171v.addAll(list2);
        }
        c7157o0.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m36410g0(C7157o0 c7157o0) {
        boolean z11;
        AbstractC19074t.m100208f(c7157o0, "this$0");
        try {
            if (!c7157o0.f39171v.isEmpty()) {
                boolean z12 = false;
                C28652r.c cVar = (C28652r.c) c7157o0.f39171v.get(0);
                if (cVar.f132855a == 1 && AbstractC19074t.m100204b(cVar.f132858d, MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_title_emoji_recent))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String str = "";
                if (z11 && c7157o0.f39171v.size() > 1) {
                    C28652r.c cVar2 = (C28652r.c) c7157o0.f39171v.get(1);
                    if (cVar2.f132855a == 0) {
                        AbstractC19074t.m100207e(cVar2.f132857c, "emoticonList");
                        if (!r5.isEmpty()) {
                            str = (String) cVar2.f132857c.get(0);
                        }
                    }
                }
                String[] m143382w = C28652r.m143349v().m143382w();
                AbstractC19074t.m100207e(m143382w, "getListHistory(...)");
                if (z11) {
                    if (m143382w.length == 0) {
                        z12 = true;
                    }
                    if (!(!z12) || AbstractC19074t.m100204b(m143382w[m143382w.length - 1], str)) {
                        return;
                    }
                }
                c7157o0.m36408d0();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m36411j0(C7157o0 c7157o0) {
        AbstractC19074t.m100208f(c7157o0, "this$0");
        c7157o0.m36408d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final boolean m36412o0(C7157o0 c7157o0, View view, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        AbstractC19074t.m100208f(c7157o0, "this$0");
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 3 && (recyclerView = c7157o0.f39175z) != null) {
                    recyclerView.requestDisallowInterceptTouchEvent(true);
                }
            } else {
                AbstractC31727b abstractC31727b = c7157o0.f39162B;
                if (abstractC31727b != null) {
                    abstractC31727b.mo71324g();
                }
                C1761c0 c1761c0 = c7157o0.f39165E;
                if (c1761c0 != null) {
                    c1761c0.mo9224q(new C18467f(0, 1, null));
                }
                RecyclerView recyclerView2 = c7157o0.f39175z;
                if (recyclerView2 != null) {
                    recyclerView2.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        C28652r.c cVar = (C28652r.c) this.f39171v.get(i11);
        int m9931C = abstractC1876c0.m9931C();
        if (m9931C != 0) {
            if (m9931C == 1 && (abstractC1876c0 instanceof g)) {
                int i12 = cVar.f132856b;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                ((g) abstractC1876c0).m36428i0().setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(5.5f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                            } else {
                                ((g) abstractC1876c0).m36428i0().setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                            }
                        } else {
                            ((g) abstractC1876c0).m36428i0().setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(80.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                        }
                    } else {
                        ((g) abstractC1876c0).m36428i0().setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                    }
                } else {
                    ((g) abstractC1876c0).m36428i0().setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                }
                ((g) abstractC1876c0).m36428i0().setText(cVar.f132858d);
                return;
            }
            return;
        }
        if (abstractC1876c0 instanceof e) {
            int i13 = 0;
            while (true) {
                e eVar = (e) abstractC1876c0;
                if (i13 < eVar.m36424i0()) {
                    if (i13 < cVar.f132857c.size()) {
                        StickerView stickerView = eVar.m36426k0()[i13];
                        LinearLayout linearLayout = eVar.m36427l0()[i13];
                        TextView textView = eVar.m36425j0()[i13];
                        Object obj = cVar.f132857c.get(i13);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        m36413T(stickerView, linearLayout, textView, (String) obj, cVar.f132861g);
                    } else {
                        eVar.m36426k0()[i13].setVisibility(8);
                        eVar.m36425j0()[i13].setVisibility(8);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                TextView textView = new TextView(viewGroup.getContext());
                textView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                textView.setGravity(16);
                textView.setTextColor(AbstractC23136l9.m118641B(MainApplication.Companion.m35500c(), AbstractC16801x.cTime2));
                textView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85301f8));
                return new g(textView);
            }
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
            textView2.setGravity(16);
            textView2.setTextColor(AbstractC23136l9.m118641B(MainApplication.Companion.m35500c(), AbstractC16801x.cTime2));
            textView2.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85301f8));
            return new g(textView2);
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        linearLayout.setId(AbstractC6918a0.icn_emoji_item);
        return new e(linearLayout, this.f39168s, this.f39170u, this.f39169t, m36406a0(), this.f39167r);
    }

    /* renamed from: T */
    public final void m36413T(final StickerView stickerView, View view, TextView textView, String str, boolean z11) {
        int i11;
        final int m118742r;
        AbstractC19074t.m100208f(stickerView, "emoticonImageView");
        AbstractC19074t.m100208f(view, "emoticonView");
        AbstractC19074t.m100208f(textView, "emojiView");
        AbstractC19074t.m100208f(str, "emoticon");
        stickerView.setEmoticon(str);
        f fVar = this.f39161A;
        if (fVar != null) {
            i11 = fVar.f39184q;
        } else {
            i11 = 0;
        }
        if (this.f39167r == 1) {
            i11 = 38;
        } else if (i11 <= 0) {
            i11 = 27;
        }
        if (m36405Z().m143375n(str, i11) != null && !z11) {
            stickerView.setImageDrawable(m36405Z().m143375n(str, i11));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7157o0.m36400U(StickerView.this, this, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.i0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m36401V;
                    m36401V = C7157o0.m36401V(StickerView.this, this, view2);
                    return m36401V;
                }
            });
            view.setPadding(0, m36406a0(), 0, m36406a0());
            view.setOnTouchListener(this.f39166F);
            stickerView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            stickerView.setVisibility(8);
            textView.setVisibility(0);
            if (m36405Z().m143375n(str, i11) != null) {
                textView.setText(C28652r.m143349v().m143358I(" " + str + " ", AbstractC23136l9.m118742r(i11 - 2)));
            } else {
                textView.setText(str);
            }
            if (m36405Z().m143375n(str, i11) != null) {
                m118742r = 0;
            } else {
                m118742r = AbstractC23136l9.m118742r(6.0f);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7157o0.m36402W(StickerView.this, this, m118742r, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.k0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m36403X;
                    m36403X = C7157o0.m36403X(StickerView.this, this, m118742r, view2);
                    return m36403X;
                }
            });
            view.setOnTouchListener(this.f39166F);
            view.setPadding(0, 0, 0, 0);
        }
        if (view.getVisibility() == 4) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b0 */
    public final void m36414b0(boolean z11) {
        int i11;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 7;
        }
        this.f39168s = i11;
        this.f39169t = 0;
        this.f39170u = MainApplication.Companion.m35500c().getResources().getDimensionPixelSize(AbstractC16802y.item_emoticon_height) + (this.f39169t * 2);
    }

    /* renamed from: f0 */
    public final void m36415f0() {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: com.zing.zalo.adapters.l0
            @Override // java.lang.Runnable
            public final void run() {
                C7157o0.m36410g0(C7157o0.this);
            }
        });
    }

    /* renamed from: h0 */
    public final void m36416h0(int i11) {
        if (i11 > 0) {
            this.f39168s = i11;
        }
    }

    /* renamed from: i0 */
    public final void m36417i0(int i11) {
        this.f39174y = i11;
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: com.zing.zalo.adapters.g0
            @Override // java.lang.Runnable
            public final void run() {
                C7157o0.m36411j0(C7157o0.this);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39171v.size();
    }

    /* renamed from: k0 */
    public final void m36418k0(f fVar) {
        AbstractC19074t.m100208f(fVar, "style");
        this.f39161A = fVar;
        if (fVar.f39184q > 0) {
            this.f39170u = AbstractC23136l9.m118712h(MainApplication.Companion.m35500c(), fVar.f39184q) + (this.f39169t * 2);
        }
    }

    /* renamed from: l0 */
    public final void m36419l0(RecyclerView recyclerView) {
        this.f39175z = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 < this.f39171v.size()) {
            return ((C28652r.c) this.f39171v.get(i11)).f132855a;
        }
        return 1;
    }

    /* renamed from: m0 */
    public final void m36420m0(AbstractC31727b abstractC31727b) {
        this.f39162B = abstractC31727b;
    }

    public C7157o0(boolean z11, C1755a0 c1755a0) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c1755a0, "liveData");
        this.f39171v = new ArrayList();
        m129210a = AbstractC24856m.m129210a(h.f39186q);
        this.f39172w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(i.f39187q);
        this.f39173x = m129210a2;
        this.f39174y = -1;
        this.f39166F = new View.OnTouchListener() { // from class: com.zing.zalo.adapters.m0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m36412o0;
                m36412o0 = C7157o0.m36412o0(C7157o0.this, view, motionEvent);
                return m36412o0;
            }
        };
        m36414b0(z11);
        this.f39163C = new C1761c0();
        this.f39164D = new C1761c0();
        this.f39165E = new C1761c0();
        C1761c0 c1761c0 = this.f39163C;
        AbstractC19074t.m100205c(c1761c0);
        c1755a0.m9256r(c1761c0, new j(new a(c1755a0)));
        C1761c0 c1761c02 = this.f39164D;
        AbstractC19074t.m100205c(c1761c02);
        c1755a0.m9256r(c1761c02, new j(new b(c1755a0)));
        C1761c0 c1761c03 = this.f39165E;
        AbstractC19074t.m100205c(c1761c03);
        c1755a0.m9256r(c1761c03, new j(new c(c1755a0)));
    }
}
