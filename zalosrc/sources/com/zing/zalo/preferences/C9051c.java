package com.zing.zalo.preferences;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p062db.PreferencesProvider;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import ho0.AbstractC20110a;
import java.util.HashSet;
import su.C26388b;

/* renamed from: com.zing.zalo.preferences.c */
/* loaded from: classes.dex */
public class C9051c implements IPreferences {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:            if (r0.isClosed() == false) goto L19;     */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo48440a(String str) {
        System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                cursor = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(PreferencesProvider.f43163r, str), C7962g.b.f43291a, null, null, null, false);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (cursor != null) {
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                long parseLong = Long.parseLong(cursor.getString(cursor.getColumnIndex("value")));
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                return parseLong;
            }
            throw new IPreferences.PreferencesExceptionNotFound();
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:            if (r0.isClosed() == false) goto L19;     */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo48441b(String str) {
        System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                cursor = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(PreferencesProvider.f43163r, str), C7962g.b.f43291a, null, null, null, false);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (cursor != null) {
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                int parseInt = Integer.parseInt(cursor.getString(cursor.getColumnIndex("value")));
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                return parseInt;
            }
            throw new IPreferences.PreferencesExceptionNotFound();
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: c */
    public void mo48442c(String str, String str2) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", str2);
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 3);
            if (C26388b.m135979e(MainApplication.getAppContext(), PreferencesProvider.f43162q, contentValues, false) != null) {
                AbstractC20110a.m104535d("setStringValue [%s - %s] in %dms", str, str2, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: d */
    public void mo48443d(String str, int i11) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", Integer.valueOf(i11));
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 0);
            if (C26388b.m135979e(MainApplication.getAppContext(), PreferencesProvider.f43162q, contentValues, false) != null) {
                AbstractC20110a.m104535d("setIntValue [%s - %s] in %dms", str, Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:            if (r0.isClosed() == false) goto L19;     */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo48444e(String str) {
        System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                cursor = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(PreferencesProvider.f43163r, str), C7962g.b.f43291a, null, null, null, false);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (cursor != null) {
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                String string = cursor.getString(cursor.getColumnIndex("value"));
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                return string;
            }
            throw new IPreferences.PreferencesExceptionNotFound();
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: f */
    public boolean mo48445f(String str) {
        System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                cursor = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(PreferencesProvider.f43163r, str), C7962g.b.f43291a, null, null, null, false);
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        if (!cursor.isClosed()) {
                            cursor.close();
                            return true;
                        }
                        return true;
                    }
                }
                if (cursor == null || cursor.isClosed()) {
                    return false;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (cursor == null || cursor.isClosed()) {
                    return false;
                }
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:            if (r0.isClosed() == false) goto L22;     */
    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo48446g(String str) {
        boolean z11;
        System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                cursor = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(PreferencesProvider.f43163r, str), C7962g.b.f43291a, null, null, null, false);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (cursor != null) {
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                if (Integer.parseInt(cursor.getString(cursor.getColumnIndex("value"))) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                return z11;
            }
            throw new IPreferences.PreferencesExceptionNotFound();
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: h */
    public void mo48447h(String str, long j11) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", Long.valueOf(j11));
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 1);
            if (C26388b.m135979e(MainApplication.getAppContext(), PreferencesProvider.f43162q, contentValues, false) != null) {
                AbstractC20110a.m104535d("setLongValue [%s - %s] in %dms", str, Long.valueOf(j11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: i */
    public void mo48448i(String str, boolean z11) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", Boolean.valueOf(z11));
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 2);
            if (C26388b.m135979e(MainApplication.getAppContext(), PreferencesProvider.f43162q, contentValues, false) != null) {
                AbstractC20110a.m104535d("setBoolValue [%s - %s] in %dms", str, Boolean.valueOf(z11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    public void m48469j(IPreferences iPreferences, HashSet hashSet) {
        int i11;
        boolean z11;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC20110a.m104535d("preload all preferences...", new Object[0]);
            Cursor m135984j = C26388b.m135984j(MainApplication.getAppContext(), PreferencesProvider.f43162q, C7962g.b.f43291a, "((type=3) OR type!=3)", null, "last_update DESC", false);
            if (m135984j != null && m135984j.getCount() > 0 && m135984j.moveToFirst()) {
                int columnIndexOrThrow = m135984j.getColumnIndexOrThrow("key");
                int columnIndexOrThrow2 = m135984j.getColumnIndexOrThrow("value");
                int columnIndexOrThrow3 = m135984j.getColumnIndexOrThrow(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                i11 = 0;
                do {
                    int i12 = m135984j.getInt(columnIndexOrThrow3);
                    String string = m135984j.getString(columnIndexOrThrow);
                    i11++;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    String string2 = m135984j.getString(columnIndexOrThrow2);
                                    if (string2 != null && string2.length() <= 100) {
                                        iPreferences.mo48442c(string, string2);
                                    } else {
                                        hashSet.add(string);
                                    }
                                }
                            } else {
                                if (m135984j.getInt(columnIndexOrThrow2) > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                iPreferences.mo48448i(string, z11);
                            }
                        } else {
                            iPreferences.mo48447h(string, m135984j.getLong(columnIndexOrThrow2));
                        }
                    } else {
                        iPreferences.mo48443d(string, m135984j.getInt(columnIndexOrThrow2));
                    }
                    if (i11 > 5000) {
                        break;
                    }
                } while (m135984j.moveToNext());
            } else {
                i11 = 0;
            }
            if (m135984j != null) {
                m135984j.close();
            }
            AbstractC20110a.m104535d("preload all preferences %d items in %dms", Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
