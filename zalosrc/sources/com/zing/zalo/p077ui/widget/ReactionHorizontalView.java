package com.zing.zalo.p077ui.widget;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2809c;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i40.AbstractC20276f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l30.AbstractC22047r0;
import l30.C22037m0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import o30.C24008a;
import p361nb.C23648e;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ReactionHorizontalView extends HorizontalScrollView {

    /* renamed from: p */
    private RobotoTextView f69504p;

    /* renamed from: q */
    private LinearLayout f69505q;

    /* renamed from: r */
    private InterfaceC13520c f69506r;

    /* renamed from: s */
    private InterfaceC13519b f69507s;

    /* renamed from: t */
    private int f69508t;

    /* renamed from: u */
    private final Map f69509u;

    /* renamed from: v */
    private final Map f69510v;

    /* renamed from: w */
    private int f69511w;

    /* renamed from: x */
    private float f69512x;

    /* renamed from: y */
    private final int f69513y;

    /* renamed from: z */
    private boolean f69514z;
    public static final C13518a Companion = new C13518a(null);

    /* renamed from: A */
    private static final int f69501A = AbstractC23222t7.f112534M;

    /* renamed from: B */
    private static final int f69502B = AbstractC23222t7.f112562h;

    /* renamed from: C */
    private static final int f69503C = AbstractC23222t7.f112566j;

    /* renamed from: com.zing.zalo.ui.widget.ReactionHorizontalView$a */
    /* loaded from: classes6.dex */
    public static final class C13518a {
        private C13518a() {
        }

        public /* synthetic */ C13518a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ReactionHorizontalView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13519b {
        /* renamed from: a */
        boolean mo75843a(int i11, int i12, int i13, String str, String str2);
    }

    /* renamed from: com.zing.zalo.ui.widget.ReactionHorizontalView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13520c {
        /* renamed from: a */
        void mo75844a();

        /* renamed from: b */
        void mo75845b();
    }

    public ReactionHorizontalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69509u = new LinkedHashMap();
        this.f69510v = new LinkedHashMap();
        this.f69513y = ViewConfiguration.get(MainApplication.Companion.m35500c()).getScaledTouchSlop();
        m75838d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* renamed from: d */
    private final void m75838d() {
        List arrayList;
        int i11;
        int i12;
        C22037m0 c22037m0 = C22037m0.f108553a;
        if (c22037m0.m115034h()) {
            arrayList = c22037m0.m115038l();
        } else {
            arrayList = new ArrayList();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int i13 = f69503C;
        ?? r7 = 1;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() < 4) {
                i11 = ((f69501A + i13) * arrayList.size()) + i13;
            } else {
                int i14 = f69501A;
                i11 = ((int) (i14 / 2.0f)) + ((i14 + i13) * 3) + i13;
            }
        } else {
            i11 = i13;
        }
        int m118722k0 = (AbstractC23136l9.m118722k0() - i11) - i13;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setBackgroundResource(AbstractC16803z.bg_story_message);
        robotoTextView.setMaxLines(1);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setGravity(16);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139659b(context2, AbstractC23322a.zds_ic_chat_solid_24, AbstractC16801x.white), (Drawable) null, (Drawable) null, (Drawable) null);
        robotoTextView.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
        robotoTextView.setPadding(AbstractC23222t7.f112576o, 0, AbstractC23222t7.f112556e, 0);
        robotoTextView.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
        robotoTextView.setTextSize(0, AbstractC23136l9.m118659K(AbstractC2809c.f500));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m118722k0, f69501A);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = i13;
        if (arrayList.isEmpty()) {
            layoutParams.rightMargin = i13;
        }
        linearLayout.addView(robotoTextView, layoutParams);
        this.f69504p = robotoTextView;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        this.f69505q = linearLayout2;
        int size = arrayList.size();
        final int i15 = 0;
        while (i15 < size) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(r7);
            linearLayout3.setGravity(r7);
            final String m125880a = ((C24008a) arrayList.get(i15)).m125880a();
            final String m125881b = ((C24008a) arrayList.get(i15)).m125881b();
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
            int i16 = AbstractC23222t7.f112552c;
            zAppCompatImageView.setPadding(i16, i16, i16, i16);
            zAppCompatImageView.setCropToPadding(r7);
            zAppCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            zAppCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.l1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReactionHorizontalView.m75839e(ReactionHorizontalView.this, i15, m125880a, m125881b, view);
                }
            });
            zAppCompatImageView.setTag(m125880a);
            AbstractC22047r0.m115047e(zAppCompatImageView, m125880a, 36);
            Map map = this.f69509u;
            int i17 = f69503C;
            int i18 = f69501A;
            map.put(m125880a, Integer.valueOf(i17 + m118722k0 + ((i18 + i17) * i15) + i17));
            linearLayout3.addView(zAppCompatImageView, new LinearLayout.LayoutParams(i18, i18));
            View view = new View(getContext());
            view.setBackgroundResource(AbstractC16803z.dot_gray_story_reaction);
            view.setVisibility(4);
            this.f69510v.put(m125880a, view);
            int i19 = f69502B;
            linearLayout3.addView(view, new LinearLayout.LayoutParams(i19, i19));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = i17;
            if (i15 == arrayList.size() - 1) {
                layoutParams2.rightMargin = i17;
            }
            linearLayout2.addView(linearLayout3, layoutParams2);
            i15++;
            r7 = 1;
        }
        if (linearLayout2.getChildCount() > 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        linearLayout.addView(linearLayout2, new ViewGroup.LayoutParams(-2, -2));
        setFillViewport(true);
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        post(new Runnable() { // from class: com.zing.zalo.ui.widget.m1
            @Override // java.lang.Runnable
            public final void run() {
                ReactionHorizontalView.m75840f(ReactionHorizontalView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m75839e(ReactionHorizontalView reactionHorizontalView, int i11, String str, String str2, View view) {
        Boolean bool;
        int i12;
        AbstractC19074t.m100208f(reactionHorizontalView, "this$0");
        AbstractC19074t.m100208f(str, "$emoId");
        AbstractC19074t.m100208f(str2, "$emoText");
        int[] iArr = new int[2];
        reactionHorizontalView.getLocationOnScreen(iArr);
        reactionHorizontalView.f69508t = iArr[1];
        InterfaceC13519b interfaceC13519b = reactionHorizontalView.f69507s;
        if (interfaceC13519b != null) {
            Integer num = (Integer) reactionHorizontalView.f69509u.get(str);
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 0;
            }
            bool = Boolean.valueOf(interfaceC13519b.mo75843a(i11, i12 - reactionHorizontalView.getScrollX(), reactionHorizontalView.f69508t, str, str2));
        } else {
            bool = null;
        }
        if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            reactionHorizontalView.m75842g(str);
        }
        AbstractC20276f.m105891d(view, 0.7f, 50L, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m75840f(ReactionHorizontalView reactionHorizontalView) {
        AbstractC19074t.m100208f(reactionHorizontalView, "this$0");
        ViewGroup.LayoutParams layoutParams = reactionHorizontalView.getLayoutParams();
        layoutParams.height = AbstractC23136l9.m118655I(AbstractC16802y.story_reaction_bar_emoticon_width) + f69502B + AbstractC23136l9.m118655I(AbstractC16802y.story_reaction_bar_bottom_spacing);
        reactionHorizontalView.setLayoutParams(layoutParams);
        reactionHorizontalView.setPadding(0, 0, 0, AbstractC23136l9.m118655I(AbstractC16802y.story_reaction_bar_bottom_spacing));
    }

    /* renamed from: c */
    public final boolean m75841c() {
        return !this.f69509u.isEmpty();
    }

    /* renamed from: g */
    public final void m75842g(String str) {
        AbstractC19074t.m100208f(str, "emoId");
        Iterator it = this.f69510v.values().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        View view = (View) this.f69510v.get(str);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final View getReactionBar() {
        return this.f69505q;
    }

    public final Rect getReactionBarTipRect() {
        int i11;
        int i12 = -AbstractC23222t7.f112552c;
        int m118722k0 = AbstractC23136l9.m118722k0();
        Integer num = (Integer) this.f69509u.get(C22037m0.f108553a.m115035i());
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        return new Rect(0, i12, (m118722k0 - i11) - AbstractC23222t7.f112566j, f69501A + i12 + AbstractC23222t7.f112552c);
    }

    public final InterfaceC13519b getReactionClickListener() {
        return this.f69507s;
    }

    public final InterfaceC13520c getTouchEventListener() {
        return this.f69506r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:            if (r0 != 3) goto L26;     */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getPointerCount() > 1) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (Math.abs(motionEvent.getX() - this.f69512x) > this.f69513y) {
                            this.f69514z = true;
                        }
                    }
                }
                if (this.f69514z) {
                    InterfaceC13520c interfaceC13520c = this.f69506r;
                    if (interfaceC13520c != null) {
                        interfaceC13520c.mo75845b();
                    }
                    C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 1, "story_reaction_scroll_reaction_bar", new String[0]), false);
                }
            } else {
                this.f69511w = motionEvent.getPointerId(0);
                this.f69512x = motionEvent.getX();
                this.f69514z = false;
                InterfaceC13520c interfaceC13520c2 = this.f69506r;
                if (interfaceC13520c2 != null) {
                    interfaceC13520c2.mo75844a();
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 6) goto L28;     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                        }
                    } else if (Math.abs(motionEvent.getX() - this.f69512x) > this.f69513y) {
                        this.f69514z = true;
                    }
                }
                if (this.f69514z && motionEvent.getPointerId(0) == this.f69511w) {
                    InterfaceC13520c interfaceC13520c = this.f69506r;
                    if (interfaceC13520c != null) {
                        interfaceC13520c.mo75845b();
                    }
                    C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 1, "story_reaction_scroll_reaction_bar", new String[0]), false);
                }
            } else {
                this.f69511w = motionEvent.getPointerId(0);
                this.f69512x = motionEvent.getX();
                this.f69514z = false;
                InterfaceC13520c interfaceC13520c2 = this.f69506r;
                if (interfaceC13520c2 != null) {
                    interfaceC13520c2.mo75844a();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setHintTextClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "listener");
        RobotoTextView robotoTextView = this.f69504p;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public final void setHintTextMessage(String str) {
        RobotoTextView robotoTextView = this.f69504p;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    public final void setReactionClickListener(InterfaceC13519b interfaceC13519b) {
        this.f69507s = interfaceC13519b;
    }

    public final void setTouchEventListener(InterfaceC13520c interfaceC13520c) {
        this.f69506r = interfaceC13520c;
    }
}
