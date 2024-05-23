package com.androidquery.util;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Gallery;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import java.io.File;
import java.util.Comparator;
import p379o3.C23999j;
import p471r3.EnumC25629a;

/* renamed from: com.androidquery.util.h */
/* loaded from: classes2.dex */
public class RunnableC3975h implements Comparator, Runnable, View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* renamed from: p */
    private Object f15715p;

    /* renamed from: q */
    private String f15716q;

    /* renamed from: r */
    private Object[] f15717r;

    /* renamed from: s */
    private boolean f15718s;

    /* renamed from: t */
    private Class[] f15719t;

    /* renamed from: u */
    private int f15720u;

    /* renamed from: w */
    private AbsListView.OnScrollListener f15722w;

    /* renamed from: x */
    private int f15723x;

    /* renamed from: y */
    private AdapterView.OnItemSelectedListener f15724y;

    /* renamed from: v */
    private int f15721v = 0;

    /* renamed from: z */
    private boolean f15725z = false;

    /* renamed from: a */
    private void m18822a(AbsListView absListView, int i11) {
        int count = absListView.getCount();
        int lastVisiblePosition = absListView.getLastVisiblePosition();
        if (i11 == 0 && count == lastVisiblePosition + 1) {
            if (lastVisiblePosition != this.f15723x) {
                this.f15723x = lastVisiblePosition;
                m18823c(absListView, Integer.valueOf(i11));
                return;
            }
            return;
        }
        this.f15723x = -1;
    }

    /* renamed from: c */
    private Object m18823c(Object... objArr) {
        Object[] objArr2;
        Object obj;
        String str = this.f15716q;
        if (str != null) {
            Object[] objArr3 = this.f15717r;
            if (objArr3 != null) {
                objArr2 = objArr3;
            } else {
                objArr2 = objArr;
            }
            Object obj2 = this.f15715p;
            if (obj2 == null) {
                obj = this;
            } else {
                obj = obj2;
            }
            return AbstractC3972e.m18761R(obj, str, this.f15718s, true, this.f15719t, objArr2);
        }
        int i11 = this.f15720u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC3972e.m18784h();
                        return null;
                    }
                    return null;
                }
                Object[] objArr4 = this.f15717r;
                AbstractC3972e.m18778e((File) objArr4[0], ((Long) objArr4[1]).longValue(), ((Long) this.f15717r[2]).longValue());
                return null;
            }
            Object[] objArr5 = this.f15717r;
            AbstractC3972e.m18795m0((File) objArr5[0], (byte[]) objArr5[1]);
            return null;
        }
        return null;
    }

    /* renamed from: f */
    private void m18824f(ExpandableListView expandableListView, int i11) {
        boolean z11;
        expandableListView.setTag(1090453508, Integer.valueOf(i11));
        if (i11 == 0) {
            int firstVisiblePosition = expandableListView.getFirstVisiblePosition();
            int lastVisiblePosition = expandableListView.getLastVisiblePosition() - firstVisiblePosition;
            ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
            for (int i12 = 0; i12 <= lastVisiblePosition; i12++) {
                long expandableListPosition = expandableListView.getExpandableListPosition(i12 + firstVisiblePosition);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (packedPositionGroup >= 0) {
                    View childAt = expandableListView.getChildAt(i12);
                    Long l11 = (Long) childAt.getTag(1090453508);
                    if (l11 != null && l11.longValue() == expandableListPosition) {
                        if (packedPositionChild == -1) {
                            expandableListAdapter.getGroupView(packedPositionGroup, expandableListView.isGroupExpanded(packedPositionGroup), childAt, expandableListView);
                        } else {
                            if (packedPositionChild == expandableListAdapter.getChildrenCount(packedPositionGroup) - 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            expandableListAdapter.getChildView(packedPositionGroup, packedPositionChild, z11, childAt, expandableListView);
                        }
                        childAt.setTag(1090453508, null);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private void m18825g(AbsListView absListView, int i11) {
        absListView.setTag(1090453508, Integer.valueOf(i11));
        if (i11 == 0) {
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            int lastVisiblePosition = absListView.getLastVisiblePosition() - firstVisiblePosition;
            ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
            for (int i12 = 0; i12 <= lastVisiblePosition; i12++) {
                long j11 = i12 + firstVisiblePosition;
                View childAt = absListView.getChildAt(i12);
                if (((Number) childAt.getTag(1090453508)) != null) {
                    listAdapter.getView((int) j11, childAt, absListView);
                    childAt.setTag(1090453508, null);
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m18826h(int i11, int i12, View view, ViewGroup viewGroup, String str) {
        if (str != null && !C23999j.m125694K2(str, 0, 0, EnumC25629a.DEFAULT)) {
            AbsListView absListView = (AbsListView) viewGroup;
            if (((AbsListView.OnScrollListener) viewGroup.getTag(1090453506)) == null) {
                RunnableC3975h runnableC3975h = new RunnableC3975h();
                absListView.setOnScrollListener(runnableC3975h);
                viewGroup.setTag(1090453506, runnableC3975h);
            }
            Integer num = (Integer) absListView.getTag(1090453508);
            if (num != null && num.intValue() != 0 && num.intValue() != 1) {
                long j11 = i12;
                if (viewGroup instanceof ExpandableListView) {
                    j11 = ExpandableListView.getPackedPositionForChild(i11, i12);
                }
                view.setTag(1090453508, Long.valueOf(j11));
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m18827i(int i11, View view, ViewGroup viewGroup, String str) {
        if (viewGroup instanceof Gallery) {
            return m18828j(i11, view, viewGroup, str);
        }
        return m18826h(-2, i11, view, viewGroup, str);
    }

    /* renamed from: j */
    private static boolean m18828j(int i11, View view, ViewGroup viewGroup, String str) {
        Integer num = 0;
        if (str == null || C23999j.m125694K2(str, 0, 0, EnumC25629a.DEFAULT)) {
            return false;
        }
        Gallery gallery = (Gallery) viewGroup;
        Integer num2 = (Integer) gallery.getTag(1090453508);
        if (num2 == null) {
            gallery.setTag(1090453508, num);
            gallery.setCallbackDuringFling(false);
            new RunnableC3975h().m18831d(gallery);
        } else {
            num = num2;
        }
        int lastVisiblePosition = ((gallery.getLastVisiblePosition() - gallery.getFirstVisiblePosition()) / 2) + 1;
        int intValue = num.intValue() - lastVisiblePosition;
        int intValue2 = num.intValue() + lastVisiblePosition;
        if (intValue < 0) {
            intValue2 -= intValue;
            intValue = 0;
        }
        if (i11 >= intValue && i11 <= intValue2) {
            view.setTag(1090453508, Integer.valueOf(i11));
            return false;
        }
        view.setTag(1090453508, null);
        return true;
    }

    /* renamed from: k */
    public static void m18829k(Object obj, String str, boolean z11) {
        ProgressBar progressBar;
        if (obj != null) {
            if (obj instanceof View) {
                View view = (View) obj;
                if (obj instanceof ProgressBar) {
                    progressBar = (ProgressBar) obj;
                } else {
                    progressBar = null;
                }
                if (z11) {
                    view.setTag(1090453505, str);
                    view.setVisibility(0);
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                        progressBar.setMax(100);
                        return;
                    }
                    return;
                }
                Object tag = view.getTag(1090453505);
                if (tag == null || tag.equals(str)) {
                    view.setTag(1090453505, null);
                    if (progressBar == null || progressBar.isIndeterminate()) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                activity.setProgressBarIndeterminateVisibility(z11);
                activity.setProgressBarVisibility(z11);
                if (z11) {
                    activity.setProgress(0);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* renamed from: d */
    public void m18831d(Gallery gallery) {
        this.f15724y = gallery.getOnItemSelectedListener();
        this.f15725z = true;
        gallery.setOnItemSelectedListener(this);
    }

    /* renamed from: e */
    public RunnableC3975h m18832e(int i11, Object... objArr) {
        this.f15720u = i11;
        this.f15717r = objArr;
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m18823c(view);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        m18823c(adapterView, view, Integer.valueOf(i11), Long.valueOf(j11));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
        m18823c(adapterView, view, Integer.valueOf(i11), Long.valueOf(j11));
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f15724y;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i11, j11);
        }
        if (this.f15725z && ((Integer) adapterView.getTag(1090453508)).intValue() != i11) {
            Adapter adapter = adapterView.getAdapter();
            adapterView.setTag(1090453508, Integer.valueOf(i11));
            int childCount = adapterView.getChildCount();
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = adapterView.getChildAt(i12);
                int i13 = firstVisiblePosition + i12;
                Integer num = (Integer) childAt.getTag(1090453508);
                if (num == null || num.intValue() != i13) {
                    adapter.getView(i13, childAt, adapterView);
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Object m18823c = m18823c(view);
        if (!(m18823c instanceof Boolean)) {
            return false;
        }
        return ((Boolean) m18823c).booleanValue();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f15724y;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        m18822a(absListView, this.f15721v);
        AbsListView.OnScrollListener onScrollListener = this.f15722w;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i11, i12, i13);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i11) {
        this.f15721v = i11;
        m18822a(absListView, i11);
        if (absListView instanceof ExpandableListView) {
            m18824f((ExpandableListView) absListView, i11);
        } else {
            m18825g(absListView, i11);
        }
        AbsListView.OnScrollListener onScrollListener = this.f15722w;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i11);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        m18823c(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    @Override // java.lang.Runnable
    public void run() {
        m18823c(new Object[0]);
    }
}
