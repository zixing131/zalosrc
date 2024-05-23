package z50;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.custom.SquareImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p241ij.C20565b;
import p262jb.AbstractC21196a;
import pm0.C24848g0;
import ui0.C27280g;
import z50.C31657b;

/* renamed from: z50.b */
/* loaded from: classes5.dex */
public final class C31657b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final ArrayList f145469r;

    /* renamed from: s */
    private final InterfaceC18505l f145470s;

    /* renamed from: t */
    private int f145471t;

    /* renamed from: z50.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {
        public static final C33062a Companion = new C33062a(null);

        /* renamed from: O */
        private static final int f145472O = AbstractC23222t7.f112528I;

        /* renamed from: P */
        private static final int f145473P = AbstractC23222t7.f112576o;

        /* renamed from: Q */
        private static final int f145474Q;

        /* renamed from: R */
        private static final int f145475R;

        /* renamed from: S */
        private static final int f145476S;

        /* renamed from: I */
        public RelativeLayout f145477I;

        /* renamed from: J */
        public TextView f145478J;

        /* renamed from: K */
        public ImageView f145479K;

        /* renamed from: L */
        private TextView f145480L;

        /* renamed from: M */
        private InterfaceC18505l f145481M;

        /* renamed from: N */
        private C20565b f145482N;

        /* renamed from: z50.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C33062a {
            private C33062a() {
            }

            public /* synthetic */ C33062a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m152387a(Context context) {
                AbstractC19074t.m100208f(context, "context");
                RelativeLayout relativeLayout = new RelativeLayout(context);
                relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                relativeLayout.setBackground(AbstractC23136l9.m118718j(context));
                SquareImageView squareImageView = new SquareImageView(context, null);
                squareImageView.setId(AbstractC6918a0.chat_context_menu_imv_icon);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a.f145472O, a.f145472O);
                layoutParams.addRule(14);
                squareImageView.setLayoutParams(layoutParams);
                relativeLayout.addView(squareImageView);
                RobotoTextView robotoTextView = new RobotoTextView(context);
                robotoTextView.setId(AbstractC6918a0.chat_context_menu_tv_title);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(14);
                layoutParams2.addRule(3, squareImageView.getId());
                layoutParams2.setMargins(0, a.f145476S, 0, 0);
                robotoTextView.setLayoutParams(layoutParams2);
                robotoTextView.setGravity(1);
                robotoTextView.setMinLines(2);
                robotoTextView.setMaxScaledTextSize(AbstractC23222t7.f112580q);
                robotoTextView.setTextSize(1, 11.0f);
                robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
                relativeLayout.addView(robotoTextView);
                a aVar = new a(relativeLayout);
                aVar.m152384q0(relativeLayout);
                aVar.m152386s0(robotoTextView);
                aVar.m152385r0(squareImageView);
                return aVar;
            }
        }

        /* renamed from: z50.b$a$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f145483q = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m152388a(C20565b c20565b) {
                AbstractC19074t.m100208f(c20565b, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m152388a((C20565b) obj);
                return C24848g0.f119245a;
            }
        }

        static {
            int i11 = AbstractC23222t7.f112556e;
            f145474Q = i11;
            f145475R = i11;
            f145476S = i11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f145481M = b.f145483q;
            view.setOnClickListener(new View.OnClickListener() { // from class: z50.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31657b.a.m152376j0(C31657b.a.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public static final void m152376j0(a aVar, View view) {
            AbstractC19074t.m100208f(aVar, "this$0");
            C20565b c20565b = aVar.f145482N;
            if (c20565b != null) {
                aVar.f145481M.mo205i9(c20565b);
            }
        }

        /* renamed from: t0 */
        private final void m152379t0() {
            CharSequence text;
            C20565b c20565b = this.f145482N;
            if ((c20565b != null && c20565b.f101106h) || (c20565b != null && c20565b.f101107i)) {
                if (this.f145480L == null) {
                    Context context = m152380m0().getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    RobotoTextView robotoTextView = new RobotoTextView(context);
                    robotoTextView.setId(AbstractC6918a0.chat_context_menu_new_indicator);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23222t7.f112532K, -2);
                    layoutParams.addRule(6, m152381n0().getId());
                    layoutParams.addRule(18, m152381n0().getId());
                    layoutParams.setMargins(f145472O / 2, 0, 0, 0);
                    robotoTextView.setLayoutParams(layoutParams);
                    robotoTextView.setGravity(1);
                    robotoTextView.setMaxLines(1);
                    robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.badge_content_2));
                    robotoTextView.mo75850g(true);
                    robotoTextView.setTextSize(0, AbstractC23222t7.f112572m);
                    robotoTextView.setTextStyleBold(true);
                    int i11 = AbstractC23222t7.f112552c;
                    robotoTextView.setPadding(0, i11, 0, i11);
                    robotoTextView.setBackgroundResource(AbstractC16803z.bg_chat_context_menu_new_indicator);
                    this.f145480L = robotoTextView;
                    m152380m0().addView(this.f145480L);
                }
                C20565b c20565b2 = this.f145482N;
                if (c20565b2 != null && c20565b2.f101107i) {
                    text = "BETA";
                } else {
                    text = m152380m0().getContext().getResources().getText(AbstractC8020f0.str_item_cm_new_indicator);
                }
                AbstractC19074t.m100205c(text);
                TextView textView = this.f145480L;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f145480L;
                if (textView2 != null) {
                    textView2.setText(text);
                    return;
                }
                return;
            }
            TextView textView3 = this.f145480L;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }

        /* renamed from: m0 */
        public final RelativeLayout m152380m0() {
            RelativeLayout relativeLayout = this.f145477I;
            if (relativeLayout != null) {
                return relativeLayout;
            }
            AbstractC19074t.m100223u("mItemView");
            return null;
        }

        /* renamed from: n0 */
        public final ImageView m152381n0() {
            ImageView imageView = this.f145479K;
            if (imageView != null) {
                return imageView;
            }
            AbstractC19074t.m100223u("mThumb");
            return null;
        }

        /* renamed from: o0 */
        public final TextView m152382o0() {
            TextView textView = this.f145478J;
            if (textView != null) {
                return textView;
            }
            AbstractC19074t.m100223u("mTitle");
            return null;
        }

        /* renamed from: p0 */
        public final void m152383p0(C20565b c20565b, boolean z11, boolean z12, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(c20565b, "item");
            AbstractC19074t.m100208f(interfaceC18505l, "listener");
            this.f145482N = c20565b;
            this.f145481M = interfaceC18505l;
            m152382o0().setText(c20565b.f101100b);
            if (c20565b.f101102d) {
                ImageView m152381n0 = m152381n0();
                Context context = m152380m0().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m152381n0.setImageDrawable(C27280g.m139659b(context, c20565b.f101101c, c20565b.f101103e));
            } else if (c20565b.f101104f) {
                ImageView m152381n02 = m152381n0();
                Context context2 = m152380m0().getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                m152381n02.setImageDrawable(C27280g.m139660c(context2, c20565b.f101101c, c20565b.f101105g));
            } else {
                m152381n0().setImageResource(c20565b.f101101c);
            }
            if (z11) {
                RelativeLayout m152380m0 = m152380m0();
                int i11 = f145475R;
                int i12 = f145473P;
                m152380m0.setPadding(i11, f145474Q + i12, i11, i12);
            } else if (z12) {
                RelativeLayout m152380m02 = m152380m0();
                int i13 = f145475R;
                int i14 = f145473P;
                m152380m02.setPadding(i13, i14, i13, f145474Q + i14);
            } else {
                RelativeLayout m152380m03 = m152380m0();
                int i15 = f145475R;
                int i16 = f145473P;
                m152380m03.setPadding(i15, i16, i15, i16);
            }
            m152379t0();
        }

        /* renamed from: q0 */
        public final void m152384q0(RelativeLayout relativeLayout) {
            AbstractC19074t.m100208f(relativeLayout, "<set-?>");
            this.f145477I = relativeLayout;
        }

        /* renamed from: r0 */
        public final void m152385r0(ImageView imageView) {
            AbstractC19074t.m100208f(imageView, "<set-?>");
            this.f145479K = imageView;
        }

        /* renamed from: s0 */
        public final void m152386s0(TextView textView) {
            AbstractC19074t.m100208f(textView, "<set-?>");
            this.f145478J = textView;
        }
    }

    public C31657b(ArrayList arrayList, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(arrayList, "mMenuList");
        AbstractC19074t.m100208f(interfaceC18505l, "mOnItemSelectedListener");
        this.f145469r = arrayList;
        this.f145470s = interfaceC18505l;
        this.f145471t = 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(aVar, "holder");
        int size = this.f145469r.size() / this.f145471t;
        int size2 = this.f145469r.size();
        int i12 = this.f145471t;
        boolean z12 = false;
        if (size2 % i12 != 0 ? i11 >= size * i12 : i11 >= (size - 1) * i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object obj = this.f145469r.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        C20565b c20565b = (C20565b) obj;
        if (i11 / this.f145471t == 0) {
            z12 = true;
        }
        aVar.m152383p0(c20565b, z12, z11, this.f145470s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        a.C33062a c33062a = a.Companion;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return c33062a.m152387a(context);
    }

    /* renamed from: N */
    public final void m152374N(int i11) {
        this.f145471t = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f145469r.size();
    }
}
