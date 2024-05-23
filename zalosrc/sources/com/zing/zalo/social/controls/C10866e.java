package com.zing.zalo.social.controls;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import au.C2370r0;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.LikesDialogView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kd0.C21697g;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import p172fy.C19171b;
import p207he.C20011e;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C32002l4;

/* renamed from: com.zing.zalo.social.controls.e */
/* loaded from: classes5.dex */
public class C10866e extends MetricAffectingSpan {

    /* renamed from: e0 */
    private static final ArrayList f54821e0 = new ArrayList();

    /* renamed from: f0 */
    private static final Object f54822f0 = new Object();

    /* renamed from: A */
    protected InterfaceC27218a f54823A;

    /* renamed from: B */
    private boolean f54824B;

    /* renamed from: C */
    private boolean f54825C;

    /* renamed from: D */
    private boolean f54826D;

    /* renamed from: E */
    private KeyEventCallbackC17462c f54827E;

    /* renamed from: F */
    private LikesDialogView f54828F;

    /* renamed from: G */
    private KeyEventCallbackC17462c f54829G;

    /* renamed from: H */
    private TrackingSource f54830H;

    /* renamed from: I */
    private boolean f54831I;

    /* renamed from: J */
    public int f54832J;

    /* renamed from: K */
    public String f54833K;

    /* renamed from: L */
    protected int f54834L;

    /* renamed from: M */
    protected int f54835M;

    /* renamed from: N */
    private boolean f54836N;

    /* renamed from: O */
    public boolean f54837O;

    /* renamed from: P */
    private Typeface f54838P;

    /* renamed from: Q */
    private int f54839Q;

    /* renamed from: R */
    private int f54840R;

    /* renamed from: S */
    private int f54841S;

    /* renamed from: T */
    private int f54842T;

    /* renamed from: U */
    private int f54843U;

    /* renamed from: V */
    private int f54844V;

    /* renamed from: W */
    private int f54845W;

    /* renamed from: X */
    private int f54846X;

    /* renamed from: Y */
    private View.OnClickListener f54847Y;

    /* renamed from: Z */
    private C16719g.c f54848Z;

    /* renamed from: a0 */
    private float f54849a0;

    /* renamed from: b0 */
    private float f54850b0;

    /* renamed from: c0 */
    private a f54851c0;

    /* renamed from: d0 */
    protected C2370r0 f54852d0;

    /* renamed from: p */
    protected String f54853p;

    /* renamed from: q */
    protected int f54854q;

    /* renamed from: r */
    private String f54855r;

    /* renamed from: s */
    private String f54856s;

    /* renamed from: t */
    private String f54857t;

    /* renamed from: u */
    private int f54858u;

    /* renamed from: v */
    private int f54859v;

    /* renamed from: w */
    protected boolean f54860w;

    /* renamed from: x */
    protected boolean f54861x;

    /* renamed from: y */
    protected int f54862y;

    /* renamed from: z */
    protected int f54863z;

