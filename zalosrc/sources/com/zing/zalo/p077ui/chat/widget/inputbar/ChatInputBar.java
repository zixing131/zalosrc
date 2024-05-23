package com.zing.zalo.p077ui.chat.widget.inputbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.SendMessageDialog;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ho0.AbstractC20110a;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23201r8;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p020ak.C0883b;
import p055ce.C3432a;
import p105dn.EnumC18030a;
import p173fz.C19172a;
import p262jb.AbstractC21196a;
import p285k1.AbstractC21429c;
import p285k1.AbstractC21432f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p641xd.C29584h;
import p716zh.C32084r;
import p716zh.C32205z8;
import zl0.AbstractC32232i;
import zl0.AbstractC32234k;

/* loaded from: classes5.dex */
public class ChatInputBar extends FrameLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: C0 */
    public static final int f61018C0 = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: D0 */
    private static final SparseIntArray f61019D0;

    /* renamed from: E0 */
    private static final Map f61020E0;

    /* renamed from: F0 */
    static int f61021F0;

    /* renamed from: G0 */
    static AnimatorSet f61022G0;

    /* renamed from: H0 */
    static AnimatorSet f61023H0;

    /* renamed from: A */
    RedDotImageButton f61024A;

    /* renamed from: A0 */
    int f61025A0;

    /* renamed from: B */
    RedDotImageButton f61026B;

    /* renamed from: B0 */
    SendMessageDialog.InterfaceC7996a f61027B0;

    /* renamed from: C */
    RedDotImageButton f61028C;

    /* renamed from: D */
    RedDotImageButton f61029D;

    /* renamed from: E */
    ImageButton f61030E;

    /* renamed from: F */
    ImageButton f61031F;

    /* renamed from: G */
    RedDotImageButton f61032G;

    /* renamed from: H */
    ImageButton f61033H;

    /* renamed from: I */
    ImageButton f61034I;

    /* renamed from: J */
    View f61035J;

    /* renamed from: K */
    RelativeLayout f61036K;

    /* renamed from: L */
    boolean f61037L;

    /* renamed from: M */
    PhotoToggleButton f61038M;

    /* renamed from: N */
    ImageButton f61039N;

    /* renamed from: O */
    ImageButton f61040O;

    /* renamed from: P */
    FrameLayout f61041P;

    /* renamed from: Q */
    RobotoTextView f61042Q;

    /* renamed from: R */
    boolean f61043R;

    /* renamed from: S */
    LinearLayout f61044S;

    /* renamed from: T */
    boolean f61045T;

    /* renamed from: U */
    RobotoTextView f61046U;

    /* renamed from: V */
    RobotoTextView f61047V;

    /* renamed from: W */
    Button f61048W;

    /* renamed from: a0 */
    int f61049a0;

    /* renamed from: b0 */
    int f61050b0;

    /* renamed from: c0 */
    int f61051c0;

    /* renamed from: d0 */
    int f61052d0;

    /* renamed from: e0 */
    int f61053e0;

    /* renamed from: f0 */
    int f61054f0;

    /* renamed from: g0 */
    int f61055g0;

    /* renamed from: h0 */
    EnumC18030a f61056h0;

    /* renamed from: i0 */
    List f61057i0;

    /* renamed from: j0 */
    SparseArray f61058j0;

    /* renamed from: k0 */
    SparseArray f61059k0;

    /* renamed from: l0 */
    InterfaceC11745g f61060l0;

    /* renamed from: m0 */
    boolean f61061m0;

    /* renamed from: n0 */
    SendMessageDialog f61062n0;

    /* renamed from: o0 */
    private boolean f61063o0;

    /* renamed from: p */
    FrameLayout f61064p;

    /* renamed from: p0 */
    private C32084r f61065p0;

    /* renamed from: q */
    LinearLayout f61066q;

    /* renamed from: q0 */
    boolean f61067q0;

    /* renamed from: r */
    LinearLayout f61068r;

    /* renamed from: r0 */
    private float f61069r0;

    /* renamed from: s */
    RedDotImageButton f61070s;

    /* renamed from: s0 */
    private float f61071s0;

    /* renamed from: t */
    ImageButton f61072t;

    /* renamed from: t0 */
    View[] f61073t0;

    /* renamed from: u */
    ImageButton f61074u;

    /* renamed from: u0 */
    View[] f61075u0;

    /* renamed from: v */
    ImageButton f61076v;

    /* renamed from: v0 */
    ValueAnimator f61077v0;

    /* renamed from: w */
    ActionEditText f61078w;

    /* renamed from: w0 */
    final float f61079w0;

    /* renamed from: x */
    RedDotImageButton f61080x;

    /* renamed from: x0 */
    boolean f61081x0;

    /* renamed from: y */
    public RedDotImageButton f61082y;

    /* renamed from: y0 */
    boolean f61083y0;

    /* renamed from: z */
    public RedDotImageButton f61084z;

    /* renamed from: z0 */
    boolean f61085z0;

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$a */
    /* loaded from: classes5.dex */
    public class C11739a extends ActionEditText {
        C11739a(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.uicontrol.ActionEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (AbstractC23309i.m121699a0()) {
                editorInfo.imeOptions = 4;
            } else {
                editorInfo.imeOptions = 1;
            }
            editorInfo.imeOptions |= 268435456;
            AbstractC21429c.m110936b(editorInfo, C32205z8.Companion.m155302a());
            if (onCreateInputConnection != null) {
                return AbstractC21432f.m110941c(this, onCreateInputConnection, editorInfo);
            }
            return onCreateInputConnection;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$b */
    /* loaded from: classes5.dex */
    public class C11740b extends ClickableSpan {
        C11740b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            InterfaceC11745g interfaceC11745g = ChatInputBar.this.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64314f();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(ChatInputBar.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$c */
    /* loaded from: classes5.dex */
    public class C11741c extends ClickableSpan {
        C11741c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            InterfaceC11745g interfaceC11745g = ChatInputBar.this.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64311c();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(ChatInputBar.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$d */
    /* loaded from: classes5.dex */
    public class C11742d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f61089p;

        /* renamed from: q */
        final /* synthetic */ View f61090q;

        C11742d(View view, View view2) {
            this.f61089p = view;
            this.f61090q = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f61089p.setVisibility(0);
            this.f61090q.setVisibility(8);
            this.f61089p.setTranslationY(0.0f);
            this.f61090q.setTranslationY(0.0f);
            ChatInputBar chatInputBar = ChatInputBar.this;
            InterfaceC11745g interfaceC11745g = chatInputBar.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64318j(chatInputBar.f61052d0, chatInputBar.f61053e0, false);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f61089p.setVisibility(0);
            this.f61090q.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$e */
    /* loaded from: classes5.dex */
    public class C11743e extends AnimatorListenerAdapter {
        C11743e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (int i11 = 0; i11 < 2; i11++) {
                View view = ChatInputBar.this.f61075u0[i11];
                if (view != null) {
                    view.setAlpha(1.0f);
                    ChatInputBar.this.f61075u0[i11].setScaleX(1.0f);
                    ChatInputBar.this.f61075u0[i11].setScaleY(1.0f);
                }
                View view2 = ChatInputBar.this.f61073t0[i11];
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                    ChatInputBar.this.f61073t0[i11].setScaleX(1.0f);
                    ChatInputBar.this.f61073t0[i11].setScaleY(1.0f);
                    ChatInputBar.this.f61073t0[i11].setVisibility(8);
                }
            }
            ChatInputBar chatInputBar = ChatInputBar.this;
            InterfaceC11745g interfaceC11745g = chatInputBar.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64318j(chatInputBar.f61052d0, chatInputBar.f61053e0, false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$f */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11744f {

        /* renamed from: a */
        static final /* synthetic */ int[] f61093a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            f61093a = iArr;
            try {
                iArr[EnumC18030a.SINGLE_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61093a[EnumC18030a.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61093a[EnumC18030a.SINGLE_PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC11745g {
        /* renamed from: a */
        boolean mo64309a(int i11);

        /* renamed from: b */
        void mo64310b();

        /* renamed from: c */
        void mo64311c();

        /* renamed from: d */
        boolean mo64312d();

        /* renamed from: e */
        boolean mo64313e();

        /* renamed from: f */
        void mo64314f();

        /* renamed from: g */
        void mo64315g();

        /* renamed from: h */
        boolean mo64316h(int i11);

        /* renamed from: i */
        void mo64317i(int i11, String str);

        /* renamed from: j */
        void mo64318j(int i11, int i12, boolean z11);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(20);
        f61019D0 = sparseIntArray;
        f61020E0 = new Hashtable();
        sparseIntArray.put(-12, AbstractC16803z.icn_toolbar_oa_menu);
        sparseIntArray.put(-11, AbstractC16803z.btn_chat_input_emoticon);
        sparseIntArray.put(1, AbstractC16803z.btn_chat_input_gallery);
        sparseIntArray.put(2, AbstractC16803z.btn_chat_input_voice);
        sparseIntArray.put(3, AbstractC16803z.btn_chat_input_attach_a14);
        sparseIntArray.put(4, AbstractC16803z.icn_toolbar_mention);
        sparseIntArray.put(5, AbstractC16803z.icn_toolbar_typo);
        sparseIntArray.put(6, AbstractC16803z.btn_camera_n);
        sparseIntArray.put(7, AbstractC16803z.icn_toolbar_reminder);
        sparseIntArray.put(8, AbstractC16803z.icn_toolbar_poll);
        sparseIntArray.put(18, AbstractC16803z.icn_toolbar_notice);
        sparseIntArray.put(-13, AbstractC16803z.icn_chatbox_close_small);
        sparseIntArray.put(-10, AbstractC16803z.btn_chat_input_send);
        sparseIntArray.put(-14, AbstractC16803z.icn_textbox_back);
        sparseIntArray.put(-16, AbstractC16803z.icn_send);
        sparseIntArray.put(-19, AbstractC16803z.btn_chat_input_zinstant_oa_menu);
        sparseIntArray.put(-20, AbstractC16803z.ic_oa_zinstant_gradient);
        sparseIntArray.put(11, AbstractC16803z.btn_chat_input_file);
        f61021F0 = -1;
    }

    public ChatInputBar(Context context, EnumC18030a enumC18030a, C11598e.e eVar) {
        super(context);
        this.f61043R = false;
        this.f61045T = false;
        this.f61049a0 = 0;
        this.f61050b0 = 0;
        this.f61051c0 = 0;
        this.f61054f0 = -1;
        this.f61055g0 = 0;
        this.f61061m0 = false;
        this.f61063o0 = false;
        this.f61065p0 = AbstractC23306f.m120721w();
        this.f61067q0 = false;
        this.f61069r0 = -1.0f;
        this.f61071s0 = -1.0f;
        this.f61073t0 = new View[2];
        this.f61075u0 = new View[2];
        this.f61079w0 = AbstractC32232i.m155454b(0.4f, false);
        this.f61081x0 = false;
        this.f61083y0 = false;
        this.f61085z0 = false;
        this.f61056h0 = enumC18030a;
        this.f61057i0 = this.f61065p0.m154791h(enumC18030a, eVar);
        m65386s(eVar);
    }

    /* renamed from: A */
    public /* synthetic */ boolean m65364A(View view, MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3 && action != 6) {
                        }
                    } else {
                        SendMessageDialog sendMessageDialog = this.f61062n0;
                        if (sendMessageDialog != null) {
                            sendMessageDialog.m43052L(motionEvent);
                        }
                    }
                }
                SendMessageDialog sendMessageDialog2 = this.f61062n0;
                if (sendMessageDialog2 != null) {
                    sendMessageDialog2.m43052L(motionEvent);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: B */
    public /* synthetic */ void m65365B(InterfaceC17463d interfaceC17463d) {
        SendMessageDialog sendMessageDialog = this.f61062n0;
        if (sendMessageDialog != null) {
            sendMessageDialog.m43053M(null);
        }
    }

    /* renamed from: C */
    public /* synthetic */ void m65366C(View view) {
        this.f61060l0.mo64315g();
    }

    /* renamed from: D */
    public /* synthetic */ void m65367D(View view) {
        this.f61060l0.mo64310b();
    }

    /* renamed from: H */
    private void m65368H(ImageButton imageButton, ImageButton imageButton2) {
        FrameLayout frameLayout = this.f61064p;
        if (frameLayout == null) {
            return;
        }
        if (imageButton2 != null) {
            frameLayout.removeView(imageButton2);
        }
        if (imageButton != null && imageButton.getParent() == null) {
            this.f61064p.addView(imageButton, new FrameLayout.LayoutParams(this.f61051c0, this.f61050b0, 80));
            if (this.f61061m0) {
                this.f61058j0.put(0, imageButton);
                this.f61058j0.put(1, imageButton);
                imageButton.setVisibility(0);
            } else {
                this.f61058j0.remove(0);
                this.f61058j0.remove(1);
                imageButton.setVisibility(8);
            }
            m65369I();
        }
    }

    /* renamed from: I */
    private void m65369I() {
        int i11;
        int i12;
        View view = (View) this.f61058j0.get(this.f61053e0);
        View view2 = (View) this.f61059k0.get(this.f61053e0);
        if (view != null) {
            i11 = view.getLayoutParams().width;
        } else {
            i11 = 0;
        }
        if (view2 != null) {
            i12 = view2.getLayoutParams().width;
        } else {
            i12 = 0;
        }
        ((ViewGroup.MarginLayoutParams) this.f61068r.getLayoutParams()).setMargins(i11, 0, i12, 0);
    }

    /* renamed from: J */
    private void m65370J() {
        int i11 = this.f61054f0;
        if (i11 > -1) {
            setInputMode(i11);
            this.f61054f0 = -1;
        } else {
            setInputMode(1);
        }
    }

    /* renamed from: K */
    private void m65371K(ImageView imageView, int i11) {
        int i12 = f61019D0.get(i11);
        if (i12 != 0) {
            Map map = f61020E0;
            Drawable drawable = (Drawable) map.get(Integer.valueOf(i12));
            if (drawable == null) {
                drawable = AbstractC23136l9.m118665N(imageView.getContext(), i12);
                map.put(Integer.valueOf(i12), drawable);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: L */
    private void m65372L() {
        this.f61058j0 = new SparseArray(3);
        this.f61059k0 = new SparseArray(3);
        int i11 = C11744f.f61093a[this.f61056h0.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            this.f61059k0.put(0, this.f61066q);
            this.f61059k0.put(1, this.f61030E);
            this.f61059k0.put(2, this.f61033H);
        }
        int childCount = this.f61066q.getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.f61066q.getChildAt(i13);
            i12 += childAt.getLayoutParams().width + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
        }
        this.f61066q.getLayoutParams().width = i12;
        m65369I();
        View view = (View) this.f61058j0.get(0);
        View view2 = (View) this.f61059k0.get(0);
        if (view != null) {
            view.setVisibility(0);
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: U */
    public static void m65373U(Context context) {
        try {
            f61021F0 = C23212s8.m119601h();
            C32084r m120721w = AbstractC23306f.m120721w();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(m120721w.m154791h(EnumC18030a.SINGLE_USER, null));
            linkedHashSet.addAll(m120721w.m154791h(EnumC18030a.GROUP, null));
            linkedHashSet.add(-11);
            linkedHashSet.add(-10);
            linkedHashSet.add(-13);
            linkedHashSet.add(-16);
            linkedHashSet.add(11);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int i11 = f61019D0.get(((Integer) it.next()).intValue());
                if (i11 != 0) {
                    Map map = f61020E0;
                    if (((Drawable) map.get(Integer.valueOf(i11))) == null) {
                        map.put(Integer.valueOf(i11), AbstractC23136l9.m118665N(context, i11));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: m60.f.<init>(com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar, android.view.View, float, android.view.View):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: g */
    private void m65380g(int r7) {
        /*
            r6 = this;
            int r0 = r6.getHeight()
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto Lb
            return
        Lb:
            int r2 = r6.f61052d0
            if (r7 != r2) goto L10
            return
        L10:
            r3 = 3
            r4 = 2
            r5 = 1
            if (r7 == r5) goto L22
            if (r7 == r4) goto L1f
            if (r7 == r3) goto L1c
            android.widget.FrameLayout r7 = r6.f61064p
            goto L24
        L1c:
            android.widget.LinearLayout r7 = r6.f61044S
            goto L24
        L1f:
            android.widget.FrameLayout r7 = r6.f61041P
            goto L24
        L22:
            android.widget.RelativeLayout r7 = r6.f61036K
        L24:
            if (r2 == r5) goto L33
            if (r2 == r4) goto L30
            if (r2 == r3) goto L2d
            android.widget.FrameLayout r2 = r6.f61064p
            goto L35
        L2d:
            android.widget.LinearLayout r2 = r6.f61044S
            goto L35
        L30:
            android.widget.FrameLayout r2 = r6.f61041P
            goto L35
        L33:
            android.widget.RelativeLayout r2 = r6.f61036K
        L35:
            float[] r3 = new float[r4]
            r4 = 0
            r3[r4] = r1
            r3[r5] = r0
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r3)
            r3 = 100
            r1.setDuration(r3)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.setInterpolator(r3)
            m60.f r3 = new m60.f
            r3.<init>()
            r1.addUpdateListener(r3)
            com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$d r0 = new com.zing.zalo.ui.chat.widget.inputbar.ChatInputBar$d
            r0.<init>(r2, r7)
            r1.addListener(r0)
            r1.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar.m65380g(int):void");
    }

    /* renamed from: h */
    private void m65381h() {
        for (int i11 = 0; i11 < 2; i11++) {
            View view = this.f61073t0[i11];
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f61075u0[i11];
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.f61077v0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f61077v0 = ofFloat;
            ofFloat.setDuration(120L);
            this.f61077v0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m60.b
                public /* synthetic */ C22912b() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatInputBar.this.m65391z(valueAnimator);
                }
            });
            this.f61077v0.addListener(new C11743e());
        }
        this.f61077v0.start();
    }

    /* renamed from: m */
    public static void m65382m(int i11) {
        if (f61021F0 != i11) {
            f61021F0 = i11;
            f61020E0.clear();
        }
    }

    /* renamed from: n */
    private View m65383n(int i11) {
        View view;
        if (i11 != -19) {
            if (i11 != 11) {
                if (i11 != 18) {
                    switch (i11) {
                        case -16:
                            if (this.f61040O == null) {
                                ImageButton imageButton = new ImageButton(getContext());
                                this.f61040O = imageButton;
                                imageButton.setId(AbstractC6918a0.new_chat_input_btn_send_media);
                                this.f61040O.setMinimumHeight(this.f61050b0);
                                AbstractC23136l9.m118696b1(this.f61040O, AbstractC23136l9.m118718j(getContext()));
                                m65371K(this.f61040O, i11);
                                this.f61040O.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            view = this.f61040O;
                            break;
                        case -15:
                            if (this.f61038M == null) {
                                PhotoToggleButton photoToggleButton = new PhotoToggleButton(getContext());
                                this.f61038M = photoToggleButton;
                                photoToggleButton.setId(AbstractC6918a0.new_chat_input_cb_hq_photo);
                                this.f61038M.setCheckedImageResId(AbstractC16803z.hd_radio_checked);
                                this.f61038M.setUncheckedImageResId(AbstractC16803z.hd_radio_un_checked);
                                this.f61038M.setAnim(false);
                                this.f61038M.setChecked(false);
                            }
                            view = this.f61038M;
                            break;
                        case -14:
                            if (this.f61039N == null) {
                                ImageButton imageButton2 = new ImageButton(getContext());
                                this.f61039N = imageButton2;
                                imageButton2.setId(AbstractC6918a0.new_chat_input_btn_gallery_cancel);
                                this.f61039N.setMinimumHeight(this.f61050b0);
                                AbstractC23136l9.m118696b1(this.f61039N, AbstractC23136l9.m118718j(getContext()));
                                m65371K(this.f61039N, i11);
                                this.f61039N.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            view = this.f61039N;
                            break;
                        case -13:
                            if (this.f61033H == null) {
                                ImageButton imageButton3 = new ImageButton(getContext());
                                this.f61033H = imageButton3;
                                imageButton3.setId(AbstractC6918a0.new_chat_input_btn_close_media_search);
                                AbstractC23136l9.m118696b1(this.f61033H, AbstractC23136l9.m118718j(getContext()));
                                m65371K(this.f61033H, i11);
                                this.f61033H.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                this.f61033H.setVisibility(8);
                            }
                            view = this.f61033H;
                            break;
                        case -12:
                            if (this.f61074u == null) {
                                ImageButton imageButton4 = new ImageButton(getContext());
                                this.f61074u = imageButton4;
                                imageButton4.setId(AbstractC6918a0.new_chat_input_btn_open_page_menu);
                                AbstractC23136l9.m118696b1(this.f61074u, AbstractC23136l9.m118718j(getContext()));
                                this.f61074u.setMinimumHeight(this.f61050b0);
                                m65371K(this.f61074u, i11);
                                this.f61074u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                this.f61074u.setVisibility(8);
                                this.f61074u.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                            }
                            view = this.f61074u;
                            break;
                        case -11:
                            if (this.f61080x == null) {
                                RedDotImageButton redDotImageButton = new RedDotImageButton(getContext());
                                this.f61080x = redDotImageButton;
                                redDotImageButton.setId(AbstractC6918a0.new_chat_input_btn_chat_emoji);
                                AbstractC23136l9.m118696b1(this.f61080x, AbstractC23136l9.m118718j(getContext()));
                                this.f61080x.setMinimumHeight(this.f61050b0);
                                m65371K(this.f61080x, i11);
                                this.f61080x.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                this.f61080x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                this.f61080x.setVisibility(0);
                            }
                            view = this.f61080x;
                            break;
                        case -10:
                            if (this.f61030E == null) {
                                ImageButton imageButton5 = new ImageButton(getContext());
                                this.f61030E = imageButton5;
                                imageButton5.setId(AbstractC6918a0.new_chat_input_btn_chat_send);
                                AbstractC23136l9.m118696b1(this.f61030E, AbstractC23136l9.m118718j(getContext()));
                                this.f61030E.setMinimumHeight(this.f61050b0);
                                m65371K(this.f61030E, i11);
                                this.f61030E.setEnabled(false);
                                this.f61030E.setVisibility(8);
                                AbstractC23201r8.m119531a(this.f61030E, AbstractC8020f0.tb_btn_send_message);
                            }
                            view = this.f61030E;
                            break;
                        default:
                            switch (i11) {
                                case 1:
                                    if (this.f61024A == null) {
                                        RedDotImageButton redDotImageButton2 = new RedDotImageButton(getContext());
                                        this.f61024A = redDotImageButton2;
                                        redDotImageButton2.setId(AbstractC6918a0.new_chat_input_btn_show_gallery);
                                        AbstractC23136l9.m118696b1(this.f61024A, AbstractC23136l9.m118718j(getContext()));
                                        this.f61024A.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61024A, i11);
                                        this.f61024A.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61024A.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61024A;
                                    break;
                                case 2:
                                    if (this.f61084z == null) {
                                        RedDotImageButton redDotImageButton3 = new RedDotImageButton(getContext());
                                        this.f61084z = redDotImageButton3;
                                        redDotImageButton3.setId(AbstractC6918a0.new_chat_input_btn_show_voice);
                                        AbstractC23136l9.m118696b1(this.f61084z, AbstractC23136l9.m118718j(getContext()));
                                        this.f61084z.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61084z, i11);
                                        this.f61084z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61084z.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61084z;
                                    break;
                                case 3:
                                    if (this.f61070s == null) {
                                        RedDotImageButton redDotImageButton4 = new RedDotImageButton(getContext());
                                        this.f61070s = redDotImageButton4;
                                        redDotImageButton4.setId(AbstractC6918a0.new_chat_input_btn_attach);
                                        AbstractC23136l9.m118696b1(this.f61070s, AbstractC23136l9.m118718j(getContext()));
                                        m65371K(this.f61070s, i11);
                                        this.f61070s.setMinimumHeight(this.f61050b0);
                                        this.f61070s.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61070s.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                        this.f61070s.setRedDotColor(Color.parseColor("#006AF5"));
                                    }
                                    view = this.f61070s;
                                    break;
                                case 4:
                                    if (this.f61032G == null) {
                                        RedDotImageButton redDotImageButton5 = new RedDotImageButton(getContext());
                                        this.f61032G = redDotImageButton5;
                                        redDotImageButton5.setId(AbstractC6918a0.new_chat_input_btn_mention);
                                        AbstractC23136l9.m118696b1(this.f61032G, AbstractC23136l9.m118718j(getContext()));
                                        this.f61032G.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61032G, i11);
                                        this.f61032G.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61032G.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61032G;
                                    break;
                                case 5:
                                    if (this.f61029D == null) {
                                        RedDotImageButton redDotImageButton6 = new RedDotImageButton(getContext());
                                        this.f61029D = redDotImageButton6;
                                        redDotImageButton6.setId(AbstractC6918a0.new_chat_input_btn_typo);
                                        AbstractC23136l9.m118696b1(this.f61029D, AbstractC23136l9.m118718j(getContext()));
                                        this.f61029D.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61029D, i11);
                                        this.f61029D.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61029D.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61029D;
                                    break;
                                case 6:
                                    if (this.f61082y == null) {
                                        RedDotImageButton redDotImageButton7 = new RedDotImageButton(getContext());
                                        this.f61082y = redDotImageButton7;
                                        redDotImageButton7.setId(AbstractC6918a0.new_chat_input_btn_camera);
                                        AbstractC23136l9.m118696b1(this.f61082y, AbstractC23136l9.m118718j(getContext()));
                                        this.f61082y.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61082y, i11);
                                        this.f61082y.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61082y.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61082y;
                                    break;
                                case 7:
                                    if (this.f61028C == null) {
                                        RedDotImageButton redDotImageButton8 = new RedDotImageButton(getContext());
                                        this.f61028C = redDotImageButton8;
                                        redDotImageButton8.setId(AbstractC6918a0.new_chat_input_btn_reminder);
                                        AbstractC23136l9.m118696b1(this.f61028C, AbstractC23136l9.m118718j(getContext()));
                                        this.f61028C.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61028C, i11);
                                        this.f61028C.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61028C.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61028C;
                                    break;
                                case 8:
                                    if (this.f61031F == null) {
                                        ImageButton imageButton6 = new ImageButton(getContext());
                                        this.f61031F = imageButton6;
                                        imageButton6.setId(AbstractC6918a0.new_chat_input_btn_create_poll);
                                        AbstractC23136l9.m118696b1(this.f61031F, AbstractC23136l9.m118718j(getContext()));
                                        this.f61031F.setMinimumHeight(this.f61050b0);
                                        m65371K(this.f61031F, i11);
                                        this.f61031F.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        this.f61031F.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                                    }
                                    view = this.f61031F;
                                    break;
                                default:
                                    view = null;
                                    break;
                            }
                    }
                } else {
                    if (this.f61026B == null) {
                        RedDotImageButton redDotImageButton9 = new RedDotImageButton(getContext());
                        this.f61026B = redDotImageButton9;
                        redDotImageButton9.setId(AbstractC6918a0.new_chat_input_btn_notice);
                        AbstractC23136l9.m118696b1(this.f61026B, AbstractC23136l9.m118718j(getContext()));
                        this.f61026B.setMinimumHeight(this.f61050b0);
                        m65371K(this.f61026B, i11);
                        this.f61026B.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f61026B.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                    }
                    view = this.f61026B;
                }
            } else {
                if (this.f61034I == null) {
                    ImageButton imageButton7 = new ImageButton(getContext());
                    this.f61034I = imageButton7;
                    imageButton7.setId(AbstractC6918a0.new_chat_input_btn_document);
                    this.f61034I.setMinimumHeight(this.f61050b0);
                    AbstractC23136l9.m118696b1(this.f61034I, AbstractC23136l9.m118718j(getContext()));
                    m65371K(this.f61034I, i11);
                    this.f61034I.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                view = this.f61034I;
            }
        } else {
            if (this.f61072t == null) {
                ImageButton imageButton8 = new ImageButton(getContext());
                this.f61072t = imageButton8;
                imageButton8.setId(AbstractC6918a0.new_chat_input_btn_open_zinstant_page_menu);
                AbstractC23136l9.m118696b1(this.f61072t, AbstractC23136l9.m118718j(getContext()));
                this.f61072t.setMinimumHeight(this.f61050b0);
                m65371K(this.f61072t, i11);
                this.f61072t.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f61072t.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                this.f61072t.setOnClickListener(this);
            }
            view = this.f61072t;
        }
        if (view != null) {
            view.setOnClickListener(this);
            if (this.f61065p0.m154787a(i11)) {
                view.setOnLongClickListener(this);
            }
        }
        return view;
    }

    /* renamed from: q */
    public static int m65384q(Context context) {
        return C23212s8.m119607o(context, AbstractC21196a.TextColor1);
    }

    /* renamed from: r */
    public static int m65385r(Context context) {
        return C23212s8.m119607o(context, AbstractC16781w.TextColor3);
    }

    /* renamed from: s */
    private void m65386s(C11598e.e eVar) {
        int i11;
        this.f61025A0 = AbstractC32232i.m155453a(60.0f);
        this.f61050b0 = getContext().getResources().getDimensionPixelSize(AbstractC16802y.min_height_input_row);
        this.f61051c0 = getContext().getResources().getDimensionPixelSize(AbstractC16802y.input_bar_button_width);
        setMinimumHeight(this.f61050b0);
        AbstractC23136l9.m118699c1(this, C23212s8.m119607o(getContext(), AbstractC16781w.ChatBarBackgroundColor));
        setFocusable(true);
        setFocusableInTouchMode(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f61064p = frameLayout;
        frameLayout.setPadding(AbstractC32232i.m155453a(4.0f), 0, AbstractC32232i.m155453a(4.0f), 0);
        addView(this.f61064p, -1, -2);
        if (this.f61056h0 == EnumC18030a.SINGLE_PAGE) {
            this.f61074u = (ImageButton) m65383n(-12);
            this.f61072t = (ImageButton) m65383n(-19);
            ImageButton imageButton = this.f61074u;
            if (imageButton != null) {
                this.f61064p.addView(imageButton, new FrameLayout.LayoutParams(this.f61051c0, this.f61050b0, 80));
                ImageButton imageButton2 = this.f61074u;
                this.f61076v = imageButton2;
                imageButton2.setVisibility(8);
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f61068r = linearLayout;
        linearLayout.setOrientation(0);
        this.f61068r.setGravity(80);
        this.f61064p.addView(this.f61068r, -1, -2);
        RedDotImageButton redDotImageButton = (RedDotImageButton) m65383n(-11);
        this.f61080x = redDotImageButton;
        if (redDotImageButton != null) {
            this.f61068r.addView(redDotImageButton, this.f61051c0, this.f61050b0);
            RedDotImageButton redDotImageButton2 = this.f61080x;
            if (eVar == C11598e.e.f60097q) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            redDotImageButton2.setVisibility(i11);
        }
        C11739a c11739a = new C11739a(getContext());
        this.f61078w = c11739a;
        c11739a.setId(AbstractC6918a0.chatinput_text);
        this.f61078w.setGravity(16);
        this.f61078w.setAutoLinkMask(0);
        this.f61078w.setBackgroundColor(0);
        this.f61078w.setHint(AbstractC8020f0.chat_default_text);
        ActionEditText actionEditText = this.f61078w;
        actionEditText.setInputType(actionEditText.getInputType() | 180224);
        this.f61078w.setMinHeight(this.f61050b0);
        this.f61078w.setMaxLines(4);
        this.f61078w.setTextColor(m65384q(getContext()));
        this.f61078w.setHintTextColor(m65385r(getContext()));
        this.f61078w.setMaxScaledTextSize(AbstractC23136l9.m118742r(21.0f));
        this.f61078w.setTextSize(1, 18.0f);
        this.f61078w.setMaxLines(1);
        this.f61078w.setEllipsize(TextUtils.TruncateAt.END);
        setEtChatMessagePadding(eVar);
        AbstractC32234k.m155469a(this.f61078w, AbstractC16803z.chat_bar_text_cursor);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f61068r.addView(this.f61078w, layoutParams);
        ImageButton imageButton3 = (ImageButton) m65383n(-13);
        this.f61033H = imageButton3;
        if (imageButton3 != null) {
            this.f61064p.addView(imageButton3, new FrameLayout.LayoutParams(this.f61051c0, this.f61050b0, 85));
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f61066q = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f61066q.setGravity(80);
        this.f61066q.setVisibility(8);
        this.f61064p.addView(this.f61066q, new FrameLayout.LayoutParams(-2, this.f61050b0, 85));
        setupLayoutRightFunctions(eVar);
        ImageButton imageButton4 = (ImageButton) m65383n(-10);
        this.f61030E = imageButton4;
        if (imageButton4 != null) {
            this.f61064p.addView(imageButton4, new FrameLayout.LayoutParams(this.f61051c0, this.f61050b0, 85));
            this.f61030E.setOnTouchListener(new View.OnTouchListener() { // from class: m60.g
                public /* synthetic */ ViewOnTouchListenerC22917g() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m65364A;
                    m65364A = ChatInputBar.this.m65364A(view, motionEvent);
                    return m65364A;
                }
            });
            this.f61030E.setOnLongClickListener(this);
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f61036K = relativeLayout;
        relativeLayout.setVisibility(8);
        addView(this.f61036K, -1, -2);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f61041P = frameLayout2;
        frameLayout2.setPadding(AbstractC32232i.m155453a(16.0f), AbstractC32232i.m155453a(12.0f), AbstractC32232i.m155453a(16.0f), AbstractC32232i.m155453a(12.0f));
        this.f61041P.setVisibility(8);
        addView(this.f61041P, -1, -2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.f61044S = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f61044S.setPadding(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(16.0f));
        this.f61044S.setVisibility(8);
        addView(this.f61044S, -1, -2);
        View view = new View(getContext());
        int m119607o = C23212s8.m119607o(getContext(), AbstractC16781w.ChatSeparator);
        view.setBackgroundColor(m119607o);
        addView(view, -1, 1);
        View view2 = new View(getContext());
        this.f61035J = view2;
        view2.setBackgroundColor(m119607o);
        this.f61035J.setVisibility(4);
        addView(this.f61035J, new FrameLayout.LayoutParams(-1, 1, 80));
        m65372L();
    }

    private void setEtChatMessagePadding(C11598e.e eVar) {
        ActionEditText actionEditText = this.f61078w;
        if (actionEditText == null) {
            return;
        }
        if (eVar == C11598e.e.f60097q) {
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112576o;
            actionEditText.setPadding(i11, i12, 0, i12);
        } else {
            int i13 = AbstractC23222t7.f112576o;
            actionEditText.setPadding(0, i13, 0, i13);
        }
    }

    private void setupEditTextState(int i11) {
        String str = "";
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f61078w.setMaxLines(4);
                    this.f61078w.setHint("");
                    this.f61078w.setVerticalScrollBarEnabled(true);
                    return;
                }
                return;
            }
            this.f61078w.setMaxLines(4);
            this.f61078w.setHint("");
            this.f61078w.setVerticalScrollBarEnabled(true);
            this.f61030E.setEnabled(true);
            this.f61078w.requestFocus();
            return;
        }
        this.f61078w.setMaxLines(1);
        ActionEditText actionEditText = this.f61078w;
        int i12 = this.f61055g0;
        if (i12 != 0) {
            str = AbstractC23136l9.m118743r0(i12);
        }
        actionEditText.setHint(str);
        this.f61078w.setVerticalScrollBarEnabled(false);
        this.f61030E.setEnabled(false);
    }

    private void setupLayoutRightFunctions(C11598e.e eVar) {
        boolean z11;
        int i11;
        this.f61066q.removeAllViews();
        int size = this.f61057i0.size();
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.f61057i0.get(i12);
            if (i12 > 0 && i12 < size - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            View m65383n = m65383n(num.intValue());
            if (m65383n != null && m65383n.getParent() == null) {
                if (z11) {
                    m65383n.setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
                    this.f61066q.addView(m65383n, this.f61051c0 + AbstractC23136l9.m118742r(16.0f), this.f61050b0);
                } else {
                    m65383n.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
                    this.f61066q.addView(m65383n, this.f61051c0, this.f61050b0);
                }
                if (eVar == C11598e.e.f60097q) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                if (this.f61066q.getChildCount() >= i11) {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private void m65387u() {
        if (!this.f61045T) {
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f61046U = robotoTextView;
            robotoTextView.setTextSize(1, 15.0f);
            this.f61046U.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
            this.f61046U.setFontStyle(7);
            this.f61046U.setTextAlignment(4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 1;
            this.f61044S.addView(this.f61046U, layoutParams);
            RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
            this.f61047V = robotoTextView2;
            robotoTextView2.setTextSize(1, 15.0f);
            this.f61047V.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
            this.f61047V.setTextAlignment(4);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 1;
            layoutParams2.setMargins(0, AbstractC23136l9.m118742r(2.0f), 0, 0);
            this.f61044S.addView(this.f61047V, layoutParams2);
            Button button = new Button(getContext());
            this.f61048W = button;
            button.setIdTracking("BTN_LEARN_MORE_BLOCKED_CHAT_LAYOUT");
            this.f61048W.m90539c(AbstractC2814h.ButtonLarge_Secondary);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, AbstractC23136l9.m118742r(16.0f), 0, 0);
            this.f61044S.addView(this.f61048W, layoutParams3);
            this.f61045T = true;
        }
    }

    /* renamed from: v */
    private void m65388v(boolean z11) {
        if (!this.f61043R) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setImageResource(AbstractC16803z.ic_info_circle_solid_24);
            this.f61041P.addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2));
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            this.f61042Q = robotoTextView;
            robotoTextView.setTextSize(1, 12.0f);
            this.f61042Q.setTextColor(C23212s8.m119607o(getContext(), AbstractC17450b.NotificationColor5));
            setCannotChatTypeBlockChat(z11);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
            layoutParams.setMargins(AbstractC23136l9.m118742r(36.0f), 0, 0, 0);
            this.f61041P.addView(this.f61042Q, layoutParams);
            this.f61043R = true;
        }
    }

    /* renamed from: w */
    private void m65389w() {
        if (!this.f61037L) {
            ImageButton imageButton = (ImageButton) m65383n(-14);
            this.f61039N = imageButton;
            if (imageButton != null) {
                int i11 = this.f61050b0;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
                layoutParams.addRule(9);
                this.f61036K.addView(this.f61039N, layoutParams);
            }
            PhotoToggleButton photoToggleButton = (PhotoToggleButton) m65383n(-15);
            this.f61038M = photoToggleButton;
            if (photoToggleButton != null) {
                int i12 = this.f61050b0;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i12, i12);
                layoutParams2.addRule(13);
                this.f61036K.addView(this.f61038M, layoutParams2);
            }
            RobotoTextView robotoTextView = new RobotoTextView(getContext());
            robotoTextView.setText("HD");
            robotoTextView.setId(AbstractC6918a0.new_chat_input_text_view_hd);
            robotoTextView.setTextSize(1, 14.0f);
            robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTypeface(C13718q1.m76694c(getContext(), 7));
            robotoTextView.setPadding(0, AbstractC23136l9.m118742r(14.5f), AbstractC23136l9.m118742r(29.0f), AbstractC23136l9.m118742r(14.5f));
            robotoTextView.setOnClickListener(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(1, AbstractC6918a0.new_chat_input_cb_hq_photo);
            layoutParams3.addRule(15);
            layoutParams3.leftMargin = AbstractC23136l9.m118742r(-7.0f);
            this.f61036K.addView(robotoTextView, layoutParams3);
            ImageButton imageButton2 = (ImageButton) m65383n(-16);
            this.f61040O = imageButton2;
            if (imageButton2 != null) {
                int i13 = this.f61050b0;
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i13, i13);
                layoutParams4.addRule(11);
                this.f61036K.addView(this.f61040O, layoutParams4);
            }
            this.f61037L = true;
        }
    }

    /* renamed from: y */
    public /* synthetic */ void m65390y(View view, float f11, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f61052d0 == 0) {
            view.setTranslationY(floatValue - f11);
            view2.setTranslationY(floatValue);
        } else {
            view2.setTranslationY(-floatValue);
            view.setTranslationY(f11 - floatValue);
        }
    }

    /* renamed from: z */
    public /* synthetic */ void m65391z(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i11 = 0; i11 < 2; i11++) {
            View view = this.f61075u0[i11];
            if (view != null) {
                view.setAlpha(floatValue);
                this.f61075u0[i11].setScaleX(floatValue);
                this.f61075u0[i11].setScaleY(floatValue);
            }
            View view2 = this.f61073t0[i11];
            if (view2 != null) {
                float f11 = 1.0f - floatValue;
                view2.setAlpha(f11);
                this.f61073t0[i11].setScaleX(f11);
                this.f61073t0[i11].setScaleY(f11);
            }
        }
    }

    /* renamed from: E */
    public void m65392E(C11598e.e eVar) {
        int i11;
        this.f61057i0 = this.f61065p0.m154791h(this.f61056h0, eVar);
        RedDotImageButton redDotImageButton = this.f61080x;
        if (eVar == C11598e.e.f60097q) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(redDotImageButton, i11);
        setEtChatMessagePadding(eVar);
        setupLayoutRightFunctions(eVar);
        m65372L();
        for (int i12 = 0; i12 < this.f61058j0.size(); i12++) {
            AbstractC23136l9.m118744r1((View) this.f61058j0.get(this.f61058j0.keyAt(i12)), 8);
        }
        for (int i13 = 0; i13 < this.f61059k0.size(); i13++) {
            AbstractC23136l9.m118744r1((View) this.f61059k0.get(this.f61059k0.keyAt(i13)), 8);
        }
        View view = (View) this.f61058j0.get(this.f61053e0);
        View view2 = (View) this.f61059k0.get(this.f61053e0);
        if (view != null) {
            view.setVisibility(0);
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TransitionManager.beginDelayedTransition(this);
    }

    /* renamed from: F */
    public void m65393F() {
        if (m65408x()) {
            if (f61022G0 == null) {
                C0883b m2514E = AbstractC23306f.m120562A().m2514E();
                f61022G0 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "scaleX", 1.0f, 1.15f, 1.0f);
                ofFloat.setRepeatCount(m2514E.m2722a());
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "scaleY", 1.0f, 1.15f, 1.0f);
                ofFloat2.setRepeatCount(m2514E.m2722a());
                ofFloat2.setRepeatMode(2);
                ofFloat2.setDuration(300L);
                f61022G0.playTogether(ofFloat, ofFloat2);
            }
            f61022G0.cancel();
            f61022G0.setTarget(this.f61024A);
            f61022G0.start();
            this.f61024A.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_csc_newphoto));
            return;
        }
        m65403i();
    }

    /* renamed from: G */
    public void m65394G() {
        if (this.f61072t != null) {
            if (f61023H0 == null) {
                C0883b m2514E = AbstractC23306f.m120562A().m2514E();
                f61023H0 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "scaleX", 1.0f, 1.15f, 1.0f);
                ofFloat.setRepeatCount(m2514E.m2722a());
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "scaleY", 1.0f, 1.15f, 1.0f);
                ofFloat2.setRepeatCount(m2514E.m2722a());
                ofFloat2.setRepeatMode(2);
                ofFloat2.setDuration(300L);
                f61023H0.playTogether(ofFloat, ofFloat2);
            }
            f61023H0.cancel();
            f61023H0.setTarget(this.f61072t);
            f61023H0.start();
            return;
        }
        m65404j();
    }

    /* renamed from: M */
    public void m65395M() {
        if (this.f61052d0 == 3) {
            return;
        }
        m65387u();
        int i11 = this.f61052d0;
        this.f61052d0 = 3;
        this.f61036K.setVisibility(8);
        this.f61064p.setVisibility(8);
        this.f61041P.setVisibility(8);
        this.f61044S.setVisibility(0);
        InterfaceC11745g interfaceC11745g = this.f61060l0;
        if (interfaceC11745g != null) {
            interfaceC11745g.mo64318j(this.f61052d0, this.f61053e0, true);
        }
        m65380g(i11);
    }

    /* renamed from: N */
    public void m65396N(boolean z11) {
        if (this.f61052d0 == 2) {
            return;
        }
        m65388v(z11);
        int i11 = this.f61052d0;
        this.f61052d0 = 2;
        this.f61036K.setVisibility(8);
        this.f61064p.setVisibility(8);
        this.f61044S.setVisibility(8);
        this.f61041P.setVisibility(0);
        InterfaceC11745g interfaceC11745g = this.f61060l0;
        if (interfaceC11745g != null) {
            interfaceC11745g.mo64318j(this.f61052d0, this.f61053e0, true);
        }
        m65380g(i11);
    }

    /* renamed from: O */
    public void m65397O() {
        int i11;
        if (!this.f61063o0 && (i11 = this.f61052d0) != 0) {
            this.f61052d0 = 0;
            this.f61036K.setVisibility(8);
            this.f61041P.setVisibility(8);
            this.f61044S.setVisibility(8);
            this.f61064p.setVisibility(0);
            this.f61078w.requestFocus();
            InterfaceC11745g interfaceC11745g = this.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64318j(this.f61052d0, this.f61053e0, true);
            }
            m65380g(i11);
        }
    }

    /* renamed from: P */
    public void m65398P() {
        if (!this.f61063o0 && this.f61052d0 != 1) {
            m65389w();
            int i11 = this.f61052d0;
            this.f61052d0 = 1;
            this.f61036K.setVisibility(0);
            this.f61041P.setVisibility(8);
            this.f61064p.setVisibility(8);
            this.f61044S.setVisibility(8);
            InterfaceC11745g interfaceC11745g = this.f61060l0;
            if (interfaceC11745g != null) {
                interfaceC11745g.mo64318j(this.f61052d0, this.f61053e0, true);
            }
            m65380g(i11);
        }
    }

    /* renamed from: Q */
    public void m65399Q(boolean z11, boolean z12) {
        if (z11) {
            m65398P();
        } else {
            m65397O();
            int i11 = this.f61053e0;
            if (i11 != 0) {
                this.f61054f0 = i11;
                setInputMode(0);
            }
        }
        PhotoToggleButton photoToggleButton = this.f61038M;
        if (photoToggleButton != null) {
            photoToggleButton.setChecked(z12);
        }
    }

    /* renamed from: R */
    public void m65400R(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        try {
            if (i11 != -2) {
                switch (i11) {
                    case 100:
                    case 106:
                        m65389w();
                        RedDotImageButton redDotImageButton = this.f61080x;
                        if (redDotImageButton != null) {
                            redDotImageButton.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton2 = this.f61024A;
                        if (redDotImageButton2 != null) {
                            redDotImageButton2.setSelected(true);
                        }
                        RedDotImageButton redDotImageButton3 = this.f61084z;
                        if (redDotImageButton3 != null) {
                            redDotImageButton3.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton4 = this.f61070s;
                        if (redDotImageButton4 != null) {
                            redDotImageButton4.setSelected(false);
                        }
                        ImageButton imageButton = this.f61072t;
                        if (imageButton != null) {
                            imageButton.setSelected(false);
                        }
                        ImageButton imageButton2 = this.f61034I;
                        if (imageButton2 != null) {
                            imageButton2.setSelected(false);
                            break;
                        }
                        break;
                    case 101:
                    case 103:
                    case 104:
                    case 108:
                    default:
                        m65397O();
                        m65406l(i12);
                        RedDotImageButton redDotImageButton5 = this.f61080x;
                        if (redDotImageButton5 != null) {
                            redDotImageButton5.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton6 = this.f61024A;
                        if (redDotImageButton6 != null) {
                            redDotImageButton6.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton7 = this.f61084z;
                        if (redDotImageButton7 != null) {
                            redDotImageButton7.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton8 = this.f61070s;
                        if (redDotImageButton8 != null) {
                            redDotImageButton8.setSelected(false);
                        }
                        ImageButton imageButton3 = this.f61072t;
                        if (imageButton3 != null) {
                            imageButton3.setSelected(false);
                        }
                        ImageButton imageButton4 = this.f61034I;
                        if (imageButton4 != null) {
                            imageButton4.setSelected(false);
                            break;
                        }
                        break;
                    case 102:
                        m65397O();
                        m65406l(i12);
                        RedDotImageButton redDotImageButton9 = this.f61080x;
                        if (redDotImageButton9 != null) {
                            redDotImageButton9.setSelected(true);
                        }
                        RedDotImageButton redDotImageButton10 = this.f61024A;
                        if (redDotImageButton10 != null) {
                            redDotImageButton10.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton11 = this.f61084z;
                        if (redDotImageButton11 != null) {
                            redDotImageButton11.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton12 = this.f61070s;
                        if (redDotImageButton12 != null) {
                            redDotImageButton12.setSelected(false);
                        }
                        ImageButton imageButton5 = this.f61072t;
                        if (imageButton5 != null) {
                            imageButton5.setSelected(false);
                        }
                        ImageButton imageButton6 = this.f61034I;
                        if (imageButton6 != null) {
                            imageButton6.setSelected(false);
                            break;
                        }
                        break;
                    case 105:
                        m65397O();
                        m65405k(i12);
                        RedDotImageButton redDotImageButton13 = this.f61080x;
                        if (redDotImageButton13 != null) {
                            redDotImageButton13.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton14 = this.f61024A;
                        if (redDotImageButton14 != null) {
                            redDotImageButton14.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton15 = this.f61084z;
                        if (redDotImageButton15 != null) {
                            redDotImageButton15.setSelected(true);
                        }
                        RedDotImageButton redDotImageButton16 = this.f61070s;
                        if (redDotImageButton16 != null) {
                            redDotImageButton16.setSelected(false);
                        }
                        ImageButton imageButton7 = this.f61072t;
                        if (imageButton7 != null) {
                            imageButton7.setSelected(false);
                        }
                        ImageButton imageButton8 = this.f61034I;
                        if (imageButton8 != null) {
                            imageButton8.setSelected(false);
                            break;
                        }
                        break;
                    case 107:
                        m65397O();
                        m65405k(i12);
                        RedDotImageButton redDotImageButton17 = this.f61080x;
                        if (redDotImageButton17 != null) {
                            redDotImageButton17.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton18 = this.f61024A;
                        if (redDotImageButton18 != null) {
                            redDotImageButton18.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton19 = this.f61084z;
                        if (redDotImageButton19 != null) {
                            redDotImageButton19.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton20 = this.f61070s;
                        if (redDotImageButton20 != null) {
                            redDotImageButton20.setSelected(true);
                        }
                        ImageButton imageButton9 = this.f61072t;
                        if (imageButton9 != null) {
                            imageButton9.setSelected(false);
                        }
                        ImageButton imageButton10 = this.f61034I;
                        if (imageButton10 != null) {
                            imageButton10.setSelected(false);
                            break;
                        }
                        break;
                    case 109:
                        m65397O();
                        m65406l(i12);
                        RedDotImageButton redDotImageButton21 = this.f61080x;
                        if (redDotImageButton21 != null) {
                            redDotImageButton21.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton22 = this.f61024A;
                        if (redDotImageButton22 != null) {
                            redDotImageButton22.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton23 = this.f61084z;
                        if (redDotImageButton23 != null) {
                            redDotImageButton23.setSelected(false);
                        }
                        RedDotImageButton redDotImageButton24 = this.f61070s;
                        if (redDotImageButton24 != null) {
                            redDotImageButton24.setSelected(false);
                        }
                        if (this.f61072t != null) {
                            m65404j();
                            m65371K(this.f61072t, -19);
                            this.f61072t.setSelected(true);
                        }
                        ImageButton imageButton11 = this.f61034I;
                        if (imageButton11 != null) {
                            imageButton11.setSelected(false);
                            break;
                        }
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                        ImageButton imageButton12 = this.f61072t;
                        if (imageButton12 != null && !imageButton12.isSelected()) {
                            m65371K(this.f61072t, -20);
                            m65394G();
                            break;
                        }
                        break;
                }
            }
            View view = this.f61035J;
            if (i11 == -1) {
                i17 = 4;
            }
            view.setVisibility(i17);
            RedDotImageButton redDotImageButton25 = this.f61080x;
            if (redDotImageButton25 != null) {
                if (!redDotImageButton25.isSelected()) {
                    i16 = AbstractC8020f0.tb_open_input_emoji;
                } else {
                    i16 = AbstractC8020f0.tb_close_input_emoji;
                }
                AbstractC23201r8.m119531a(redDotImageButton25, i16);
            }
            RedDotImageButton redDotImageButton26 = this.f61024A;
            if (redDotImageButton26 != null) {
                if (!redDotImageButton26.isSelected()) {
                    i15 = AbstractC8020f0.tb_open_input_gallery;
                } else {
                    i15 = AbstractC8020f0.tb_close_input_gallery;
                }
                AbstractC23201r8.m119531a(redDotImageButton26, i15);
            }
            RedDotImageButton redDotImageButton27 = this.f61084z;
            if (redDotImageButton27 != null) {
                if (!redDotImageButton27.isSelected()) {
                    i14 = AbstractC8020f0.tb_open_input_voice;
                } else {
                    i14 = AbstractC8020f0.tb_close_input_voice;
                }
                AbstractC23201r8.m119531a(redDotImageButton27, i14);
            }
            RedDotImageButton redDotImageButton28 = this.f61070s;
            if (redDotImageButton28 != null) {
                if (!redDotImageButton28.isSelected()) {
                    i13 = AbstractC8020f0.tb_open_input_attachment;
                } else {
                    i13 = AbstractC8020f0.tb_close_input_attachment;
                }
                AbstractC23201r8.m119531a(redDotImageButton28, i13);
            }
            ImageButton imageButton13 = this.f61034I;
            if (imageButton13 != null) {
                AbstractC23201r8.m119531a(imageButton13, AbstractC8020f0.tb_btn_send_document);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public void m65401S() {
        ImageButton imageButton = this.f61076v;
        ImageButton imageButton2 = this.f61074u;
        if (imageButton == imageButton2) {
            return;
        }
        m65368H(imageButton2, imageButton);
        this.f61076v = this.f61074u;
    }

    /* renamed from: T */
    public void m65402T() {
        ImageButton imageButton = this.f61076v;
        ImageButton imageButton2 = this.f61072t;
        if (imageButton == imageButton2) {
            return;
        }
        m65368H(imageButton2, imageButton);
        this.f61076v = this.f61072t;
    }

    public PhotoToggleButton getCbHQ() {
        m65389w();
        return this.f61038M;
    }

    /* renamed from: i */
    public void m65403i() {
        AnimatorSet animatorSet = f61022G0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        RedDotImageButton redDotImageButton = this.f61024A;
        if (redDotImageButton != null) {
            redDotImageButton.setImageResource(AbstractC16803z.btn_chat_input_gallery);
        }
    }

    /* renamed from: j */
    public void m65404j() {
        AnimatorSet animatorSet = f61023H0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: k */
    public void m65405k(int i11) {
        if (this.f61078w.length() <= 0 && i11 != 2) {
            int i12 = this.f61053e0;
            if (i12 != 0) {
                this.f61054f0 = i12;
                setInputMode(0);
                return;
            }
            return;
        }
        m65406l(i11);
    }

    /* renamed from: l */
    public void m65406l(int i11) {
        boolean z11;
        if (this.f61078w.length() <= 0 && i11 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f61052d0 == 0 && z11 && this.f61053e0 == 0) {
            m65370J();
            if (this.f61078w.length() > 0) {
                ActionEditText actionEditText = this.f61078w;
                actionEditText.setSelection(actionEditText.length());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11745g interfaceC11745g;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.new_chat_input_btn_chat_send) {
            InterfaceC11745g interfaceC11745g2 = this.f61060l0;
            if (interfaceC11745g2 != null) {
                interfaceC11745g2.mo64317i(-10, "csc_chatbar");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_chat_emoji) {
            InterfaceC11745g interfaceC11745g3 = this.f61060l0;
            if (interfaceC11745g3 != null) {
                interfaceC11745g3.mo64317i(-11, "csc_chatbar");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_open_page_menu) {
            InterfaceC11745g interfaceC11745g4 = this.f61060l0;
            if (interfaceC11745g4 != null) {
                interfaceC11745g4.mo64317i(-12, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_close_media_search) {
            InterfaceC11745g interfaceC11745g5 = this.f61060l0;
            if (interfaceC11745g5 != null) {
                interfaceC11745g5.mo64317i(-13, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_gallery_cancel) {
            InterfaceC11745g interfaceC11745g6 = this.f61060l0;
            if (interfaceC11745g6 != null) {
                interfaceC11745g6.mo64317i(-14, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_text_view_hd) {
            PhotoToggleButton photoToggleButton = this.f61038M;
            if (photoToggleButton != null) {
                photoToggleButton.setChecked(!photoToggleButton.isChecked());
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_cb_hq_photo) {
            InterfaceC11745g interfaceC11745g7 = this.f61060l0;
            if (interfaceC11745g7 != null) {
                interfaceC11745g7.mo64317i(-15, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_send_media) {
            InterfaceC11745g interfaceC11745g8 = this.f61060l0;
            if (interfaceC11745g8 != null) {
                interfaceC11745g8.mo64317i(-16, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_show_gallery) {
            InterfaceC11745g interfaceC11745g9 = this.f61060l0;
            if (interfaceC11745g9 != null) {
                interfaceC11745g9.mo64317i(1, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_show_voice) {
            InterfaceC11745g interfaceC11745g10 = this.f61060l0;
            if (interfaceC11745g10 != null) {
                interfaceC11745g10.mo64317i(2, "csc_chatbar");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_attach) {
            InterfaceC11745g interfaceC11745g11 = this.f61060l0;
            if (interfaceC11745g11 != null) {
                interfaceC11745g11.mo64317i(3, "csc_chatbar");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_mention) {
            InterfaceC11745g interfaceC11745g12 = this.f61060l0;
            if (interfaceC11745g12 != null) {
                interfaceC11745g12.mo64317i(4, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_typo) {
            InterfaceC11745g interfaceC11745g13 = this.f61060l0;
            if (interfaceC11745g13 != null) {
                interfaceC11745g13.mo64317i(5, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_camera) {
            InterfaceC11745g interfaceC11745g14 = this.f61060l0;
            if (interfaceC11745g14 != null) {
                interfaceC11745g14.mo64317i(6, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_reminder) {
            InterfaceC11745g interfaceC11745g15 = this.f61060l0;
            if (interfaceC11745g15 != null) {
                interfaceC11745g15.mo64317i(7, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_notice) {
            InterfaceC11745g interfaceC11745g16 = this.f61060l0;
            if (interfaceC11745g16 != null) {
                interfaceC11745g16.mo64317i(18, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_create_poll) {
            InterfaceC11745g interfaceC11745g17 = this.f61060l0;
            if (interfaceC11745g17 != null) {
                interfaceC11745g17.mo64317i(8, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_open_zinstant_page_menu) {
            InterfaceC11745g interfaceC11745g18 = this.f61060l0;
            if (interfaceC11745g18 != null) {
                interfaceC11745g18.mo64317i(-19, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_document && (interfaceC11745g = this.f61060l0) != null) {
            interfaceC11745g.mo64317i(11, "");
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.new_chat_input_btn_show_gallery) {
            InterfaceC11745g interfaceC11745g = this.f61060l0;
            if (interfaceC11745g == null) {
                return false;
            }
            return interfaceC11745g.mo64316h(1);
        }
        if (id2 == AbstractC6918a0.new_chat_input_btn_show_voice) {
            if (this.f61060l0 == null) {
                return false;
            }
            if (C19172a.m100600k("chat_voice_record@enable_new_ui", 0) == 1) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                this.f61067q0 = true;
                return this.f61060l0.mo64309a(iArr[0]);
            }
            return this.f61060l0.mo64316h(2);
        }
        if (id2 != AbstractC6918a0.new_chat_input_btn_chat_send) {
            return false;
        }
        try {
            InterfaceC11745g interfaceC11745g2 = this.f61060l0;
            if (interfaceC11745g2 != null && interfaceC11745g2.mo64313e()) {
                return true;
            }
            InterfaceC11745g interfaceC11745g3 = this.f61060l0;
            if (interfaceC11745g3 != null && interfaceC11745g3.mo64312d()) {
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int width = iArr2[0] + (view.getWidth() / 2);
                int height = iArr2[1] + (view.getHeight() / 2);
                ActionEditText actionEditText = this.f61078w;
                if (actionEditText != null) {
                    actionEditText.setHint("");
                }
                SendMessageDialog sendMessageDialog = new SendMessageDialog(getContext(), width, height);
                this.f61062n0 = sendMessageDialog;
                sendMessageDialog.m43053M(this.f61027B0);
                this.f61062n0.m92873y(false);
                this.f61062n0.m92874z(false);
                this.f61062n0.m92855F(new InterfaceC17463d.e() { // from class: m60.c
                    public /* synthetic */ C22913c() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        ChatInputBar.this.m65365B(interfaceC17463d);
                    }
                });
                this.f61062n0.mo13822K();
                return false;
            }
            this.f61062n0 = null;
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    public void m65407p() {
        try {
            SendMessageDialog sendMessageDialog = this.f61062n0;
            if (sendMessageDialog != null && sendMessageDialog.m92868m()) {
                SendMessageDialog.InterfaceC7996a interfaceC7996a = this.f61027B0;
                if (interfaceC7996a != null) {
                    interfaceC7996a.mo43056b(false);
                }
                this.f61062n0.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setBlockedChat(boolean z11) {
        int i11;
        try {
            this.f61046U.setVisibility(8);
            this.f61047V.setVisibility(0);
            RobotoTextView robotoTextView = this.f61047V;
            if (z11) {
                i11 = AbstractC8020f0.str_hint_block_chat_and_call;
            } else {
                i11 = AbstractC8020f0.str_hint_block_chat;
            }
            robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
            this.f61048W.setVisibility(0);
            this.f61048W.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_func_Unblock));
            this.f61048W.setOnClickListener(new View.OnClickListener() { // from class: m60.d
                public /* synthetic */ ViewOnClickListenerC22914d() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatInputBar.this.m65366C(view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public void setBlockedChatTypeLimitReplyStranger(long j11) {
        boolean z11;
        String m147007e;
        ContactProfile contactProfile;
        try {
            if (C3432a.f14402a.m17234c() && (contactProfile = AbstractC23304d.f113368c0) != null && contactProfile.m40357A0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                m147007e = String.format(C29584h.f136523a.m147006d().m147007e(true), AbstractC23160o0.m119204L0(j11));
            } else {
                m147007e = C29584h.f136523a.m147006d().m147007e(false);
            }
            this.f61046U.setVisibility(8);
            this.f61047V.setVisibility(0);
            this.f61047V.setText(m147007e);
            C29584h c29584h = C29584h.f136523a;
            if (c29584h.m147006d().m147010k(z11)) {
                this.f61048W.setVisibility(0);
                this.f61048W.setText(c29584h.m147006d().m147005c(z11));
                this.f61048W.setOnClickListener(new View.OnClickListener() { // from class: m60.e
                    public /* synthetic */ ViewOnClickListenerC22915e() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatInputBar.this.m65367D(view);
                    }
                });
                return;
            }
            this.f61048W.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f61046U.setVisibility(8);
            this.f61047V.setVisibility(0);
            this.f61047V.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_block_reply_stranger_cannot_chat_non_ba_text));
            this.f61048W.setVisibility(8);
        }
    }

    public void setCanShowBtnPageMenu(boolean z11) {
        ImageButton imageButton;
        if (this.f61061m0 != z11 && (imageButton = this.f61076v) != null) {
            this.f61061m0 = z11;
            if (z11) {
                this.f61058j0.put(0, imageButton);
                this.f61058j0.put(1, this.f61076v);
                this.f61076v.setVisibility(0);
            } else {
                this.f61058j0.remove(0);
                this.f61058j0.remove(1);
                this.f61076v.setVisibility(8);
            }
            m65369I();
        }
    }

    public void setCannotChatTextInChatInput(String str) {
        RobotoTextView robotoTextView = this.f61042Q;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    public void setCannotChatTypeBlockChat(boolean z11) {
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_send_message_to_group_p1)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (z11) {
            i11 = AbstractC8020f0.str_cannot_send_message_to_community_owner_admin_p;
        } else {
            i11 = AbstractC8020f0.str_cannot_send_message_to_group_owner_admin_p;
        }
        spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(i11));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " ");
        if (z11) {
            i12 = AbstractC8020f0.str_cannot_send_message_to_community_p2;
        } else {
            i12 = AbstractC8020f0.str_cannot_send_message_to_group_p2;
        }
        spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(i12)).append((CharSequence) " ");
        spannableStringBuilder.setSpan(new C11740b(), length, length2, 33);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more));
        spannableStringBuilder.setSpan(new C11741c(), length3, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        this.f61042Q.setText(spannableStringBuilder);
        this.f61042Q.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setCannotChatTypeDeletedGroup(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f61042Q;
        if (z11) {
            i11 = AbstractC8020f0.str_cannot_chat_reason_community_deleted;
        } else {
            i11 = AbstractC8020f0.str_cannot_chat_reason_group_deleted;
        }
        robotoTextView.setText(i11);
    }

    public void setCbHQChecked(boolean z11) {
        m65389w();
        PhotoToggleButton photoToggleButton = this.f61038M;
        if (photoToggleButton != null) {
            photoToggleButton.setChecked(z11);
        }
    }

    public void setInputHint(int i11) {
        if (this.f61055g0 != i11) {
            this.f61055g0 = i11;
            setupEditTextState(this.f61053e0);
        }
    }

    public void setInputMode(int i11) {
        int i12 = this.f61053e0;
        if (i11 == i12) {
            return;
        }
        View view = (View) this.f61058j0.get(i12);
        View view2 = (View) this.f61059k0.get(this.f61053e0);
        ValueAnimator valueAnimator = this.f61077v0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f61077v0.cancel();
            for (int i13 = 0; i13 < 2; i13++) {
                View view3 = this.f61075u0[i13];
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                    this.f61075u0[i13].setScaleX(1.0f);
                    this.f61075u0[i13].setScaleY(1.0f);
                }
                View view4 = this.f61073t0[i13];
                if (view4 != null) {
                    view4.setAlpha(1.0f);
                    this.f61073t0[i13].setScaleX(1.0f);
                    this.f61073t0[i13].setScaleY(1.0f);
                    this.f61073t0[i13].setVisibility(8);
                }
            }
        }
        this.f61053e0 = i11;
        View view5 = (View) this.f61058j0.get(i11);
        View view6 = (View) this.f61059k0.get(this.f61053e0);
        setupEditTextState(this.f61053e0);
        m65369I();
        if (view != view5) {
            this.f61073t0[0] = view;
            this.f61075u0[0] = view5;
        } else {
            this.f61073t0[0] = null;
            this.f61075u0[0] = null;
        }
        if (view2 != view6) {
            this.f61073t0[1] = view2;
            this.f61075u0[1] = view6;
        } else {
            this.f61073t0[1] = null;
            this.f61075u0[1] = null;
        }
        InterfaceC11745g interfaceC11745g = this.f61060l0;
        if (interfaceC11745g != null) {
            interfaceC11745g.mo64318j(this.f61052d0, this.f61053e0, true);
        }
        m65381h();
    }

    public void setLockInputBar(boolean z11) {
        this.f61063o0 = z11;
    }

    public void setOnChatInputActionListener(InterfaceC11745g interfaceC11745g) {
        this.f61060l0 = interfaceC11745g;
    }

    public void setOnScaleMessageListener(SendMessageDialog.InterfaceC7996a interfaceC7996a) {
        this.f61027B0 = interfaceC7996a;
    }

    /* renamed from: x */
    boolean m65408x() {
        try {
            RedDotImageButton redDotImageButton = this.f61024A;
            if (redDotImageButton == null || redDotImageButton.getVisibility() != 0 || this.f61024A.getParent() == null) {
                return false;
            }
            if (((View) this.f61024A.getParent()).getVisibility() != 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
