package yc0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yc0.h */
/* loaded from: classes4.dex */
public abstract class AbstractC30905h extends AbstractC30903f implements PopupWindow.OnDismissListener {

    /* renamed from: A */
    protected a f142519A;

    /* renamed from: B */
    protected b f142520B;

    /* renamed from: C */
    protected List f142521C;

    /* renamed from: D */
    protected boolean f142522D;

    /* renamed from: E */
    protected int f142523E;

    /* renamed from: F */
    protected int f142524F;

    /* renamed from: G */
    protected int f142525G;

    /* renamed from: H */
    protected int f142526H;

    /* renamed from: I */
    protected int f142527I;

    /* renamed from: J */
    protected int f142528J;

    /* renamed from: u */
    protected View f142529u;

    /* renamed from: v */
    private ImageView f142530v;

    /* renamed from: w */
    private ImageView f142531w;

    /* renamed from: x */
    protected LayoutInflater f142532x;

    /* renamed from: y */
    protected ViewGroup f142533y;

    /* renamed from: z */
    protected ScrollView f142534z;

    /* renamed from: yc0.h$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo117630a(AbstractC30905h abstractC30905h, int i11, String str);
    }

    /* renamed from: yc0.h$b */
    /* loaded from: classes4.dex */
    public interface b {
        void onDismiss();
    }

    public AbstractC30905h(Context context) {
        this(context, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m150146o(int i11, String str, View view) {
        a aVar = this.f142519A;
        if (aVar != null) {
            aVar.mo117630a(this, i11, str);
        }
        if (!m150148j(i11).m150128d()) {
            this.f142522D = true;
            m150140b();
        }
    }

    /* renamed from: i */
    public void m150147i(C30898a c30898a) {
        View inflate;
        View findViewById;
        this.f142521C.add(c30898a);
        String m150127c = c30898a.m150127c();
        Drawable m150126b = c30898a.m150126b();
        if (this.f142526H == 0) {
            inflate = this.f142532x.inflate(AbstractC7409c0.action_item_horizontal, (ViewGroup) null);
            findViewById = null;
        } else {
            inflate = this.f142532x.inflate(AbstractC7409c0.action_item_vertical, (ViewGroup) null);
            findViewById = inflate.findViewById(AbstractC6918a0.action_item_vertical_divider);
        }
        ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.iv_icon);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
        int i11 = 8;
        if (m150126b != null) {
            imageView.setImageDrawable(m150126b);
        } else {
            imageView.setVisibility(8);
        }
        if (m150127c != null) {
            textView.setText(m150127c);
        } else {
            textView.setVisibility(8);
        }
        final int i12 = this.f142523E;
        final String m150125a = c30898a.m150125a();
        inflate.setOnClickListener(new View.OnClickListener() { // from class: yc0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC30905h.this.m150146o(i12, m150125a, view);
            }
        });
        inflate.setFocusable(true);
        inflate.setClickable(true);
        if (this.f142526H == 0) {
            if (this.f142523E != 0) {
                View inflate2 = this.f142532x.inflate(AbstractC7409c0.horiz_separator, (ViewGroup) null);
                inflate2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                this.f142533y.addView(inflate2, this.f142524F);
                this.f142524F++;
            }
        } else if (findViewById != null) {
            if (this.f142523E != 0) {
                i11 = 0;
            }
            findViewById.setVisibility(i11);
        }
        if (this.f142528J > 0) {
            this.f142533y.addView(inflate, this.f142524F, new ViewGroup.LayoutParams(this.f142528J, -2));
        } else {
            this.f142533y.addView(inflate, this.f142524F);
        }
        this.f142523E++;
        this.f142524F++;
    }

    /* renamed from: j */
    public C30898a m150148j(int i11) {
        return (C30898a) this.f142521C.get(i11);
    }

    /* renamed from: k */
    protected int m150149k() {
        return AbstractC7409c0.popup_horizontal;
    }

    /* renamed from: l */
    protected abstract int mo150136l();

    /* renamed from: m */
    public Rect m150150m() {
        int[] iArr = new int[2];
        this.f142533y.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return new Rect(i11, i12, this.f142533y.getMeasuredWidth() + i11, this.f142533y.getMeasuredHeight() + i12);
    }

    /* renamed from: n */
    public boolean m150151n() {
        return this.f142512q.isShowing();
    }

