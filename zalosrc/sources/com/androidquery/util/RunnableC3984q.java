package com.androidquery.util;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;

/* renamed from: com.androidquery.util.q */
/* loaded from: classes2.dex */
public class RunnableC3984q implements Runnable {

    /* renamed from: p */
    private ProgressBar f15768p;

    /* renamed from: q */
    private Activity f15769q;

    /* renamed from: r */
    private View f15770r;

    /* renamed from: s */
    private boolean f15771s;

    /* renamed from: t */
    private int f15772t;

    /* renamed from: u */
    private int f15773u;

    /* renamed from: v */
    private String f15774v;

    public RunnableC3984q(Object obj) {
        if (obj instanceof ProgressBar) {
            this.f15768p = (ProgressBar) obj;
        } else if (obj instanceof Activity) {
            this.f15769q = (Activity) obj;
        } else if (obj instanceof View) {
            this.f15770r = (View) obj;
        }
    }

    /* renamed from: a */
    private void m18867a(String str) {
        Activity activity = this.f15769q;
        if (activity != null) {
            activity.setProgressBarIndeterminateVisibility(false);
            this.f15769q.setProgressBarVisibility(false);
        }
        ProgressBar progressBar = this.f15768p;
        if (progressBar != null) {
            progressBar.setTag(1090453505, str);
            this.f15768p.setVisibility(0);
        }
        View view = this.f15768p;
        if (view == null) {
            view = this.f15770r;
        }
        if (view != null) {
            Object tag = view.getTag(1090453505);
            if (tag == null || tag.equals(str)) {
                view.setTag(1090453505, null);
                ProgressBar progressBar2 = this.f15768p;
                if (progressBar2 != null && progressBar2.isIndeterminate()) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: b */
    public void m18868b() {
        ProgressBar progressBar = this.f15768p;
        if (progressBar != null) {
            progressBar.setProgress(progressBar.getMax());
        }
        Activity activity = this.f15769q;
        if (activity != null) {
            activity.setProgress(9999);
        }
    }

    /* renamed from: c */
    public void m18869c(int i11) {
        int i12;
        int i13;
        ProgressBar progressBar = this.f15768p;
        if (progressBar != null) {
            if (this.f15771s) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            progressBar.incrementProgressBy(i13);
        }
        Activity activity = this.f15769q;
        if (activity != null) {
            if (this.f15771s) {
                i12 = this.f15773u;
                this.f15773u = i12 + 1;
            } else {
                int i14 = this.f15773u + i11;
                this.f15773u = i14;
                i12 = (i14 * 10000) / this.f15772t;
            }
            if (i12 > 9999) {
                i12 = 9999;
            }
            activity.setProgress(i12);
        }
    }

    /* renamed from: d */
    public void m18870d() {
        ProgressBar progressBar = this.f15768p;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.f15768p.setMax(10000);
        }
        Activity activity = this.f15769q;
        if (activity != null) {
            activity.setProgress(0);
        }
        this.f15771s = false;
        this.f15773u = 0;
        this.f15772t = 10000;
    }

    /* renamed from: e */
    public void m18871e(int i11) {
        if (i11 <= 0) {
            this.f15771s = true;
            i11 = 10000;
        }
        this.f15772t = i11;
        ProgressBar progressBar = this.f15768p;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.f15768p.setMax(i11);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        m18867a(this.f15774v);
    }
}
