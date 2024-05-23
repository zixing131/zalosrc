package com.zing.zalo.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.bubbleview.ActionEditText;
import com.zing.zalo.bubbleview.IconBubbleEditText;
import com.zing.zalo.bubbleview.LayoutBubbleView;
import ho0.AbstractC20110a;
import java.util.HashSet;
import java.util.Iterator;
import p712zd.InterfaceC31791d;

/* loaded from: classes3.dex */
public class IconBubbleEditText extends FlowLayout implements View.OnKeyListener, View.OnClickListener {

    /* renamed from: A */
    LayoutInflater f40207A;

    /* renamed from: B */
    public final ActionEditText f40208B;

    /* renamed from: t */
    protected View.OnClickListener f40209t;

    /* renamed from: u */
    protected InterfaceC7395e f40210u;

    /* renamed from: v */
    protected InterfaceC7394d f40211v;

    /* renamed from: w */
    protected InterfaceC7396f f40212w;

    /* renamed from: x */
    protected HashSet f40213x;

    /* renamed from: y */
    private final int f40214y;

    /* renamed from: z */
    CharSequence f40215z;

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$a */
    /* loaded from: classes3.dex */
    class C7391a implements ActionEditText.InterfaceC7390b {
        C7391a() {
        }

        @Override // com.zing.zalo.bubbleview.ActionEditText.InterfaceC7390b
        /* renamed from: a */
        public void mo37523a() {
            if (IconBubbleEditText.this.f40208B.getText().length() == 0 && IconBubbleEditText.this.getChildCount() > 1) {
                IconBubbleEditText.this.m37548r();
            }
        }

        @Override // com.zing.zalo.bubbleview.ActionEditText.InterfaceC7390b
        /* renamed from: b */
        public void mo37524b(ActionEditText actionEditText, String str) {
        }
    }

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$b */
    /* loaded from: classes3.dex */
    class C7392b implements LayoutBubbleView.InterfaceC7397a {
        C7392b() {
        }

        @Override // com.zing.zalo.bubbleview.LayoutBubbleView.InterfaceC7397a
        /* renamed from: a */
        public void mo37551a(View view) {
            IconBubbleEditText.this.m37550u(view);
            IconBubbleEditText.this.f40208B.setCursorVisible(false);
        }

        @Override // com.zing.zalo.bubbleview.LayoutBubbleView.InterfaceC7397a
        /* renamed from: b */
        public void mo37552b(View view) {
            IconBubbleEditText.this.m37547q(view.getTag());
        }

        @Override // com.zing.zalo.bubbleview.LayoutBubbleView.InterfaceC7397a
        public void onClick(View view) {
            IconBubbleEditText.this.m37545n(view.getTag());
        }
    }

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7393c {
        /* renamed from: a */
        void mo37527a(Object obj);
    }

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7394d {
        /* renamed from: a */
        void mo37553a(Object obj);
    }

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC7395e {
        /* renamed from: a */
        void mo37554a(Object obj);
    }

