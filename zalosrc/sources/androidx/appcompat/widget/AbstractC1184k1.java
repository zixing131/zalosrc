package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: classes2.dex */
abstract class AbstractC1184k1 extends Resources {

    /* renamed from: a */
    private final Resources f4659a;

    public AbstractC1184k1(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f4659a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i11) {
        return this.f4659a.getAnimation(i11);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i11) {
        return this.f4659a.getBoolean(i11);
    }

    @Override // android.content.res.Resources
    public int getColor(int i11) {
        return this.f4659a.getColor(i11);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i11) {
        return this.f4659a.getColorStateList(i11);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f4659a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i11) {
        return this.f4659a.getDimension(i11);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i11) {
        return this.f4659a.getDimensionPixelOffset(i11);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i11) {
        return this.f4659a.getDimensionPixelSize(i11);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f4659a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) {
        return this.f4659a.getDrawable(i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i11, int i12) {
        return this.f4659a.getDrawableForDensity(i11, i12);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i11, int i12, int i13) {
        return this.f4659a.getFraction(i11, i12, i13);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f4659a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i11) {
        return this.f4659a.getIntArray(i11);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i11) {
        return this.f4659a.getInteger(i11);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i11) {
        return this.f4659a.getLayout(i11);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i11) {
        return this.f4659a.getMovie(i11);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i11, int i12, Object... objArr) {
        return this.f4659a.getQuantityString(i11, i12, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i11, int i12) {
        return this.f4659a.getQuantityText(i11, i12);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i11) {
        return this.f4659a.getResourceEntryName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i11) {
        return this.f4659a.getResourceName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i11) {
        return this.f4659a.getResourcePackageName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i11) {
        return this.f4659a.getResourceTypeName(i11);
    }

    @Override // android.content.res.Resources
    public String getString(int i11) {
        return this.f4659a.getString(i11);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i11) {
        return this.f4659a.getStringArray(i11);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i11) {
        return this.f4659a.getText(i11);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i11) {
        return this.f4659a.getTextArray(i11);
    }

    @Override // android.content.res.Resources
    public void getValue(int i11, TypedValue typedValue, boolean z11) {
        this.f4659a.getValue(i11, typedValue, z11);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i11, int i12, TypedValue typedValue, boolean z11) {
        this.f4659a.getValueForDensity(i11, i12, typedValue, z11);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i11) {
        return this.f4659a.getXml(i11);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f4659a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i11) {
        return this.f4659a.obtainTypedArray(i11);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i11) {
        return this.f4659a.openRawResource(i11);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i11) {
        return this.f4659a.openRawResourceFd(i11);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f4659a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f4659a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f4659a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11, Resources.Theme theme) {
        return this.f4659a.getDrawable(i11, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i11, int i12, Resources.Theme theme) {
        return this.f4659a.getDrawableForDensity(i11, i12, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i11, int i12) {
        return this.f4659a.getQuantityString(i11, i12);
    }

    @Override // android.content.res.Resources
    public String getString(int i11, Object... objArr) {
        return this.f4659a.getString(i11, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i11, CharSequence charSequence) {
        return this.f4659a.getText(i11, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z11) {
        this.f4659a.getValue(str, typedValue, z11);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i11, TypedValue typedValue) {
        return this.f4659a.openRawResource(i11, typedValue);
    }
}
