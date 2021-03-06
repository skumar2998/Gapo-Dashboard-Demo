package com.kienht.gapo.dashboard.domain.usecase.news

import com.kienht.gapo.dashboard.domain.usecase.news.model.NewsFeeds
import com.kienht.gapo.dashboard.domain.usecase.news.repository.DashboardRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * @author kienht
 */
class FetchNewsFeedsListUseCase @Inject constructor(
    private val dashboardRepository: DashboardRepository
) {

    operator fun invoke(): Flow<List<NewsFeeds>> {
        return dashboardRepository.newsFeedsFlow()
    }
}