    /* renamed from: com.zing.zalo.bubbleview.IconBubbleEditText$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC7396f {
        /* renamed from: a */
        void mo37555a(int i11);
    }

    public IconBubbleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40213x = new HashSet();
        this.f40207A = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.IconBubbleEditText);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(AbstractC8923h0.IconBubbleEditText_editTextLayout, -1);
            this.f40214y = obtainStyledAttributes.getResourceId(AbstractC8923h0.IconBubbleEditText_bubbleLayoutView, -1);
            if (resourceId != -1) {
                this.f40208B = (ActionEditText) this.f40207A.inflate(resourceId, (ViewGroup) null);
            } else {
                this.f40208B = new ActionEditText(context);
            }
            this.f40208B.setCursorVisible(true);
            if (this.f40208B.getVisibility() == 0) {
                this.f40208B.setMinimumWidth(50);
            } else if (this.f40208B.getVisibility() == 4) {
                this.f40208B.setMinimumWidth(10);
            }
            obtainStyledAttributes.recycle();
            this.f40208B.setOnKeyListener(this);
            this.f40208B.setmOnImeBack(new C7391a());
            addView(this.f40208B);
            this.f40208B.setOnClickListener(this);
            setOnClickListener(this);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: k */
    private int m37539k(Object obj) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (obj.equals(getChildAt(i11).getTag())) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m37540m(View view) {
        m37547q(view.getTag());
    }

    public int getBubblesCount() {
        return getChildCount() - 1;
    }

    public ActionEditText getEditText() {
        return this.f40208B;
    }

    /* renamed from: h */
    public LinearLayout m37541h(Object obj) {
        if (!(obj instanceof InterfaceC31791d) || m37544l(obj)) {
            return null;
        }
        LayoutBubbleView layoutBubbleView = (LayoutBubbleView) m37542i(obj);
        layoutBubbleView.setTag(obj);
        m37550u(null);
        layoutBubbleView.setOnDeleteListener(new C7392b());
        return layoutBubbleView;
    }

    /* renamed from: i */
    public LinearLayout m37542i(Object obj) {
        LinearLayout linearLayout;
        int i11 = this.f40214y;
        if (i11 != -1) {
            linearLayout = (LinearLayout) this.f40207A.inflate(i11, (ViewGroup) null);
        } else {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: zd.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IconBubbleEditText.this.m37540m(view);
                }
            });
        }
        ((InterfaceC31791d) obj).mo152811a(linearLayout);
        linearLayout.setTag(obj);
        addView(linearLayout, getChildCount() - 1);
        if (!TextUtils.isEmpty(this.f40208B.getText())) {
            this.f40208B.setText("");
        }
        if (this.f40215z == null) {
            this.f40215z = this.f40208B.getHint();
        }
        Iterator it = this.f40213x.iterator();
        while (it.hasNext()) {
            ((InterfaceC7393c) it.next()).mo37527a(linearLayout);
        }
        return linearLayout;
    }

    /* renamed from: j */
    public void m37543j(InterfaceC7393c interfaceC7393c) {
        this.f40213x.add(interfaceC7393c);
    }

    /* renamed from: l */
    public boolean m37544l(Object obj) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getTag() != null && getChildAt(i11).getTag().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void m37545n(Object obj) {
        Object tag;
        InterfaceC7394d interfaceC7394d;
        int m37539k = m37539k(obj);
        if (m37539k >= 0 && m37539k <= getChildCount() - 1 && getChildAt(m37539k) != this.f40208B && (tag = getChildAt(m37539k).getTag()) != null && (interfaceC7394d = this.f40211v) != null) {
            interfaceC7394d.mo37553a(tag);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m37546p();
        this.f40208B.requestFocus();
        this.f40208B.setCursorVisible(true);
        ActionEditText actionEditText = this.f40208B;
        actionEditText.setSelection(actionEditText.getText().toString().length());
        AbstractC2379w.m12433g(this.f40208B, 2);
        View.OnClickListener onClickListener = this.f40209t;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (view.equals(this.f40208B) && keyEvent.getAction() == 1 && i11 == 67 && this.f40208B.getText().length() == 0 && getChildCount() > 1) {
            m37548r();
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public void m37546p() {
        try {
            m37550u(null);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: q */
    public final void m37547q(Object obj) {
        int m37539k = m37539k(obj);
        if (m37539k >= 0 && m37539k <= getChildCount() - 1 && getChildAt(m37539k) != this.f40208B) {
            Object tag = getChildAt(m37539k).getTag();
            removeViewAt(m37539k);
            if (!TextUtils.isEmpty(this.f40208B.getText())) {
                this.f40208B.setText("");
            }
            InterfaceC7395e interfaceC7395e = this.f40210u;
            if (interfaceC7395e != null) {
                interfaceC7395e.mo37554a(tag);
            }
            if (getChildCount() == 1) {
                this.f40208B.setHint(this.f40215z);
            }
        }
    }

    /* renamed from: r */
    public final void m37548r() {
        int childCount = getChildCount() - 1;
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            view = getChildAt(i11);
            if (view != null && (view instanceof LayoutBubbleView) && ((LayoutBubbleView) view).m37559c()) {
                break;
            }
        }
        if (view != null) {
            boolean z11 = view instanceof LayoutBubbleView;
            if (z11 && ((LayoutBubbleView) view).m37559c()) {
                int m37539k = m37539k(view.getTag());
                if (m37539k >= 0 && m37539k <= getChildCount() - 1 && getChildAt(m37539k) != this.f40208B) {
                    Object tag = getChildAt(m37539k).getTag();
                    removeViewAt(m37539k);
                    InterfaceC7395e interfaceC7395e = this.f40210u;
                    if (interfaceC7395e != null) {
                        interfaceC7395e.mo37554a(tag);
                    }
                    if (getChildCount() == 1) {
                        this.f40208B.setHint(this.f40215z);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z11) {
                ((LayoutBubbleView) view).setDeleting(true);
            }
        }
    }

    /* renamed from: s */
    public void m37549s(InterfaceC7393c interfaceC7393c) {
        this.f40213x.remove(interfaceC7393c);
    }

    public void setOnBubbleClickCallback(View.OnClickListener onClickListener) {
        this.f40209t = onClickListener;
    }

    public void setOnHeightChange(InterfaceC7396f interfaceC7396f) {
        this.f40212w = interfaceC7396f;
    }

    public void setOnItemClickCallback(InterfaceC7394d interfaceC7394d) {
        this.f40211v = interfaceC7394d;
    }

    public void setOnItemDeletedCallback(InterfaceC7395e interfaceC7395e) {
        this.f40210u = interfaceC7395e;
    }

    /* renamed from: u */
    public void m37550u(View view) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((view == null || !view.equals(getChildAt(i11))) && (getChildAt(i11) instanceof LayoutBubbleView)) {
                ((LayoutBubbleView) getChildAt(i11)).setDeleting(false);
            }
        }
    }
}
