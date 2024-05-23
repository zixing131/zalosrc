package com.zing.zalo.p077ui.picker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import java.util.List;
import me0.C23212s8;
import me0.C23278z2;
import p241ij.C20564a;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.ui.picker.c */
/* loaded from: classes6.dex */
public class C12669c extends RecyclerView.AbstractC1880g {

    /* renamed from: u */
    static AnimatorSet f66010u;

    /* renamed from: r */
    List f66011r;

    /* renamed from: s */
    private final C23528a f66012s;

    /* renamed from: t */
    private c f66013t;

    /* renamed from: com.zing.zalo.ui.picker.c$a */
    /* loaded from: classes6.dex */
    public static class a extends RecyclerView.AbstractC1876c0 implements View.OnClickListener {

        /* renamed from: I */
        c f66014I;

        /* renamed from: J */
        C20564a f66015J;

        /* renamed from: K */
        private final RecyclingImageView f66016K;

        /* renamed from: L */
        private final TextView f66017L;

        /* renamed from: M */
        private final View f66018M;

        /* renamed from: N */
        C23528a f66019N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.picker.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C32769a extends AnimatorListenerAdapter {
            C32769a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                a.this.getClass();
                a.this.f66018M.setAlpha(0.0f);
                a.this.f66016K.setScaleX(1.0f);
                a.this.f66016K.setScaleY(1.0f);
            }
        }

        public a(View view, c cVar, d dVar, C23528a c23528a) {
            super(view);
            this.f66014I = cVar;
            this.f66019N = c23528a;
            view.setOnClickListener(this);
            this.f66016K = (RecyclingImageView) view.findViewById(AbstractC6918a0.imvFunctionImg);
            this.f66017L = (TextView) view.findViewById(AbstractC6918a0.tvFunctionName);
            this.f66018M = view.findViewById(AbstractC6918a0.highlight_bg);
        }

        /* renamed from: k0 */
        public void m71364k0(C20564a c20564a) {
            try {
                this.f66015J = c20564a;
                String m106979c = c20564a.m106979c();
                if (!TextUtils.isEmpty(m106979c)) {
                    ((C23528a) this.f66019N.m123612r(this.f66016K)).m123618x(m106979c, C23278z2.m120064D());
                } else {
                    int m106978b = this.f66015J.m106978b();
                    if (m106978b == 0) {
                        m106978b = C23212s8.m119610r(AbstractC16781w.default_avatar);
                    }
                    ((C23528a) this.f66019N.m123612r(this.f66016K)).m123613s(m106978b);
                }
                this.f66017L.setText(this.f66015J.m106980d());
                if (this.f66015J.m106981e()) {
                    this.f66015J.m106983g(false);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f66018M, "alpha", 1.0f, 0.7f, 0.5f, 0.3f, 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f66016K, "scaleX", 1.0f, 1.16f, 1.0f, 1.04f, 1.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f66016K, "scaleY", 1.0f, 1.16f, 1.0f, 1.04f, 1.0f);
                    ofFloat.setDuration(1000L);
                    ofFloat2.setDuration(1000L);
                    ofFloat3.setDuration(1000L);
                    ofFloat.setRepeatCount(-1);
                    ofFloat2.setRepeatCount(-1);
                    ofFloat3.setRepeatCount(-1);
                    AnimatorSet animatorSet = new AnimatorSet();
                    C12669c.f66010u = animatorSet;
                    animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat);
                    C12669c.f66010u.addListener(new C32769a());
                    C12669c.f66010u.start();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = this.f66014I;
            if (cVar != null) {
                cVar.mo71365a(view, this.f66015J);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.c$b */
    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        public b(View view) {
            super(view);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.c$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: a */
        void mo71365a(View view, C20564a c20564a);
    }

    /* renamed from: com.zing.zalo.ui.picker.c$d */
    /* loaded from: classes6.dex */
    public interface d {
    }

    public C12669c(List list, C23528a c23528a) {
        this.f66011r = list;
        this.f66012s = c23528a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (abstractC1876c0 instanceof a) {
            ((a) abstractC1876c0).m71364k0(m71356L(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_chat_functions_more_header, viewGroup, false));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.chatfunction_item, viewGroup, false), this.f66013t, null, this.f66012s);
    }

    /* renamed from: L */
    C20564a m71356L(int i11) {
        return (C20564a) this.f66011r.get(i11);
    }

    /* renamed from: M */
    public int m71357M(int i11) {
        if (mo10003k() > 0) {
            for (int i12 = 0; i12 < mo10003k(); i12++) {
                if (m71356L(i12).m106977a() == i11) {
                    return i12;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: N */
    public boolean m71358N(int i11) {
        if (i11 >= 0 && i11 < this.f66011r.size() && ((C20564a) this.f66011r.get(i11)).m106977a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void m71359O(List list) {
        this.f66011r = list;
    }

    /* renamed from: P */
    public void m71360P(c cVar) {
        this.f66013t = cVar;
    }

    /* renamed from: Q */
    public void m71361Q() {
        AnimatorSet animatorSet = f66010u;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f66011r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (m71356L(i11).m106977a() == 0) {
            return 1;
        }
        return 0;
    }
}
