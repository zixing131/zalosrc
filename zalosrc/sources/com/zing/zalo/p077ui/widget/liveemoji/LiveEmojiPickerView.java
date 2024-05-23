package com.zing.zalo.p077ui.widget.liveemoji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.EmojiView;
import java.util.List;
import me0.AbstractC23136l9;
import p019aj.C0874h;
import p348mi.AbstractC23309i;
import p394oj.C24277c;

/* loaded from: classes6.dex */
public class LiveEmojiPickerView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: u */
    static final int f70681u;

    /* renamed from: v */
    static final int f70682v;

    /* renamed from: w */
    static final int f70683w;

    /* renamed from: p */
    RecyclerView f70684p;

    /* renamed from: q */
    InterfaceC13685c f70685q;

    /* renamed from: r */
    int f70686r;

    /* renamed from: s */
    boolean f70687s;

    /* renamed from: t */
    List f70688t;

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiPickerView$a */
    /* loaded from: classes6.dex */
    class C13683a extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        View.OnClickListener f70689r = new a();

        /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiPickerView$a$a */
        /* loaded from: classes6.dex */
        class a implements View.OnClickListener {

            /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiPickerView$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            class C32780a extends AnimatorListenerAdapter {

                /* renamed from: p */
                final /* synthetic */ View f70692p;

                C32780a(View view) {
                    this.f70692p = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (LiveEmojiPickerView.this.f70685q != null) {
                        int intValue = ((Integer) this.f70692p.getTag()).intValue();
                        LiveEmojiPickerView liveEmojiPickerView = LiveEmojiPickerView.this;
                        liveEmojiPickerView.f70685q.mo76405a((C24277c) liveEmojiPickerView.f70688t.get(intValue));
                    }
                }
            }

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C13683a c13683a = C13683a.this;
                LiveEmojiPickerView liveEmojiPickerView = LiveEmojiPickerView.this;
                if (!liveEmojiPickerView.f70687s) {
                    liveEmojiPickerView.f70687s = true;
                    c13683a.m10009q(liveEmojiPickerView.f70686r);
                    LiveEmojiPickerView.this.f70686r = ((Integer) view.getTag()).intValue();
                    view.setBackgroundResource(AbstractC16803z.selected_emoji_bg);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f, 1.0f));
                    animatorSet.setDuration(300L);
                    animatorSet.addListener(new C32780a(view));
                    animatorSet.start();
                }
            }
        }

        C13683a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: A */
        public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
            int i12;
            try {
                EmojiView emojiView = (EmojiView) abstractC1876c0.f7784p;
                emojiView.setData(((C24277c) LiveEmojiPickerView.this.f70688t.get(i11)).f117241b);
                emojiView.setTag(Integer.valueOf(i11));
                emojiView.setOnClickListener(this.f70689r);
                if (i11 == LiveEmojiPickerView.this.f70686r) {
                    i12 = AbstractC16803z.selected_emoji_bg;
                } else {
                    i12 = 0;
                }
                emojiView.setBackgroundResource(i12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: C */
        public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
            EmojiView emojiView = new EmojiView(LiveEmojiPickerView.this.getContext());
            emojiView.setLayoutParams(new ViewGroup.LayoutParams(-1, LiveEmojiPickerView.f70683w));
            emojiView.setEmojiSize(LiveEmojiPickerView.f70682v);
            return new C13684b(emojiView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return LiveEmojiPickerView.this.f70688t.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiPickerView$b */
    /* loaded from: classes6.dex */
    static class C13684b extends RecyclerView.AbstractC1876c0 {
        public C13684b(View view) {
            super(view);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiPickerView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13685c {
        /* renamed from: J */
        void mo76404J();

        /* renamed from: a */
        void mo76405a(C24277c c24277c);
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(282.0f);
        f70681u = m118742r;
        f70682v = AbstractC23136l9.m118742r(26.0f);
        f70683w = m118742r / 6;
    }

    public LiveEmojiPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70686r = -1;
        this.f70687s = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC13685c interfaceC13685c;
        if (view.getId() == AbstractC6918a0.close && (interfaceC13685c = this.f70685q) != null) {
            interfaceC13685c.mo76404J();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(AbstractC6918a0.close).setOnClickListener(this);
        this.f70688t = C0874h.f3217a.m2588c();
        this.f70684p = (RecyclerView) findViewById(AbstractC6918a0.emoji_list);
        this.f70684p.setAdapter(new C13683a());
        this.f70684p.setLayoutManager(new GridLayoutManager(getContext(), 6));
        this.f70684p.setItemAnimator(null);
        String m122314qb = AbstractC23309i.m122314qb();
        for (int i11 = 0; i11 < this.f70688t.size(); i11++) {
            if (((C24277c) this.f70688t.get(i11)).f117241b.equals(m122314qb)) {
                this.f70686r = i11;
            }
        }
        this.f70684p.m9837K1(this.f70686r);
        this.f70684p.getLayoutParams().height = (int) (f70683w * 6.5d);
    }

    public void setListener(InterfaceC13685c interfaceC13685c) {
        this.f70685q = interfaceC13685c;
    }
}
