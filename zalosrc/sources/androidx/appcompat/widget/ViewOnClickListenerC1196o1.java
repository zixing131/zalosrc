package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;
import p311l1.AbstractC21997c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o1 */
/* loaded from: classes2.dex */
public class ViewOnClickListenerC1196o1 extends AbstractC21997c implements View.OnClickListener {

    /* renamed from: A */
    private final SearchView f4682A;

    /* renamed from: B */
    private final SearchableInfo f4683B;

    /* renamed from: C */
    private final Context f4684C;

    /* renamed from: D */
    private final WeakHashMap f4685D;

    /* renamed from: E */
    private final int f4686E;

    /* renamed from: F */
    private boolean f4687F;

    /* renamed from: G */
    private int f4688G;

    /* renamed from: H */
    private ColorStateList f4689H;

    /* renamed from: I */
    private int f4690I;

    /* renamed from: J */
    private int f4691J;

    /* renamed from: K */
    private int f4692K;

    /* renamed from: L */
    private int f4693L;

    /* renamed from: M */
    private int f4694M;

    /* renamed from: N */
    private int f4695N;

    /* renamed from: androidx.appcompat.widget.o1$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f4696a;

        /* renamed from: b */
        public final TextView f4697b;

        /* renamed from: c */
        public final ImageView f4698c;

        /* renamed from: d */
        public final ImageView f4699d;

        /* renamed from: e */
        public final ImageView f4700e;