    /* renamed from: p */
    public void m150152p(int i11) {
        this.f142525G = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m150153q(int i11, int i12, boolean z11) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int measuredWidth = i12 - (this.f142530v.getMeasuredWidth() / 2);
        int i21 = this.f142525G;
        if (i21 != 1) {
            if (i21 != 2) {
                if (i21 != 3) {
                    if (i21 != 4) {
                        if (i21 == 5) {
                            int i22 = i11 / 4;
                            if (measuredWidth <= i22) {
                                PopupWindow popupWindow = this.f142512q;
                                if (z11) {
                                    i19 = AbstractC8915g0.Animations_PopUpMenu_Left;
                                } else {
                                    i19 = AbstractC8915g0.Animations_PopDownMenu_Left;
                                }
                                popupWindow.setAnimationStyle(i19);
                                return;
                            }
                            if (measuredWidth > i22 && measuredWidth < i22 * 3) {
                                PopupWindow popupWindow2 = this.f142512q;
                                if (z11) {
                                    i18 = AbstractC8915g0.Animations_PopUpMenu_Center;
                                } else {
                                    i18 = AbstractC8915g0.Animations_PopDownMenu_Center;
                                }
                                popupWindow2.setAnimationStyle(i18);
                                return;
                            }
                            PopupWindow popupWindow3 = this.f142512q;
                            if (z11) {
                                i17 = AbstractC8915g0.Animations_PopUpMenu_Right;
                            } else {
                                i17 = AbstractC8915g0.Animations_PopDownMenu_Right;
                            }
                            popupWindow3.setAnimationStyle(i17);
                            return;
                        }
                        return;
                    }
                    PopupWindow popupWindow4 = this.f142512q;
                    if (z11) {
                        i16 = AbstractC8915g0.Animations_PopUpMenu_Reflect;
                    } else {
                        i16 = AbstractC8915g0.Animations_PopDownMenu_Reflect;
                    }
                    popupWindow4.setAnimationStyle(i16);
                    return;
                }
                PopupWindow popupWindow5 = this.f142512q;
                if (z11) {
                    i15 = AbstractC8915g0.Animations_PopUpMenu_Center;
                } else {
                    i15 = AbstractC8915g0.Animations_PopDownMenu_Center;
                }
                popupWindow5.setAnimationStyle(i15);
                return;
            }
            PopupWindow popupWindow6 = this.f142512q;
            if (z11) {
                i14 = AbstractC8915g0.Animations_PopUpMenu_Right;
            } else {
                i14 = AbstractC8915g0.Animations_PopDownMenu_Right;
            }
            popupWindow6.setAnimationStyle(i14);
            return;
        }
        PopupWindow popupWindow7 = this.f142512q;
        if (z11) {
            i13 = AbstractC8915g0.Animations_PopUpMenu_Left;
        } else {
            i13 = AbstractC8915g0.Animations_PopDownMenu_Left;
        }
        popupWindow7.setAnimationStyle(i13);
    }

    /* renamed from: r */
    public void m150154r(a aVar) {
        this.f142519A = aVar;
    }

    /* renamed from: s */
    public void m150155s(b bVar) {
        m150144g(this);
        this.f142520B = bVar;
    }

    /* renamed from: t */
    public void m150156t(int i11) {
        View inflate = this.f142532x.inflate(i11, (ViewGroup) null);
        this.f142529u = inflate;
        this.f142533y = (ViewGroup) inflate.findViewById(AbstractC6918a0.tracks);
        this.f142531w = (ImageView) this.f142529u.findViewById(AbstractC6918a0.arrow_down);
        this.f142530v = (ImageView) this.f142529u.findViewById(AbstractC6918a0.arrow_up);
        this.f142534z = (ScrollView) this.f142529u.findViewById(AbstractC6918a0.scroller);
        this.f142529u.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        m150143f(this.f142529u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public void m150157u(int i11, int i12) {
        ImageView imageView;
        ImageView imageView2;
        int i13 = AbstractC6918a0.arrow_up;
        if (i11 == i13) {
            imageView = this.f142530v;
        } else {
            imageView = this.f142531w;
        }
        if (i11 == i13) {
            imageView2 = this.f142531w;
        } else {
            imageView2 = this.f142530v;
        }
        int measuredWidth = this.f142530v.getMeasuredWidth();
        imageView.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = i12 - (measuredWidth / 2);
        imageView2.setVisibility(4);
    }

    public AbstractC30905h(Context context, int i11) {
        super(context);
        this.f142521C = new ArrayList();
        this.f142527I = 0;
        this.f142528J = -1;
        this.f142526H = i11;
        this.f142532x = (LayoutInflater) context.getSystemService("layout_inflater");
        if (this.f142526H == 0) {
            m150156t(m150149k());
        } else {
            m150156t(mo150136l());
        }
        this.f142525G = 5;
        this.f142523E = 0;
    }
}
