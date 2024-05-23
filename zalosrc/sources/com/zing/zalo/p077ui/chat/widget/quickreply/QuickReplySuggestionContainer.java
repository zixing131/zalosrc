package com.zing.zalo.p077ui.chat.widget.quickreply;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.widget.quickreply.C11788a;
import com.zing.zalo.p077ui.chat.widget.quickreply.QuickReplySuggestionContainer;
import dj.C17988o1;
import dj.C17991p1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import ui0.C27280g;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public final class QuickReplySuggestionContainer extends FrameLayout {

    /* renamed from: p */
    private RecyclerView f61322p;

    /* renamed from: q */
    private AppCompatImageView f61323q;

    /* renamed from: r */
    private C11788a f61324r;

    /* renamed from: s */
    private InterfaceC11786a f61325s;

    /* renamed from: com.zing.zalo.ui.chat.widget.quickreply.QuickReplySuggestionContainer$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11786a {
        /* renamed from: a */
        void mo64871a();

        /* renamed from: b */
        void mo64872b(String str, String str2);
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.quickreply.QuickReplySuggestionContainer$b */
    /* loaded from: classes5.dex */
    public static final class C11787b implements C11788a.a {
        C11787b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.quickreply.C11788a.a
        /* renamed from: a */
        public void mo65581a(C17991p1 c17991p1) {
            AbstractC19074t.m100208f(c17991p1, "quickReplyItem");
            InterfaceC11786a replySuggestionListener = QuickReplySuggestionContainer.this.getReplySuggestionListener();
            if (replySuggestionListener != null) {
                replySuggestionListener.mo64872b(c17991p1.m95673b(), c17991p1.m95672a());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplySuggestionContainer(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m65577d(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        boolean z11 = true;
        if (motionEvent.getAction() == 1) {
            z11 = false;
        }
        parent.requestDisallowInterceptTouchEvent(z11);
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m65578e(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        boolean z11 = true;
        if (motionEvent.getAction() == 1) {
            z11 = false;
        }
        parent.requestDisallowInterceptTouchEvent(z11);
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m65579f(QuickReplySuggestionContainer quickReplySuggestionContainer, View view) {
        AbstractC19074t.m100208f(quickReplySuggestionContainer, "this$0");
        InterfaceC11786a interfaceC11786a = quickReplySuggestionContainer.f61325s;
        if (interfaceC11786a != null) {
            interfaceC11786a.mo64871a();
        }
    }

    /* renamed from: g */
    public final void m65580g(C17988o1 c17988o1) {
        AbstractC19074t.m100208f(c17988o1, "quickReplySuggestion");
        C11788a c11788a = this.f61324r;
        C11788a c11788a2 = null;
        if (c11788a == null) {
            AbstractC19074t.m100223u("quickReplyAdapter");
            c11788a = null;
        }
        if (!AbstractC19074t.m100204b(c11788a.m65584M(), c17988o1)) {
            C11788a c11788a3 = this.f61324r;
            if (c11788a3 == null) {
                AbstractC19074t.m100223u("quickReplyAdapter");
                c11788a3 = null;
            }
            c11788a3.m65588R(c17988o1);
            C11788a c11788a4 = this.f61324r;
            if (c11788a4 == null) {
                AbstractC19074t.m100223u("quickReplyAdapter");
            } else {
                c11788a2 = c11788a4;
            }
            c11788a2.m10008p();
        }
    }

    public final String getQuickReplyGlobalMsgId() {
        C11788a c11788a = this.f61324r;
        if (c11788a == null) {
            AbstractC19074t.m100223u("quickReplyAdapter");
            c11788a = null;
        }
        return c11788a.m65584M().m95660a();
    }

    public final InterfaceC11786a getReplySuggestionListener() {
        return this.f61325s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f61322p.getRight() > this.f61323q.getLeft()) {
            RecyclerView recyclerView = this.f61322p;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f61322p.getPaddingTop(), this.f61322p.getRight() - this.f61323q.getLeft(), this.f61322p.getPaddingBottom());
        } else {
            RecyclerView recyclerView2 = this.f61322p;
            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.f61322p.getPaddingTop(), 0, this.f61322p.getPaddingBottom());
        }
    }

    public final void setReplySuggestionListener(InterfaceC11786a interfaceC11786a) {
        this.f61325s = interfaceC11786a;
    }

    public final void setupQuickSuggestionContainer(C17988o1 c17988o1) {
        AbstractC19074t.m100208f(c17988o1, "quickReplySuggestion");
        C11788a c11788a = new C11788a(c17988o1);
        c11788a.m65587Q(new C11787b());
        this.f61324r = c11788a;
        RecyclerView recyclerView = this.f61322p;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.m9723C2(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C11788a c11788a2 = this.f61324r;
        if (c11788a2 == null) {
            AbstractC19074t.m100223u("quickReplyAdapter");
            c11788a2 = null;
        }
        recyclerView.setAdapter(c11788a2);
    }

    public /* synthetic */ QuickReplySuggestionContainer(Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplySuggestionContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC7409c0.quick_reply_container_layout, this);
        View findViewById = findViewById(AbstractC6918a0.quick_reply_list);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f61322p = (RecyclerView) findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.close_button);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f61323q = (AppCompatImageView) findViewById2;
        this.f61322p.setOnTouchListener(new View.OnTouchListener() { // from class: q60.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m65577d;
                m65577d = QuickReplySuggestionContainer.m65577d(view, motionEvent);
                return m65577d;
            }
        });
        this.f61322p.setOverScrollMode(2);
        this.f61323q.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_02));
        this.f61322p.setOnTouchListener(new View.OnTouchListener() { // from class: q60.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m65578e;
                m65578e = QuickReplySuggestionContainer.m65578e(view, motionEvent);
                return m65578e;
            }
        });
        this.f61323q.setOnClickListener(new View.OnClickListener() { // from class: q60.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickReplySuggestionContainer.m65579f(QuickReplySuggestionContainer.this, view);
            }
        });
    }
}
