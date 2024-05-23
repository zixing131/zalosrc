package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;
import p664y.AbstractC30228a;

@Deprecated
/* loaded from: classes2.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: p */
    private final ArrayList f7018p;

    /* renamed from: q */
    private AbstractC1733g f7019q;

    /* renamed from: r */
    private int f7020r;

    /* renamed from: s */
    private TabHost.OnTabChangeListener f7021s;

    /* renamed from: t */
    private boolean f7022t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1725a();

        /* renamed from: p */
        String f7023p;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1725a implements Parcelable.Creator {
            C1725a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f7023p + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f7023p);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f7023p = parcel.readString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    /* loaded from: classes2.dex */
    public static final class C1726a {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7018p = new ArrayList();
        m8929c(context, attributeSet);
    }

    /* renamed from: a */
    private AbstractC1736j m8927a(String str, AbstractC1736j abstractC1736j) {
        m8928b(str);
        return abstractC1736j;
    }

    /* renamed from: b */
    private C1726a m8928b(String str) {
        if (this.f7018p.size() <= 0) {
            return null;
        }
        AbstractC30228a.m149044a(this.f7018p.get(0));
        throw null;
    }

    /* renamed from: c */
    private void m8929c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f7020r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f7018p.size() <= 0) {
            this.f7022t = true;
            AbstractC1736j m8927a = m8927a(currentTabTag, null);
            if (m8927a != null) {
                m8927a.mo8934d();
                this.f7019q.mo8992c();
                return;
            }
            return;
        }
        AbstractC30228a.m149044a(this.f7018p.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7022t = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f7023p);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7023p = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        AbstractC1736j m8927a;
        if (this.f7022t && (m8927a = m8927a(str, null)) != null) {
            m8927a.mo8934d();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f7021s;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f7021s = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
