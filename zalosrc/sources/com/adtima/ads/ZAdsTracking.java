package com.adtima.ads;

import com.adtima.Adtima;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p009a3.C0098c;
import p227i3.C20217u;
import p309l.C21976d;
import p309l.EnumC21975c;
import p313l3.AbstractC22011d;
import p335m.C22694a;

/* loaded from: classes2.dex */
public class ZAdsTracking {
    private static final String TAG = "ZAdsTracking";
    private static ZAdsTracking mInstance;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.ads.ZAdsTracking$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C37361 {
        static final /* synthetic */ int[] $SwitchMap$com$brains$daast$DAASTEvent;

        static {
            int[] iArr = new int[EnumC21975c.values().length];
            $SwitchMap$com$brains$daast$DAASTEvent = iArr;
            try {
                iArr[EnumC21975c.firstQuartile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$brains$daast$DAASTEvent[EnumC21975c.midpoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$brains$daast$DAASTEvent[EnumC21975c.thirdQuartile.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$brains$daast$DAASTEvent[EnumC21975c.complete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ZAdsAudioTracking {
        private C21976d mDaastModel;
        private boolean mIsAdBackup;
        private HashMap<EnumC21975c, Boolean> mCalledEvent = null;
        private HashMap<Integer, Boolean> mCalledProgress = null;
        private HashMap<EnumC21975c, List<EnumC21975c>> mEventBackward = null;

        private ZAdsAudioTracking(C21976d c21976d, boolean z11) {
            this.mDaastModel = c21976d;
            this.mIsAdBackup = z11;
            cleanUpEvent();
            initEvent();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x007e A[ADDED_TO_REGION, LOOP:1: B:40:0x007e->B:45:0x008c, LOOP_START, PHI: r1
  0x007e: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:39:0x007c, B:45:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void checkBackwardEventAfterCalled(EnumC21975c enumC21975c, String str) {
            int i11;
            int i12;
            int i13;
            C21976d c21976d;
            List<EnumC21975c> list;
            try {
                HashMap<EnumC21975c, List<EnumC21975c>> hashMap = this.mEventBackward;
                if (hashMap != null && hashMap.containsKey(enumC21975c) && (list = this.mEventBackward.get(enumC21975c)) != null && list.size() != 0) {
                    for (EnumC21975c enumC21975c2 : list) {
                        Boolean bool = this.mCalledEvent.get(enumC21975c2);
                        if (bool != null && bool.booleanValue()) {
                        }
                        doEventOnly(enumC21975c2, str);
                        markEventAfterCalled(enumC21975c2);
                    }
                }
                try {
                    c21976d = this.mDaastModel;
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsTracking.TAG, "checkBackwardEventAfterCalled", e11);
                }
                if (c21976d != null) {
                    i11 = AbstractC22011d.m114901b(c21976d.m114765o());
                    i12 = C37361.$SwitchMap$com$brains$daast$DAASTEvent[enumC21975c.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            i11 /= 2;
                        } else if (i12 == 3) {
                            i11 *= 3;
                        } else if (i12 != 4) {
                            i13 = 0;
                            if (i13 <= 0) {
                                for (int i14 = 0; i14 <= i13; i14++) {
                                    if (!isEventProgressCalled(i14)) {
                                        doProgressOnly(i14, str);
                                        markEventProgressAfterCalled(i14);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        i13 = i11 / 1000;
                        if (i13 <= 0) {
                        }
                    }
                    i11 /= 4;
                    i13 = i11 / 1000;
                    if (i13 <= 0) {
                    }
                }
                i11 = 0;
                i12 = C37361.$SwitchMap$com$brains$daast$DAASTEvent[enumC21975c.ordinal()];
                if (i12 != 1) {
                }
                i11 /= 4;
                i13 = i11 / 1000;
                if (i13 <= 0) {
                }
            } catch (Exception e12) {
                Adtima.m18329e(ZAdsTracking.TAG, "checkBackwardEventAfterCalled", e12);
            }
        }

        public static ZAdsAudioTracking createInstance(C21976d c21976d, boolean z11) {
            return new ZAdsAudioTracking(c21976d, z11);
        }

        private void doEventOnly(EnumC21975c enumC21975c, String str) {
            try {
                HashMap m114770t = this.mDaastModel.m114770t();
                if (m114770t != null) {
                    hitTrackingEvent((List) m114770t.get(enumC21975c), str);
                }
            } catch (Exception unused) {
            }
        }

        private void doProgressOnly(int i11, String str) {
            try {
                HashMap m114774x = this.mDaastModel.m114774x();
                if (m114774x == null || isEventProgressCalled(i11)) {
                    return;
                }
                hitTrackingEvent((List) m114774x.get(Integer.valueOf(i11)), str);
            } catch (Exception unused) {
            }
        }

        private void hitTrackingEvent(List<String> list, String str) {
            if (list != null) {
                try {
                    if (list.isEmpty() || this.mIsAdBackup) {
                        return;
                    }
                    C20217u.m105538N0().m105596X(list, str);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsTracking.TAG, "hitTrackingEvent", e11);
                }
            }
        }

        private void initEvent() {
            try {
                if (this.mEventBackward == null) {
                    HashMap<EnumC21975c, List<EnumC21975c>> hashMap = new HashMap<>();
                    this.mEventBackward = hashMap;
                    EnumC21975c enumC21975c = EnumC21975c.creativeView;
                    EnumC21975c enumC21975c2 = EnumC21975c.start;
                    EnumC21975c enumC21975c3 = EnumC21975c.firstQuartile;
                    hashMap.put(enumC21975c3, Arrays.asList(enumC21975c, enumC21975c2));
                    HashMap<EnumC21975c, List<EnumC21975c>> hashMap2 = this.mEventBackward;
                    EnumC21975c enumC21975c4 = EnumC21975c.midpoint;
                    hashMap2.put(enumC21975c4, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3));
                    HashMap<EnumC21975c, List<EnumC21975c>> hashMap3 = this.mEventBackward;
                    EnumC21975c enumC21975c5 = EnumC21975c.thirdQuartile;
                    hashMap3.put(enumC21975c5, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3, enumC21975c4));
                    this.mEventBackward.put(EnumC21975c.complete, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3, enumC21975c4, enumC21975c5));
                }
            } catch (Exception unused) {
            }
        }

        private boolean isEventProgressCalled(int i11) {
            try {
                Boolean bool = this.mCalledProgress.get(Integer.valueOf(i11));
                if (bool != null) {
                    if (bool.booleanValue()) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }

        private void markEventAfterCalled(EnumC21975c enumC21975c) {
            try {
                HashMap<EnumC21975c, Boolean> hashMap = this.mCalledEvent;
                if (hashMap != null) {
                    hashMap.put(enumC21975c, Boolean.TRUE);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsTracking.TAG, "markEventAfterCalled", e11);
            }
        }

        private void markEventProgressAfterCalled(int i11) {
            try {
                HashMap<Integer, Boolean> hashMap = this.mCalledProgress;
                if (hashMap != null) {
                    hashMap.put(Integer.valueOf(i11), Boolean.TRUE);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsTracking.TAG, "markEventProgressAfterCalled", e11);
            }
        }

        public void cleanUpEvent() {
            HashMap<EnumC21975c, Boolean> hashMap = this.mCalledEvent;
            if (hashMap == null) {
                this.mCalledEvent = new HashMap<>();
                this.mCalledProgress = new HashMap<>();
            } else {
                hashMap.clear();
                this.mCalledProgress.clear();
            }
        }

        public void doAdsClickTrack(String str) {
            try {
                C22694a m114758h = this.mDaastModel.m114758h();
                if (m114758h == null || this.mIsAdBackup) {
                    return;
                }
                C20217u.m105538N0().m105596X(m114758h.m117374d(), str);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsTracking.TAG, "doAdsClickTrack", e11);
            }
        }

        public void doAdsEvent(EnumC21975c enumC21975c, String str) {
            try {
                doEventOnly(enumC21975c, str);
                markEventAfterCalled(enumC21975c);
                checkBackwardEventAfterCalled(enumC21975c, str);
            } catch (Exception unused) {
            }
        }

        public void doAdsImpression(String str) {
            try {
                hitTrackingEvent(this.mDaastModel.m114771u(), str);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsTracking.TAG, "doAdsImpression", e11);
            }
        }

        public void doAdsProgress(int i11, String str) {
            try {
                doProgressOnly(i11, str);
                markEventProgressAfterCalled(i11);
            } catch (Exception unused) {
            }
        }

        public void doAdsTarget(C0098c c0098c, String str) {
            String m117372a;
            try {
                C22694a m114758h = this.mDaastModel.m114758h();
                if (m114758h == null || (m117372a = m114758h.m117372a()) == null || m117372a.length() == 0) {
                    return;
                }
                C20217u.m105538N0().m105616w(c0098c, m117372a, str);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsTracking.TAG, "doAdsTarget", e11);
            }
        }
    }

    private ZAdsTracking() {
    }

    private synchronized void checkIfHaveInventory(String str) {
        try {
            C20217u.m105538N0().m105595W(str, false);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveInventory", e11);
        }
    }

    public static ZAdsTracking getInstance() {
        if (mInstance == null) {
            mInstance = new ZAdsTracking();
        }
        return mInstance;
    }

    public void haveAdsInventory(String str) {
        try {
            checkIfHaveInventory(str);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "haveAdsInventory", e11);
        }
    }

    private synchronized void checkIfHaveInventory(ArrayList<String> arrayList) {
        try {
            if (arrayList != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(next);
                    }
                    if (sb2.length() != 0) {
                        C20217u.m105538N0().m105595W(sb2.toString(), false);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(TAG, "checkIfHaveInventory", e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void haveAdsInventory(ArrayList<String> arrayList) {
        try {
            checkIfHaveInventory(arrayList);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "haveAdsInventory", e11);
        }
    }
}
