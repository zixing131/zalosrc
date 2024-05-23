package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.customview.view.AbsSavedState;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import p175g0.AbstractC19178a;

/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: u */
    private static final int[] f35433u = {R.attr.state_checked};

    /* renamed from: r */
    private boolean f35434r;

    /* renamed from: s */
    private boolean f35435s;

    /* renamed from: t */
    private boolean f35436t;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6327a();

        /* renamed from: r */
        boolean f35437r;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6327a implements Parcelable.ClassLoaderCreator {
            C6327a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m32451b(Parcel parcel) {
            boolean z11 = true;
            if (parcel.readInt() != 1) {
                z11 = false;
            }
            this.f35437r = z11;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f35437r ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m32451b(parcel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes3.dex */
    public class C6328a extends C1490a {
        C6328a() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7615b0(CheckableImageButton.this.m32450a());
            c1507g0.m7617c0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.imageButtonStyle);
    }

    /* renamed from: a */
    public boolean m32450a() {
        return this.f35435s;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35434r;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (this.f35434r) {
            int[] iArr = f35433u;
            return View.mergeDrawableStates(super.onCreateDrawableState(i11 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        setChecked(savedState.f35437r);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35437r = this.f35434r;
        return savedState;
    }

    public void setCheckable(boolean z11) {
        if (this.f35435s != z11) {
            this.f35435s = z11;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f35435s && this.f35434r != z11) {
            this.f35434r = z11;
            refreshDrawableState();
            sendAccessibilityEvent(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        }
    }

    public void setPressable(boolean z11) {
        this.f35436t = z11;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        if (this.f35436t) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f35434r);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35435s = true;
        this.f35436t = true;
        AbstractC1579n0.m7801A0(this, new C6328a());
    }
}
