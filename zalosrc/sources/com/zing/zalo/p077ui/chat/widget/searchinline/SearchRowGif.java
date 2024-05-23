package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p485rj.C25810b;
import p611wj.C29055c;
import p716zh.C31902e9;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class SearchRowGif extends SearchRow implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: L */
    public static final int f61403L = AbstractC23136l9.m118742r(63.0f);

    /* renamed from: M */
    public static final int f61404M = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: D */
    private C31902e9 f61405D;

    /* renamed from: E */
    private int f61406E;

    /* renamed from: F */
    private InterfaceC11805a f61407F;

    /* renamed from: G */
    private final Rect f61408G;

    /* renamed from: H */
    private final ZSimpleGIFView f61409H;

    /* renamed from: I */
    private int f61410I;

    /* renamed from: J */
    private int f61411J;

    /* renamed from: K */
    private Size f61412K;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowGif$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11805a {
        /* renamed from: a */
        void mo65629a(View view, C31902e9 c31902e9);

        /* renamed from: b */
        boolean mo65630b();

        /* renamed from: c */
        void mo65631c(C31902e9 c31902e9);

        /* renamed from: d */
        void mo65632d(View view, C31902e9 c31902e9);

        /* renamed from: e */
        void mo65633e(C31902e9 c31902e9);
    }

    public SearchRowGif(Context context, Rect rect, int i11, int i12) {
        super(context);
        this.f61410I = f61403L;
        this.f61411J = 2;
        this.f61412K = new Size(1, 1);
        setWillNotDraw(false);
        this.f61410I = i12;
        this.f61411J = i11;
        if (rect == null) {
            this.f61408G = new Rect(0, 0, 0, 0);
        } else {
            this.f61408G = rect;
        }
        ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(getContext());
        this.f61409H = zSimpleGIFView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Rect rect2 = this.f61408G;
        layoutParams.setMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
        addView(zSimpleGIFView, layoutParams);
        zSimpleGIFView.setBackground(C23212s8.m119609q(getContext(), AbstractC16781w.ChatPhotoDefaultColor));
        zSimpleGIFView.setVisibility(0);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setOnTouchListener(this);
    }

    /* renamed from: l */
    private boolean m65627l() {
        InterfaceC11805a interfaceC11805a = this.f61407F;
        if (interfaceC11805a != null && !interfaceC11805a.mo65630b()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        m65628m(this.f61405D, this.f61406E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: h */
    public void mo65616h() {
        super.mo65616h();
        InterfaceC11805a interfaceC11805a = this.f61407F;
        if (interfaceC11805a != null) {
            interfaceC11805a.mo65632d(this, this.f61405D);
        }
    }

    /* renamed from: m */
    public void m65628m(C31902e9 c31902e9, int i11) {
        String str;
        String str2;
        int i12;
        int i13;
        String str3;
        int i14;
        int i15;
        this.f61405D = c31902e9;
        this.f61406E = i11;
        C29055c m153311c = c31902e9.m153311c();
        if (this.f61405D == null || m153311c == null) {
            str = "";
            str2 = str;
            i12 = 0;
            i13 = 0;
        } else {
            C25810b m145111e = m153311c.m145111e();
            if (m145111e == null) {
                str3 = "";
                i14 = 0;
                i15 = 0;
            } else {
                str3 = m145111e.f123105a;
                i15 = m145111e.f123106b;
                i14 = m145111e.f123107c;
            }
            C25810b m145110d = m153311c.m145110d();
            if (m145110d != null) {
                String str4 = m145110d.f123105a;
                int i16 = m145110d.f123106b;
                i13 = m145110d.f123107c;
                i12 = i16;
                str = str4;
                str2 = str3;
            } else {
                i13 = i14;
                str = "";
                str2 = str3;
                i12 = i15;
            }
        }
        this.f61412K = ZSimpleGIFView.m88218c(i12, i13, this.f61411J, this.f61410I);
        this.f61409H.m88227l(new ZSimpleGIFView.C16554f(str, str2, i12, i13, "SearchRowGif"), this.f61406E, null);
        this.f61409H.setScrolling(m65627l());
        this.f61409H.m88224g(120L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11805a interfaceC11805a = this.f61407F;
        if (interfaceC11805a != null) {
            interfaceC11805a.mo65629a(view, this.f61405D);
        }
        m65618j();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        InterfaceC11805a interfaceC11805a = this.f61407F;
        if (interfaceC11805a != null) {
            interfaceC11805a.mo65632d(view, this.f61405D);
            return true;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int width = this.f61412K.getWidth();
        Rect rect = this.f61408G;
        int i13 = width + rect.left + rect.right;
        int height = this.f61412K.getHeight();
        Rect rect2 = this.f61408G;
        setMeasuredDimension(i13, height + rect2.top + rect2.bottom);
        if (getChildCount() > 0) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    if (childAt == this.f61409H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f61412K.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f61412K.getHeight(), 1073741824));
                    } else {
                        childAt.measure(i11, i12);
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC11805a interfaceC11805a;
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (interfaceC11805a = this.f61407F) != null) {
                interfaceC11805a.mo65631c(this.f61405D);
                return false;
            }
            return false;
        }
        InterfaceC11805a interfaceC11805a2 = this.f61407F;
        if (interfaceC11805a2 != null) {
            interfaceC11805a2.mo65633e(this.f61405D);
            return false;
        }
        return false;
    }

    public void setListener(InterfaceC11805a interfaceC11805a) {
        this.f61407F = interfaceC11805a;
    }
}