    /* renamed from: com.zing.zalo.social.controls.e$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo44545a(int i11);
    }

    public C10866e(String str, int i11, int i12) {
        this.f54858u = -1;
        this.f54859v = -1;
        this.f54824B = false;
        this.f54825C = false;
        this.f54826D = false;
        this.f54831I = true;
        this.f54832J = 0;
        this.f54833K = "";
        this.f54835M = 0;
        this.f54837O = false;
        this.f54838P = null;
        this.f54862y = i11;
        this.f54863z = i12;
        this.f54860w = false;
        this.f54861x = false;
        this.f54842T = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cLink2);
        this.f54841S = C23212s8.m119606n(AbstractC21196a.TextColor2);
        this.f54839Q = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cLink1);
        this.f54840R = C23212s8.m119606n(AbstractC21196a.TextColor2);
        this.f54849a0 = AbstractC23136l9.m118742r(15.0f);
        this.f54843U = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cLink1);
        this.f54850b0 = AbstractC23136l9.m118742r(15.0f);
        this.f54844V = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cLink1);
        this.f54845W = C23212s8.m119606n(AbstractC21196a.TextColor1);
        this.f54846X = C23212s8.m119606n(AbstractC16781w.LinkColor);
        mo56388f(str);
        synchronized (f54822f0) {
            f54821e0.add(new WeakReference(this));
        }
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m56352A(String str) {
        return false;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m56353B(String str) {
        return false;
    }

    /* renamed from: C */
    public /* synthetic */ void m56354C(int i11, String str, InterfaceC17463d interfaceC17463d, int i12) {
        if (i11 == 1) {
            try {
                if (C20011e.f98374a.m103841b(83)) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    AbstractC23647d.m123897g("400808");
                                    AbstractC3102n.m15604w(this.f54823A, str);
                                }
                            } else {
                                AbstractC23647d.m123897g("400807");
                                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(this.f54823A.getContext(), str, new SensitiveData("clipboard_copy_phone_number_from_social_popup", "social_timeline"));
                            }
                        } else {
                            AbstractC23647d.m123897g("400806");
                            AbstractC3102n.m15606y(str, this.f54823A.getContext());
                        }
                    } else {
                        AbstractC23647d.m123897g("400805");
                        AbstractC3102n.m15605x(this.f54823A, str);
                    }
                    interfaceC17463d.dismiss();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    AbstractC23647d.m123897g("400808");
                    AbstractC3102n.m15604w(this.f54823A, str);
                }
            } else {
                AbstractC23647d.m123897g("400807");
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(this.f54823A.getContext(), str, new SensitiveData("clipboard_copy_phone_number_from_social_popup", "social_timeline"));
            }
        } else {
            AbstractC23647d.m123897g("400806");
            AbstractC3102n.m15606y(str, this.f54823A.getContext());
        }
        interfaceC17463d.dismiss();
    }

    /* renamed from: d */
    public static void m56358d(C10866e c10866e, InterfaceC27218a interfaceC27218a, String str, String str2, String str3, int i11) {
        if (c10866e != null) {
            try {
                c10866e.m56365I(interfaceC27218a);
                c10866e.m56379W(str);
                c10866e.m56394i0(str2);
                c10866e.m56373Q(str3);
                c10866e.m56385c0(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m56359e(C10866e c10866e, String str, String str2, int i11, int i12, InterfaceC10867f interfaceC10867f) {
        if (c10866e != null) {
            try {
                c10866e.m56369M(interfaceC10867f);
                c10866e.m56373Q(str);
                c10866e.m56394i0(str2);
                c10866e.m56385c0(i11);
                c10866e.m56374R(i12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public static synchronized void m56360g() {
        synchronized (C10866e.class) {
            try {
                try {
                    for (int size = f54821e0.size() - 1; size >= 0; size--) {
                        ArrayList arrayList = f54821e0;
                        WeakReference weakReference = (WeakReference) arrayList.get(size);
                        if (weakReference != null && weakReference.get() != null) {
                            C10866e c10866e = (C10866e) weakReference.get();
                            KeyEventCallbackC17462c keyEventCallbackC17462c = c10866e.f54827E;
                            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                                c10866e.f54827E.dismiss();
                            }
                            c10866e.f54827E = null;
                            LikesDialogView likesDialogView = c10866e.f54828F;
                            if (likesDialogView != null && likesDialogView.m92595KK()) {
                                c10866e.f54828F.dismiss();
                            }
                            c10866e.f54828F = null;
                        } else {
                            synchronized (f54822f0) {
                                arrayList.remove(size);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D */
    public void mo56361D(String str, Context context) {
        C32002l4 m154264g;
        String[] strArr;
        if (str != null) {
            try {
                if (m56391h() != null) {
                    m56391h().mo43565wo(this, str);
                    return;
                }
                int i11 = this.f54854q;
                if (i11 == 0 || i11 == 10 || i11 == 7 || i11 == 107 || i11 == 111) {
                    if (i11 == 107) {
                        m154264g = C32002l4.m154265h(10010, 5);
                    } else {
                        m154264g = C32002l4.m154264g(0);
                    }
                    if (this.f54830H != null && !str.equals(CoreUtility.f89233i)) {
                        C21927m.m114302u().m114330e0(str, this.f54830H);
                    }
                    new C19171b().m101508a(new C19171b.a(this.f54823A, new C26365a.b(str, m154264g).m135743b(), 0, 1));
                }
                if (this.f54854q == 5) {
                    Bundle m87089QR = ZaloWebView.m87089QR(str);
                    m87089QR.putInt("EXTRA_SOURCE_LINK", this.f54832J);
                    if (!TextUtils.isEmpty(this.f54833K)) {
                        m87089QR.putString("EXTRA_SOURCE_PARAM", this.f54833K);
                    }
                    InterfaceC27218a interfaceC27218a = this.f54823A;
                    if (interfaceC27218a != null) {
                        ZaloWebView.m87105iS(interfaceC27218a, str, m87089QR);
                    }
                }
                LikesDialogView likesDialogView = this.f54828F;
                if (likesDialogView != null && likesDialogView.m92595KK()) {
                    this.f54828F.dismiss();
                }
                if (this.f54854q == 6) {
                    LikesDialogView.C7989c c7989c = new LikesDialogView.C7989c(context);
                    if (this.f54858u > 0) {
                        c7989c.m43007h(String.format(this.f54823A.getContext().getString(AbstractC8020f0.str_titleLikeCount), Integer.valueOf(this.f54858u)));
                    } else {
                        c7989c.m43007h(this.f54823A.getContext().getString(AbstractC8020f0.str_titleLike));
                    }
                    c7989c.m43008i(this.f54830H).m43005f(this.f54823A.getContext().getString(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43001b(this.f54855r).m43003d(this.f54857t).m43002c(0).m43006g(ZAbstractBase.ZVU_BLEND_PERCENTAGE).m43000a(new LikesDialogView.InterfaceC7990d() { // from class: com.zing.zalo.social.controls.b
                        @Override // com.zing.zalo.dialog.LikesDialogView.InterfaceC7990d
                        /* renamed from: a */
                        public final boolean mo43009a(String str2) {
                            boolean m56352A;
                            m56352A = C10866e.m56352A(str2);
                            return m56352A;
                        }
                    });
                    LikesDialogView m42991YK = LikesDialogView.m42991YK(c7989c);
                    this.f54828F = m42991YK;
                    m42991YK.mo83093TK(this.f54823A.mo35579p());
                }
                if (this.f54854q == 8) {
                    LikesDialogView.C7989c c7989c2 = new LikesDialogView.C7989c(context);
                    if (this.f54858u > 0) {
                        c7989c2.m43007h(String.format(this.f54823A.getContext().getString(AbstractC8020f0.str_titleLikeCount), Integer.valueOf(this.f54858u)));
                    } else {
                        c7989c2.m43007h(this.f54823A.getContext().getString(AbstractC8020f0.str_titleLike));
                    }
                    c7989c2.m43008i(this.f54830H).m43005f(this.f54823A.getContext().getString(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43004e(this.f54856s).m43003d(this.f54857t).m43002c(1).m43006g(ZAbstractBase.ZVU_BLEND_GEN_THUMB).m43000a(new LikesDialogView.InterfaceC7990d() { // from class: com.zing.zalo.social.controls.c
                        @Override // com.zing.zalo.dialog.LikesDialogView.InterfaceC7990d
                        /* renamed from: a */
                        public final boolean mo43009a(String str2) {
                            boolean m56353B;
                            m56353B = C10866e.m56353B(str2);
                            return m56353B;
                        }
                    });
                    LikesDialogView m42991YK2 = LikesDialogView.m42991YK(c7989c2);
                    this.f54828F = m42991YK2;
                    m42991YK2.mo83093TK(this.f54823A.mo35579p());
                }
                if (this.f54854q == 101) {
                    this.f54823A.mo35579p().m93066i2(TagsListView.class, TagsListView.m84987kM(this.f54856s, this.f54857t, this.f54855r, this.f54859v).getExtras(), 10, 0, true);
                }
                if (this.f54854q == 110) {
                    KeyEventCallbackC17462c keyEventCallbackC17462c = this.f54829G;
                    if ((keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) || this.f54823A == null) {
                        return;
                    }
                    String trim = str.trim();
                    if (TextUtils.isEmpty(trim)) {
                        return;
                    }
                    AbstractC23647d.m123897g("400810");
                    int m121852e2 = AbstractC23309i.m121852e2();
                    if (m121852e2 == 1 && C20011e.f98374a.m103841b(83)) {
                        strArr = new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_free_call_via_zalo), AbstractC23136l9.m118743r0(AbstractC8020f0.str_call), AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num), AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num)};
                    } else {
                        strArr = new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_call), AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num), AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num)};
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this.f54823A.getContext(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, strArr);
                    C8009j.a aVar = new C8009j.a(this.f54823A.getContext());
                    aVar.m43172u(str.trim());
                    aVar.m43155d(true);
                    aVar.m43153b(arrayAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.social.controls.d

                        /* renamed from: q */
                        public final /* synthetic */ int f54819q;

                        /* renamed from: r */
                        public final /* synthetic */ String f54820r;

                        public /* synthetic */ C10865d(int m121852e22, String trim2) {
                            r2 = m121852e22;
                            r3 = trim2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            C10866e.this.m56354C(r2, r3, interfaceC17463d, i12);
                        }
                    });
                    KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f54829G;
                    if (keyEventCallbackC17462c2 != null && keyEventCallbackC17462c2.m92868m()) {
                        return;
                    }
                    C8009j m43152a = aVar.m43152a();
                    this.f54829G = m43152a;
                    m43152a.mo13822K();
                }
                a aVar2 = this.f54851c0;
                if (aVar2 != null) {
                    aVar2.mo44545a(this.f54854q);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public void mo50126E(View view) {
        Spannable spannableString;
        TextView textView = (TextView) view;
        if (textView.getText() instanceof Spannable) {
            spannableString = (Spannable) textView.getText();
        } else {
            spannableString = new SpannableString(textView.getText());
        }
        Selection.setSelection(spannableString, 0);
        this.f54860w = true;
        View.OnClickListener onClickListener = this.f54847Y;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            mo56361D(this.f54853p, view.getContext());
        }
        this.f54860w = false;
    }

    /* renamed from: F */
    public void mo56362F(C16719g c16719g) {
        Spannable spannableString;
        C21697g c21697g = (C21697g) c16719g;
        if (c21697g.m111973m1() instanceof Spannable) {
            spannableString = (Spannable) c21697g.m111973m1();
        } else {
            spannableString = new SpannableString(c21697g.m111973m1());
        }
        Selection.setSelection(spannableString, 0);
        this.f54860w = true;
        C16719g.c cVar = this.f54848Z;
        if (cVar != null) {
            cVar.mo929y(c16719g);
        } else {
            mo56361D(this.f54853p, c16719g.getContext());
        }
        this.f54860w = false;
    }

    /* renamed from: G */
    public void m56363G(View view, String str) {
        Spannable spannableString;
        TextView textView = (TextView) view;
        if (textView.getText() instanceof Spannable) {
            spannableString = (Spannable) textView.getText();
        } else {
            spannableString = new SpannableString(textView.getText());
        }
        Selection.setSelection(spannableString, 0);
        this.f54860w = true;
        if (!AbstractC23093i.m118471x()) {
            KeyEventCallbackC17462c m118462o = AbstractC23093i.m118462o(view.getContext(), str);
            this.f54827E = m118462o;
            if (m118462o != null) {
                m118462o.mo13822K();
            }
        }
        this.f54860w = false;
    }

    /* renamed from: H */
    public void m56364H(C16719g c16719g, String str) {
        Spannable spannableString;
        C21697g c21697g = (C21697g) c16719g;
        if (c21697g.m111973m1() instanceof Spannable) {
            spannableString = (Spannable) c21697g.m111973m1();
        } else {
            spannableString = new SpannableString(c21697g.m111973m1());
        }
        Selection.setSelection(spannableString, 0);
        this.f54860w = true;
        if (!AbstractC23093i.m118471x()) {
            KeyEventCallbackC17462c m118462o = AbstractC23093i.m118462o(c16719g.getContext(), str);
            this.f54827E = m118462o;
            if (m118462o != null) {
                m118462o.mo13822K();
            }
        }
        this.f54860w = false;
    }

    /* renamed from: I */
    public void m56365I(InterfaceC27218a interfaceC27218a) {
        this.f54823A = interfaceC27218a;
    }

    /* renamed from: J */
    public void m56366J(boolean z11) {
        this.f54824B = z11;
    }

    /* renamed from: K */
    protected void m56367K(Paint paint) {
        try {
            if (C13778s1.m76960a()) {
                if (C13778s1.m76960a()) {
                    paint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    paint.setFakeBoldText(true);
                }
            } else {
                paint.setFakeBoldText(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    protected void m56368L(Paint paint, Typeface typeface) {
        try {
            if (C13778s1.m76960a()) {
                if (C13778s1.m76960a()) {
                    paint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    paint.setTypeface(typeface);
                }
            } else {
                paint.setTypeface(typeface);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public void m56369M(InterfaceC10867f interfaceC10867f) {
        this.f54852d0 = new C2370r0(interfaceC10867f);
    }

    /* renamed from: N */
    public void m56370N(Typeface typeface) {
        this.f54838P = typeface;
    }

    /* renamed from: O */
    public void m56371O(boolean z11) {
        this.f54826D = z11;
    }

    /* renamed from: P */
    public void m56372P(int i11) {
        this.f54835M = i11;
    }

    /* renamed from: Q */
    public void m56373Q(String str) {
        this.f54855r = str;
    }

    /* renamed from: R */
    public void m56374R(int i11) {
        this.f54834L = i11;
    }

    /* renamed from: S */
    public void m56375S(boolean z11) {
        this.f54825C = z11;
    }

    /* renamed from: T */
    public void m56376T(int i11) {
        this.f54839Q = i11;
    }

    /* renamed from: U */
    public void m56377U(int i11) {
        this.f54840R = i11;
    }

    /* renamed from: V */
    public void m56378V(a aVar) {
        this.f54851c0 = aVar;
    }

    /* renamed from: W */
    public void m56379W(String str) {
        this.f54856s = str;
    }

    /* renamed from: X */
    public void m56380X(int i11) {
        this.f54843U = i11;
    }

    /* renamed from: Y */
    public void m56381Y(float f11) {
        this.f54850b0 = f11;
    }

    /* renamed from: Z */
    public void m56382Z(int i11) {
        this.f54841S = i11;
    }

    /* renamed from: a0 */
    public void m56383a0(float f11) {
        this.f54849a0 = f11;
    }

    /* renamed from: b0 */
    public void m56384b0(int i11) {
        this.f54858u = i11;
    }

    /* renamed from: c0 */
    public void m56385c0(int i11) {
        this.f54859v = i11;
    }

    /* renamed from: d0 */
    public void m56386d0(boolean z11) {
        this.f54861x = z11;
    }

    /* renamed from: e0 */
    public void m56387e0(TrackingSource trackingSource) {
        this.f54830H = trackingSource;
    }

    /* renamed from: f */
    public void mo56388f(String str) {
        int i11 = 13;
        int i12 = 0;
        if (str.startsWith("zm://Profile/")) {
            if (!str.startsWith("zm://Profile/")) {
                i11 = 0;
            }
            this.f54853p = str.substring(i11);
            this.f54854q = 0;
            return;
        }
        if (str.startsWith("zm://ProfileBold/")) {
            if (str.startsWith("zm://ProfileBold/")) {
                i12 = 17;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 7;
            return;
        }
        if (str.startsWith("zm://ProfileHeader/")) {
            if (str.startsWith("zm://ProfileHeader/")) {
                i12 = 19;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 10;
            return;
        }
        if (str.startsWith("zm://Comment/")) {
            if (!str.startsWith("zm://Comment/")) {
                i11 = 0;
            }
            this.f54853p = str.substring(i11);
            this.f54854q = 1;
            return;
        }
        if (str.startsWith("zm://Photo/")) {
            if (str.startsWith("zm://Photo/")) {
                i12 = 11;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 2;
            return;
        }
        if (str.startsWith("zm://Blog/")) {
            if (str.startsWith("zm://Blog/")) {
                i12 = 10;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 3;
            return;
        }
        if (str.startsWith("zm://Thumbnail/")) {
            if (str.startsWith("zm://Thumbnail/")) {
                i12 = 15;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 4;
            return;
        }
        if (str.startsWith("zm://Other/")) {
            this.f54853p = "";
            this.f54854q = 6;
            return;
        }
        if (str.startsWith("zm://Other_Photo/")) {
            this.f54853p = "";
            this.f54854q = 8;
            return;
        }
        if (str.startsWith("zm://Other_Tags/")) {
            this.f54853p = "";
            this.f54854q = 100;
            return;
        }
        if (str.startsWith("zm://Other_Tags_Photo/")) {
            this.f54853p = "";
            this.f54854q = 101;
            return;
        }
        if (str.startsWith("zm://Point/")) {
            this.f54853p = "";
            this.f54854q = 9;
            return;
        }
        if (str.startsWith("zm://SeeMore/")) {
            if (!str.startsWith("zm://SeeMore/")) {
                i11 = 0;
            }
            this.f54853p = str.substring(i11);
            this.f54854q = 102;
            return;
        }
        if (str.startsWith("zm://CommentSeeMore/")) {
            if (str.startsWith("zm://CommentSeeMore/")) {
                i12 = 20;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 103;
            return;
        }
        if (str.startsWith("zm://ChatSeeMore/")) {
            if (str.startsWith("zm://ChatSeeMore/")) {
                i12 = 17;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 104;
            return;
        }
        if (str.startsWith("zm://StoryAdsSeeMore/")) {
            if (str.startsWith("zm://StoryAdsSeeMore/")) {
                i12 = 21;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 113;
            return;
        }
        if (str.startsWith("zm://Other_Header_Feed")) {
            this.f54853p = "";
            this.f54854q = 105;
            return;
        }
        if (str.startsWith("zm://Feed_Location")) {
            this.f54853p = "";
            this.f54854q = 106;
            return;
        }
        if (str.startsWith("zm://ProfileComment/")) {
            if (str.startsWith("zm://ProfileComment/")) {
                i12 = 20;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 107;
            return;
        }
        if (str.startsWith("zm://SeeLess/")) {
            if (!str.startsWith("zm://SeeLess/")) {
                i11 = 0;
            }
            this.f54853p = str.substring(i11);
            this.f54854q = 108;
            return;
        }
        if (str.startsWith("zm://ImageAction")) {
            this.f54853p = str;
            this.f54854q = 109;
            return;
        }
        if (str.startsWith("zm://PhoneNumber/")) {
            if (str.startsWith("zm://PhoneNumber/")) {
                i12 = 17;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
            return;
        }
        if (str.startsWith("zm://FeedActivity/")) {
            if (str.startsWith("zm://FeedActivity/")) {
                i12 = 18;
            }
            this.f54853p = str.substring(i12);
            this.f54854q = 111;
            return;
        }
        if (str.startsWith("zm://LimitFeedVisibleRemindSection/")) {
            this.f54853p = "";
            this.f54854q = 112;
            return;
        }
        try {
            if (URLUtil.isValidUrl(str)) {
                this.f54853p = str;
                this.f54854q = 5;
            } else {
                this.f54853p = null;
            }
        } catch (Exception unused) {
            this.f54853p = null;
        }
    }

    /* renamed from: f0 */
    public void m56389f0(boolean z11) {
        this.f54837O = z11;
    }

    /* renamed from: g0 */
    public void m56390g0(String str) {
        this.f54853p = str;
    }

    /* renamed from: h */
    public InterfaceC10867f m56391h() {
        C2370r0 c2370r0 = this.f54852d0;
        if (c2370r0 != null) {
            return (InterfaceC10867f) c2370r0.m12394a();
        }
        return null;
    }

    /* renamed from: h0 */
    public void m56392h0(boolean z11) {
        this.f54831I = z11;
    }

    /* renamed from: i */
    public String m56393i() {
        return this.f54853p;
    }

    /* renamed from: i0 */
    public void m56394i0(String str) {
        this.f54857t = str;
    }

    /* renamed from: j */
    public int m56395j() {
        return this.f54863z;
    }

    /* renamed from: k */
    public int m56396k() {
        return this.f54835M;
    }

    /* renamed from: l */
    public String m56397l() {
        return this.f54855r;
    }

    /* renamed from: m */
    public int m56398m() {
        return this.f54834L;
    }

    /* renamed from: n */
    public a m56399n() {
        return this.f54851c0;
    }

    /* renamed from: o */
    public String m56400o() {
        return this.f54856s;
    }

    /* renamed from: p */
    public String m56401p() {
        return this.f54833K;
    }

    /* renamed from: q */
    public int m56402q() {
        return this.f54862y;
    }

    /* renamed from: r */
    public int m56403r() {
        return this.f54858u;
    }

    /* renamed from: s */
    public int m56404s() {
        return this.f54859v;
    }

    /* renamed from: t */
    public TrackingSource m56405t() {
        return this.f54830H;
    }

    /* renamed from: u */
    public int m56406u() {
        return this.f54854q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x000e, B:12:0x001d, B:14:0x0021, B:15:0x0092, B:17:0x0096, B:20:0x00a3, B:22:0x00a7, B:24:0x00b0, B:26:0x0027, B:29:0x0032, B:32:0x003c, B:35:0x004a, B:38:0x0059, B:41:0x0063, B:44:0x006d, B:47:0x0077, B:50:0x0081, B:51:0x0087, B:52:0x008d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x000e, B:12:0x001d, B:14:0x0021, B:15:0x0092, B:17:0x0096, B:20:0x00a3, B:22:0x00a7, B:24:0x00b0, B:26:0x0027, B:29:0x0032, B:32:0x003c, B:35:0x004a, B:38:0x0059, B:41:0x0063, B:44:0x006d, B:47:0x0077, B:50:0x0081, B:51:0x0087, B:52:0x008d), top: B:1:0x0000 }] */
    @Override // android.text.style.CharacterStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateDrawState(TextPaint textPaint) {
        try {
            updateMeasureState(textPaint);
            if (this.f54836N) {
                this.f54836N = false;
            }
            int i11 = this.f54854q;
            if (i11 != 102 && i11 != 103) {
                if (i11 == 5) {
                    if (this.f54837O) {
                        textPaint.setUnderlineText(true);
                    } else {
                        textPaint.setColor(this.f54839Q);
                    }
                } else if (i11 == 104) {
                    textPaint.setColor(this.f54839Q);
                } else if (i11 == 113) {
                    textPaint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.white));
                } else if (i11 == 9) {
                    textPaint.setColor(Color.rgb(7, 155, 9));
                } else if (i11 == 107) {
                    textPaint.setColor(this.f54842T);
                } else if (i11 == 108) {
                    textPaint.setColor(this.f54843U);
                } else if (i11 == 110) {
                    textPaint.setColor(this.f54844V);
                } else if (i11 == 111) {
                    textPaint.setColor(this.f54845W);
                } else if (i11 == 112) {
                    textPaint.setColor(this.f54846X);
                } else {
                    textPaint.setColor(this.f54840R);
                }
                if (!this.f54860w) {
                    textPaint.bgColor = C23212s8.m119606n(AbstractC7354t0.ItemBackgroundPress);
                    this.f54860w = false;
                    this.f54861x = false;
                    return;
                } else if (this.f54861x) {
                    textPaint.bgColor = C23212s8.m119606n(AbstractC7354t0.ItemBackgroundPress);
                    return;
                } else {
                    textPaint.bgColor = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.transparent);
                    return;
                }
            }
            textPaint.setColor(this.f54841S);
            if (!this.f54860w) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        int i11 = this.f54854q;
        if (i11 != 102 && i11 != 103) {
            if (i11 != 5 && i11 != 104) {
                if (i11 == 9) {
                    m56367K(textPaint);
                } else if (i11 == 107) {
                    textPaint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else if (i11 == 108) {
                    textPaint.setTextSize(this.f54850b0);
                } else if (i11 != 110) {
                    if (i11 == 111) {
                        m56368L(textPaint, Typeface.defaultFromStyle(1));
                    } else if (i11 != 112) {
                        if (i11 == 113) {
                            textPaint.setTextSize(this.f54849a0);
                            m56367K(textPaint);
                        } else if (this.f54831I) {
                            m56367K(textPaint);
                        }
                    }
                }
            }
        } else {
            textPaint.setTextSize(this.f54849a0);
        }
        Typeface typeface = this.f54838P;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    /* renamed from: v */
    public String m56407v() {
        return this.f54857t;
    }

    /* renamed from: w */
    public boolean m56408w() {
        return this.f54824B;
    }

    /* renamed from: x */
    public boolean m56409x() {
        return this.f54825C;
    }

    /* renamed from: y */
    public boolean m56410y() {
        return this.f54826D;
    }

    /* renamed from: z */
    public boolean m56411z() {
        return this.f54861x;
    }

    public C10866e() {
        this.f54858u = -1;
        this.f54859v = -1;
        this.f54824B = false;
        this.f54825C = false;
        this.f54826D = false;
        this.f54831I = true;
        this.f54832J = 0;
        this.f54833K = "";
        this.f54835M = 0;
        this.f54837O = false;
        this.f54838P = null;
        f54821e0.add(new WeakReference(this));
    }
}
