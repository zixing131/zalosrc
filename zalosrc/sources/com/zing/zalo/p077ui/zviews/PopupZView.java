package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.layout.AspectRatioRelativeLayout;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p140ev.C18613b;
import p170fv.C19151e;
import p348mi.AbstractC23304d;
import p542ub.InterfaceC27218a;
import p716zh.C31877d;
import p716zh.C32206z9;
import pm0.C24848g0;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class PopupZView extends WebBaseView implements ZaloView.InterfaceC17421f {
    public static final C14764a Companion = new C14764a(null);

    /* renamed from: d2 */
    private static final String f76025d2 = PopupZView.class.getSimpleName();

    /* renamed from: S1 */
    private int f76026S1;

    /* renamed from: T1 */
    private View f76027T1;

    /* renamed from: U1 */
    private View f76028U1;

    /* renamed from: V1 */
    private RobotoTextView f76029V1;

    /* renamed from: W1 */
    private RobotoTextView f76030W1;

    /* renamed from: X1 */
    private AspectRatioRelativeLayout f76031X1;

    /* renamed from: Y1 */
    private RobotoTextView f76032Y1;

    /* renamed from: Z1 */
    private ImageView f76033Z1;

    /* renamed from: a2 */
    private C32206z9 f76034a2;

    /* renamed from: b2 */
    private String f76035b2;

    /* renamed from: c2 */
    private short f76036c2;

    /* renamed from: com.zing.zalo.ui.zviews.PopupZView$a */
    /* loaded from: classes6.dex */
    public static final class C14764a {
        private C14764a() {
        }

        public /* synthetic */ C14764a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Intent m82783a(Context context, int i11, String str, C18613b c18613b) {
            try {
                Intent intent = new Intent(context, (Class<?>) PopupZView.class);
                intent.putExtra("popup_type", i11);
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", str);
                if (c18613b != null) {
                    bundle.putSerializable("EXTRA_FEATURE_ID", c18613b);
                }
                intent.putExtras(bundle);
                return intent;
            } catch (Exception e11) {
                AbstractC23350e.m122775e(m82784b(), "", e11);
                return null;
            }
        }

        /* renamed from: b */
        public final String m82784b() {
            return PopupZView.f76025d2;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PopupZView$b */
    /* loaded from: classes6.dex */
    public static final class C14765b extends ViewOutlineProvider {
        C14765b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC23136l9.m118742r(10.0f));
        }
    }

    /* renamed from: lR */
    public static final Intent m82773lR(Context context, int i11, String str, C18613b c18613b) {
        return Companion.m82783a(context, i11, str, c18613b);
    }

    /* renamed from: mR */
    private final void m82774mR() {
        C32206z9 c32206z9 = this.f76034a2;
        if (c32206z9 != null) {
            String str = c32206z9.f148572r;
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            String str2 = c32206z9.f148573s;
            C31877d c31877d = new C31877d();
            c31877d.m153186e(this.f76035b2);
            c31877d.f146419e = false;
            c31877d.m153187f(new TrackingSource(this.f76036c2));
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC28207v1.m141994i3(str, 2, m92676n2, null, str2, c31877d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pR */
    public static final void m82775pR(PopupZView popupZView, View view) {
        AbstractC19074t.m100208f(popupZView, "this$0");
        popupZView.f72421L0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qR */
    public static final void m82776qR(C32206z9 c32206z9, PopupZView popupZView, View view) {
        AbstractC19074t.m100208f(c32206z9, "$this_run");
        AbstractC19074t.m100208f(popupZView, "this$0");
        try {
            int i11 = c32206z9.f148568n;
            if (i11 != 1) {
                if (i11 == 2) {
                    double d11 = c32206z9.f148569o;
                    if (d11 > 0.0d) {
                        RobotoTextView robotoTextView = popupZView.f76032Y1;
                        if (robotoTextView != null) {
                            robotoTextView.postDelayed(popupZView.f88750Q, (long) (d11 * 60 * 1000));
                        }
                    } else {
                        popupZView.f72421L0.finish();
                    }
                }
            } else {
                popupZView.f72421L0.finish();
            }
            popupZView.m82774mR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tR */
    public static final void m82777tR(PopupZView popupZView, View view) {
        AbstractC19074t.m100208f(popupZView, "this$0");
        if (popupZView.f76026S1 == 1) {
            popupZView.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AspectRatioRelativeLayout aspectRatioRelativeLayout;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.popup_zview, viewGroup, false);
        this.f76028U1 = inflate;
        if (inflate != null) {
            aspectRatioRelativeLayout = (AspectRatioRelativeLayout) inflate.findViewById(AbstractC6918a0.webview_container);
        } else {
            aspectRatioRelativeLayout = null;
        }
        this.f76031X1 = aspectRatioRelativeLayout;
        View mo37483GJ = super.mo37483GJ(layoutInflater, aspectRatioRelativeLayout, bundle);
        AspectRatioRelativeLayout aspectRatioRelativeLayout2 = this.f76031X1;
        if (aspectRatioRelativeLayout2 != null) {
            aspectRatioRelativeLayout2.addView(mo37483GJ, -1, -1);
        }
        AspectRatioRelativeLayout aspectRatioRelativeLayout3 = this.f76031X1;
        if (aspectRatioRelativeLayout3 != null) {
            aspectRatioRelativeLayout3.setOutlineProvider(new C14765b());
        }
        AspectRatioRelativeLayout aspectRatioRelativeLayout4 = this.f76031X1;
        if (aspectRatioRelativeLayout4 != null) {
            aspectRatioRelativeLayout4.setClipToOutline(true);
        }
        m86747WN(new C19151e());
        return this.f76028U1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: UO */
    public void mo81382UO(int i11, String str, String str2) {
        super.mo81382UO(i11, str, str2);
        if (this.f76026S1 == 0) {
            m82782uR();
        }
    }

    /* renamed from: nR */
    public final void m82778nR() {
        C32206z9 c32206z9;
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("popup_type")) {
                    this.f76026S1 = m92642L3.getInt("popup_type");
                }
                if (m92642L3.containsKey("popup_info")) {
                    c32206z9 = new C32206z9(new JSONObject(m92642L3.getString("popup_info", "")));
                } else {
                    c32206z9 = AbstractC23304d.f113412m2;
                }
                this.f76034a2 = c32206z9;
                this.f76035b2 = m92642L3.getString("suggest_id", "");
                this.f76036c2 = m92642L3.getShort("create_source", (short) 1);
                return;
            }
            throw new IllegalArgumentException("Null intent".toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            this.f72421L0.finish();
        }
    }

    /* renamed from: oR */
    public final void m82779oR() {
        String str;
        ImageView imageView;
        try {
            ImageView imageView2 = this.f76033Z1;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.w50
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopupZView.m82775pR(PopupZView.this, view);
                    }
                });
            }
            int i11 = this.f76026S1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    RobotoTextView robotoTextView = this.f76032Y1;
                    if (robotoTextView != null) {
                        robotoTextView.setText(AbstractC8020f0.popup_whatsnew_negative_btn_caption);
                    }
                    ImageView imageView3 = this.f76033Z1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            final C32206z9 c32206z9 = this.f76034a2;
            if (c32206z9 != null) {
                if (!c32206z9.f148576v && (imageView = this.f76033Z1) != null) {
                    imageView.setVisibility(8);
                }
                if (c32206z9.f148568n != -1 && (str = c32206z9.f148571q) != null && str.length() != 0) {
                    RobotoTextView robotoTextView2 = this.f76032Y1;
                    if (robotoTextView2 != null) {
                        robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.x50
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PopupZView.m82776qR(C32206z9.this, this, view);
                            }
                        });
                    }
                    RobotoTextView robotoTextView3 = this.f76032Y1;
                    if (robotoTextView3 != null) {
                        String str2 = c32206z9.f148571q;
                        AbstractC19074t.m100207e(str2, "btnCap");
                        Locale locale = Locale.getDefault();
                        AbstractC19074t.m100207e(locale, "getDefault(...)");
                        String upperCase = str2.toUpperCase(locale);
                        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                        robotoTextView3.setText(upperCase);
                        return;
                    }
                    return;
                }
                RobotoTextView robotoTextView4 = this.f76032Y1;
                if (robotoTextView4 != null) {
                    robotoTextView4.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f76026S1 == 0) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: rR */
    public final void m82780rR() {
        String str;
        try {
            RobotoTextView robotoTextView = this.f76029V1;
            if (robotoTextView != null) {
                int i11 = this.f76026S1;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return;
                        }
                    } else {
                        robotoTextView.setText(AbstractC8020f0.popup_whatsnew_title);
                        return;
                    }
                }
                C32206z9 c32206z9 = this.f76034a2;
                if (c32206z9 != null) {
                    str = c32206z9.f148557c;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    robotoTextView.setText(str);
                    return;
                }
                robotoTextView.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sR */
    public final void m82781sR() {
        View view;
        View view2;
        RobotoTextView robotoTextView;
        RobotoTextView robotoTextView2;
        RobotoTextView robotoTextView3;
        ImageView imageView;
        ZaloSystemWebView zaloSystemWebView;
        try {
            View view3 = this.f76028U1;
            if (view3 != null) {
                view = view3.findViewById(AbstractC6918a0.toolbar_container);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            View view4 = this.f76028U1;
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.v50
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        PopupZView.m82777tR(PopupZView.this, view5);
                    }
                });
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ != null) {
                view2 = m92656bJ.findViewById(AbstractC6918a0.popup_mainview);
            } else {
                view2 = null;
            }
            this.f76027T1 = view2;
            View m92656bJ2 = this.f72421L0.m92656bJ();
            if (m92656bJ2 != null) {
                robotoTextView = (RobotoTextView) m92656bJ2.findViewById(AbstractC6918a0.popup_title);
            } else {
                robotoTextView = null;
            }
            this.f76029V1 = robotoTextView;
            View m92656bJ3 = this.f72421L0.m92656bJ();
            if (m92656bJ3 != null) {
                robotoTextView2 = (RobotoTextView) m92656bJ3.findViewById(AbstractC6918a0.popup_fallback_message);
            } else {
                robotoTextView2 = null;
            }
            this.f76030W1 = robotoTextView2;
            View m92656bJ4 = this.f72421L0.m92656bJ();
            if (m92656bJ4 != null) {
                robotoTextView3 = (RobotoTextView) m92656bJ4.findViewById(AbstractC6918a0.positiveBtn);
            } else {
                robotoTextView3 = null;
            }
            this.f76032Y1 = robotoTextView3;
            View m92656bJ5 = this.f72421L0.m92656bJ();
            if (m92656bJ5 != null) {
                imageView = (ImageView) m92656bJ5.findViewById(AbstractC6918a0.close_btn);
            } else {
                imageView = null;
            }
            this.f76033Z1 = imageView;
            try {
                zaloSystemWebView = m86727GO();
            } catch (Exception e11) {
                e11.printStackTrace();
                zaloSystemWebView = null;
            }
            if (zaloSystemWebView != null) {
                try {
                    zaloSystemWebView.setVerticalScrollBarEnabled(true);
                    zaloSystemWebView.setScrollbarFadingEnabled(false);
                    zaloSystemWebView.setScrollBarFadeDuration(Integer.MAX_VALUE);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            if (zaloSystemWebView != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        zaloSystemWebView.setVerticalScrollbarThumbDrawable(AbstractC23136l9.m118665N(m92689tK(), AbstractC16803z.webview_scrollbar));
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } else {
                        Field declaredField = View.class.getDeclaredField("mScrollCache");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(zaloSystemWebView);
                        Field declaredField2 = obj.getClass().getDeclaredField("scrollBar");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        Method declaredMethod = obj2.getClass().getDeclaredMethod("setVerticalThumbDrawable", Drawable.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(obj2, AbstractC23136l9.m118665N(m92689tK(), AbstractC16803z.webview_scrollbar));
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
            }
            if (!C23055e5.m118273h(false, 1, null) && this.f76026S1 == 0) {
                m82782uR();
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: uR */
    public final void m82782uR() {
        ViewGroup.LayoutParams layoutParams;
        String str;
        RobotoTextView robotoTextView;
        try {
            AspectRatioRelativeLayout aspectRatioRelativeLayout = this.f76031X1;
            if (aspectRatioRelativeLayout != null) {
                aspectRatioRelativeLayout.setVisibility(8);
            }
            C32206z9 c32206z9 = this.f76034a2;
            if (c32206z9 != null && (str = c32206z9.f148577w) != null && (robotoTextView = this.f76030W1) != null) {
                robotoTextView.setText(str);
            }
            RobotoTextView robotoTextView2 = this.f76030W1;
            if (robotoTextView2 != null) {
                robotoTextView2.setVisibility(0);
            }
            RobotoTextView robotoTextView3 = this.f76029V1;
            if (robotoTextView3 != null) {
                robotoTextView3.setVisibility(8);
            }
            View view = this.f76027T1;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            View view2 = this.f76028U1;
            if (view2 != null) {
                view2.requestLayout();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m82778nR();
        m82781sR();
        m82780rR();
        m82779oR();
    }
}