        public a(View view) {
            this.f4696a = (TextView) view.findViewById(R.id.text1);
            this.f4697b = (TextView) view.findViewById(R.id.text2);
            this.f4698c = (ImageView) view.findViewById(R.id.icon1);
            this.f4699d = (ImageView) view.findViewById(R.id.icon2);
            this.f4700e = (ImageView) view.findViewById(AbstractC19183f.edit_query);
        }
    }

    public ViewOnClickListenerC1196o1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f4687F = false;
        this.f4688G = 1;
        this.f4690I = -1;
        this.f4691J = -1;
        this.f4692K = -1;
        this.f4693L = -1;
        this.f4694M = -1;
        this.f4695N = -1;
        this.f4682A = searchView;
        this.f4683B = searchableInfo;
        this.f4686E = searchView.getSuggestionCommitIconResId();
        this.f4684C = context;
        this.f4685D = weakHashMap;
    }

    /* renamed from: A */
    private void m5653A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f4685D.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m5654B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m5655k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f4685D.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m5656l(CharSequence charSequence) {
        if (this.f4689H == null) {
            TypedValue typedValue = new TypedValue();
            this.f108355s.getTheme().resolveAttribute(AbstractC19178a.textColorSearchUrl, typedValue, true);
            this.f4689H = this.f108355s.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f4689H, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m5657m(ComponentName componentName) {
        PackageManager packageManager = this.f108355s.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid icon resource ");
                sb2.append(iconResource);
                sb2.append(" for ");
                sb2.append(componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.toString();
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m5658n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f4685D.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f4685D.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f4684C.getResources());
        }
        Drawable m5657m = m5657m(componentName);
        if (m5657m != null) {
            constantState = m5657m.getConstantState();
        }
        this.f4685D.put(flattenToShortString, constantState);
        return m5657m;
    }

    /* renamed from: o */
    public static String m5659o(Cursor cursor, String str) {
        return m5665w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m5660p() {
        Drawable m5658n = m5658n(this.f4683B.getSearchActivity());
        if (m5658n != null) {
            return m5658n;
        }
        return this.f108355s.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m5661q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m5673r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f4684C.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    return Drawable.createFromStream(openInputStream, null);
                } finally {
                    try {
                        openInputStream.close();
                    } catch (IOException unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error closing icon stream for ");
                        sb2.append(uri);
                    }
                }
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Icon not found: ");
            sb3.append(uri);
            sb3.append(", ");
            sb3.append(e11.getMessage());
            return null;
        }
        StringBuilder sb32 = new StringBuilder();
        sb32.append("Icon not found: ");
        sb32.append(uri);
        sb32.append(", ");
        sb32.append(e11.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m5662s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f4684C.getPackageName() + "/" + parseInt;
            Drawable m5655k = m5655k(str2);
            if (m5655k != null) {
                return m5655k;
            }
            Drawable m6964f = AbstractC1388a.m6964f(this.f4684C, parseInt);
            m5653A(str2, m6964f);
            return m6964f;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Icon resource not found: ");
            sb2.append(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m5655k2 = m5655k(str);
            if (m5655k2 != null) {
                return m5655k2;
            }
            Drawable m5661q = m5661q(Uri.parse(str));
            m5653A(str, m5661q);
            return m5661q;
        }
    }

    /* renamed from: t */
    private Drawable m5663t(Cursor cursor) {
        int i11 = this.f4693L;
        if (i11 == -1) {
            return null;
        }
        Drawable m5662s = m5662s(cursor.getString(i11));
        if (m5662s != null) {
            return m5662s;
        }
        return m5660p();
    }

    /* renamed from: u */
    private Drawable m5664u(Cursor cursor) {
        int i11 = this.f4694M;
        if (i11 == -1) {
            return null;
        }
        return m5662s(cursor.getString(i11));
    }

    /* renamed from: w */
    private static String m5665w(Cursor cursor, int i11) {
        if (i11 == -1) {
            return null;
        }
        try {
            return cursor.getString(i11);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    private void m5666y(ImageView imageView, Drawable drawable, int i11) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i11);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m5667z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p311l1.AbstractC21995a, p311l1.C21996b.a
    /* renamed from: a */
    public void mo5668a(Cursor cursor) {
        if (this.f4687F) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo5668a(cursor);
            if (cursor != null) {
                this.f4690I = cursor.getColumnIndex("suggest_text_1");
                this.f4691J = cursor.getColumnIndex("suggest_text_2");
                this.f4692K = cursor.getColumnIndex("suggest_text_2_url");
                this.f4693L = cursor.getColumnIndex("suggest_icon_1");
                this.f4694M = cursor.getColumnIndex("suggest_icon_2");
                this.f4695N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p311l1.AbstractC21995a, p311l1.C21996b.a
    /* renamed from: b */
    public CharSequence mo5669b(Cursor cursor) {
        String m5659o;
        String m5659o2;
        if (cursor == null) {
            return null;
        }
        String m5659o3 = m5659o(cursor, "suggest_intent_query");
        if (m5659o3 != null) {
            return m5659o3;
        }
        if (this.f4683B.shouldRewriteQueryFromData() && (m5659o2 = m5659o(cursor, "suggest_intent_data")) != null) {
            return m5659o2;
        }
        if (!this.f4683B.shouldRewriteQueryFromText() || (m5659o = m5659o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m5659o;
    }

    @Override // p311l1.C21996b.a
    /* renamed from: c */
    public Cursor mo5670c(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f4682A.getVisibility() == 0 && this.f4682A.getWindowVisibility() == 0) {
            try {
                Cursor m5674v = m5674v(this.f4683B, charSequence2, 50);
                if (m5674v != null) {
                    m5674v.getCount();
                    return m5674v;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // p311l1.AbstractC21995a
    /* renamed from: e */
    public void mo5671e(View view, Context context, Cursor cursor) {
        int i11;
        CharSequence m5665w;
        a aVar = (a) view.getTag();
        int i12 = this.f4695N;
        if (i12 != -1) {
            i11 = cursor.getInt(i12);
        } else {
            i11 = 0;
        }
        if (aVar.f4696a != null) {
            m5667z(aVar.f4696a, m5665w(cursor, this.f4690I));
        }
        if (aVar.f4697b != null) {
            String m5665w2 = m5665w(cursor, this.f4692K);
            if (m5665w2 != null) {
                m5665w = m5656l(m5665w2);
            } else {
                m5665w = m5665w(cursor, this.f4691J);
            }
            if (TextUtils.isEmpty(m5665w)) {
                TextView textView = aVar.f4696a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f4696a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f4696a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f4696a.setMaxLines(1);
                }
            }
            m5667z(aVar.f4697b, m5665w);
        }
        ImageView imageView = aVar.f4698c;
        if (imageView != null) {
            m5666y(imageView, m5663t(cursor), 4);
        }
        ImageView imageView2 = aVar.f4699d;
        if (imageView2 != null) {
            m5666y(imageView2, m5664u(cursor), 8);
        }
        int i13 = this.f4688G;
        if (i13 != 2 && (i13 != 1 || (i11 & 1) == 0)) {
            aVar.f4700e.setVisibility(8);
            return;
        }
        aVar.f4700e.setVisibility(0);
        aVar.f4700e.setTag(aVar.f4696a.getText());
        aVar.f4700e.setOnClickListener(this);
    }

    @Override // p311l1.AbstractC21995a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            View mo114871g = mo114871g(this.f108355s, this.f108354r, viewGroup);
            if (mo114871g != null) {
                ((a) mo114871g.getTag()).f4696a.setText(e11.toString());
            }
            return mo114871g;
        }
    }

    @Override // p311l1.AbstractC21995a, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            View mo5672h = mo5672h(this.f108355s, this.f108354r, viewGroup);
            if (mo5672h != null) {
                ((a) mo5672h.getTag()).f4696a.setText(e11.toString());
            }
            return mo5672h;
        }
    }

    @Override // p311l1.AbstractC21997c, p311l1.AbstractC21995a
    /* renamed from: h */
    public View mo5672h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo5672h = super.mo5672h(context, cursor, viewGroup);
        mo5672h.setTag(new a(mo5672h));
        ((ImageView) mo5672h.findViewById(AbstractC19183f.edit_query)).setImageResource(this.f4686E);
        return mo5672h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m5654B(mo114869d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m5654B(mo114869d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4682A.m5365W((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m5673r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f108355s.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: v */
    Cursor m5674v(SearchableInfo searchableInfo, String str, int i11) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i11 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i11));
        }
        return this.f108355s.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m5675x(int i11) {
        this.f4688G = i11;
    }
}
