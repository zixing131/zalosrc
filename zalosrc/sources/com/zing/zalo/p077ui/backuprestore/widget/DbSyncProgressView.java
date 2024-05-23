package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.DbSyncProgressView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes5.dex */
public class DbSyncProgressView extends LinearLayout {

    /* renamed from: p */
    StringBuilder f56064p;

    /* renamed from: q */
    Runnable f56065q;

    /* renamed from: r */
    private ProgressBar f56066r;

    /* renamed from: s */
    private TextSwitcher f56067s;

    /* renamed from: t */
    private View f56068t;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.DbSyncProgressView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11135a {
    }

    public DbSyncProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56065q = new Runnable() { // from class: d50.a
            @Override // java.lang.Runnable
            public final void run() {
                DbSyncProgressView.this.m58353g();
            }
        };
        m58350d(context);
    }

    /* renamed from: d */
    private void m58350d(final Context context) {
        this.f56064p = new StringBuilder();
        View.inflate(context, AbstractC7409c0.db_sync_progress_view, this);
        this.f56066r = (ProgressBar) findViewById(AbstractC6918a0.progress);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(AbstractC6918a0.status);
        this.f56067s = textSwitcher;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: d50.b
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View m58351e;
                m58351e = DbSyncProgressView.this.m58351e(context);
                return m58351e;
            }
        });
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in_short);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_out_short);
        this.f56067s.setInAnimation(loadAnimation);
        this.f56067s.setOutAnimation(loadAnimation2);
        View findViewById = findViewById(AbstractC6918a0.cancel_backup);
        this.f56068t = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: d50.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DbSyncProgressView.this.m58352f(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ View m58351e(Context context) {
        RobotoTextView robotoTextView = new RobotoTextView(this.f56067s.getContext());
        robotoTextView.setGravity(51);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        robotoTextView.setTextSize(1, 14.0f);
        return robotoTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m58352f(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m58353g() {
        setVisibility(8);
    }

    public void setOnCancelBackup(InterfaceC11135a interfaceC11135a) {
    }

    public DbSyncProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f56065q = new Runnable() { // from class: d50.a
            @Override // java.lang.Runnable
            public final void run() {
                DbSyncProgressView.this.m58353g();
            }
        };
        m58350d(context);
    }
}
